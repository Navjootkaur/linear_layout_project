package com.navjot_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //variable declaration..
    var etName: EditText? = null
    var etRollno: EditText? = null
    var etYourself: EditText? = null
    var btnValidate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initalization of declare varaible
        etName = findViewById(R.id.etName)
        etRollno = findViewById(R.id.etRollno)
        etYourself = findViewById(R.id.etYourself)
        btnValidate = findViewById(R.id.btnValidate)
        btnValidate?.setOnClickListener {
            if (etName?.text.toString().isNullOrEmpty()) {
                etName?.error = "Enter your Name"
            } else if (etRollno?.text?.toString().isNullOrEmpty()) {
                etRollno?.error = "Enter your rollno "
            }
            if (etYourself?.text.toString().isNullOrEmpty()) {
                etYourself?.error = "Enter about your self"
            } else {
                Toast.makeText(this, "validation completed", Toast.LENGTH_SHORT).show()

                var intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                finish()

            }

        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On start called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On resume called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on pause called",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"on stop called",Toast.LENGTH_SHORT).show()

    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"on restart called",Toast.LENGTH_SHORT).show()

    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"on Destroy called",Toast.LENGTH_SHORT).show()

    }

}