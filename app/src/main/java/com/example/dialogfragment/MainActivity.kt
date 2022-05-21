package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val builder:AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
            builder.setCancelable(false)
            builder.setTitle("Dialog Box")
            builder.setMessage("Do you want to exit..")
            builder.setPositiveButton("OK!!",{dialog,which->
                Toast.makeText(this@MainActivity,"OK button was clicked",Toast.LENGTH_SHORT).show()
                finish()
            }).setNegativeButton("Cancel",{dialog,which->
                Toast.makeText(this@MainActivity,"Cancel button was clicked",Toast.LENGTH_SHORT).show()
                finish()
            })
            builder.create().show()
        }
    }
}