package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val gender = if (checkBoxMale.isChecked) "Laki-laki" else "Perempuan"
            val department = spinnerDepartment.selectedItem.toString()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("GENDER", gender)
            intent.putExtra("DEPARTMENT", department)
            startActivity(intent)
        }
    }
}
