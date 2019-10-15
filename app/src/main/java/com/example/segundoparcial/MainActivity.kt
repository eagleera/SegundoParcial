package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.wrong_credentials.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{
            if(editUser.text.toString().equals("segundoparcial")
                && editPwd.text.toString().equals("1")){
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
            }else{
                val DialogView = layoutInflater.inflate(R.layout.wrong_credentials, null)
                val mBuilder = AlertDialog.Builder(this)
                    .setView(DialogView).setTitle("Wrong credentials").show()
                DialogView.btnClose.setOnClickListener{
                    mBuilder.dismiss()
                }
            }
        }
    }
}
