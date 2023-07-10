package com.navjot_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //variable declaration..
    var etName:EditText?=null
    var etRollno:EditText?=null
    var etYourself:EditText?=null
    var btnValidate:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initalization of declare varaible
        etName=findViewById(R.id.etName)
        etRollno=findViewById(R.id.etRollno)
        etYourself=findViewById(R.id.etYourself)
        btnValidate=findViewById(R.id.btnValidate)
        btnValidate?.setOnClickListener {
            if(etName?.text.toString().isNullOrEmpty())
            {
                etName?.error="Enter your Name"
            }
            else if(etRollno?.text?.toString().isNullOrEmpty())
            {
                etRollno?.error="Enter your rollno "
            }
            if(etYourself?.text.toString().isNullOrEmpty())
            {
                etYourself?.error="Enter about your self"
            }
            else{
                Toast.makeText(this,"validation completed",Toast.LENGTH_SHORT).show()
            }
            //var intent=Intent(ihis,SecondActivity::class.java)
            //startActivity(intent)

        }

    }
}