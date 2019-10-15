package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.dialog_about.*
import kotlinx.android.synthetic.main.dialog_about.view.*
import kotlinx.android.synthetic.main.wrong_credentials.view.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnLogout.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnAbout.setOnClickListener{
            val DialogView = layoutInflater.inflate(R.layout.dialog_about, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(DialogView).setTitle("About").show()
            DialogView.btnCloseAbout.setOnClickListener{
                mBuilder.dismiss()
            }
            DialogView.btnGithub.setOnClickListener {
                mBuilder.dismiss()
                btnAbout.isVisible = false
                btnCheck.isVisible = false
                btnCars.isVisible = false
                btnLogout.isVisible = false
                webview.loadUrl("https://github.com/eagleera")
            }
        }
        btnCars.setOnClickListener{
            val intent = Intent(this, Cars::class.java)
            startActivity(intent)
        }
        btnCheck.setOnClickListener {
            val intent = Intent(this, Cars::class.java)
            startActivity(intent)
        }
    }
}
