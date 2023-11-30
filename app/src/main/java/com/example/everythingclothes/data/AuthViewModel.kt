package com.example.everythingclothes.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.everythingclothes.models.Users
import com.example.everythingclothes.navigation.HOME_URL
import com.example.everythingclothes.navigation.LOGIN_URL
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel (var navController:NavController,
                     var context:Context){
    val mAuth:FirebaseAuth
    val progress:ProgressDialog
    init {
        mAuth=FirebaseAuth.getInstance()
        progress= ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait..")
    }
    fun signup(name:String,email:String,password:String){
        progress.show()
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
            var userId =mAuth.currentUser!!.uid
            var userprofile= Users(name,email,password,userId)
//            create a table called users inside of the Firebase database
            var userRef = FirebaseDatabase.getInstance()
                .getReference().child("Users/$userId")
            userRef.setValue(userprofile).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context,"Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(LOGIN_URL)
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    fun login (email:String,password:String){
        progress.show()
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                navController.navigate(HOME_URL)
            }else{
                Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun logout(){
        mAuth.signOut()
        navController.navigate(HOME_URL)
    }
    fun isloggedIn():Boolean=mAuth.currentUser !=null

}