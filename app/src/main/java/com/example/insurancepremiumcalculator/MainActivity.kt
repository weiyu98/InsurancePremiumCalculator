package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            textView4.text = getPremium().toString()

        }
        button3.setOnClickListener(){
            spinner.setSelection(0)
            radioGroup.clearCheck()
        }

    }
    fun getPremium():Double{
        return when (spinner.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 + (if (radioMale.isChecked) 50.00 else 0.00) + (if (checkBox.isChecked) 100.00 else 0.00)
            2 -> 90.00 + (if (radioMale.isChecked) 100.00 else 0.00) + (if (checkBox.isChecked) 150.00 else 0.00)
            3 -> 120.00 + (if (radioMale.isChecked) 150.00 else 0.00) + (if (checkBox.isChecked) 200.00 else 0.00)
            4 -> 150.00 + (if (radioMale.isChecked) 200.00 else 0.00) + (if (checkBox.isChecked) 250.00 else 0.00)
            else -> 150.00 + (if (radioMale.isChecked) 200.00 else 0.00) + (if (checkBox.isChecked) 300.00 else 0.00)
        }
    }

}
