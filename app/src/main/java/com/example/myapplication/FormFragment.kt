package com.example.myapplication

// FormFragment.kt
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import androidx.navigation.fragment.findNavController

class FormFragment : Fragment() {
    private lateinit var editTextName: EditText
    private lateinit var checkBoxMale: CheckBox
    private lateinit var radioButtonFemale: RadioButton
    private lateinit var spinnerDepartment: Spinner
    private lateinit var buttonSubmit: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        editTextName = view.findViewById(R.id.editTextName)
        checkBoxMale = view.findViewById(R.id.checkBoxMale)
        radioButtonFemale = view.findViewById(R.id.radioButtonFemale)
        spinnerDepartment = view.findViewById(R.id.spinnerDepartment)
        buttonSubmit = view.findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            // Dapatkan data dari formulir
            val name = editTextName.text.toString()
            val gender = if (checkBoxMale.isChecked) "Laki-laki" else "Perempuan"
            val department = spinnerDepartment.selectedItem.toString()

            // Gunakan Intent untuk berpindah ke halaman kedua dan kirimkan data
            val action = FormFragmentDirections.actionFormToDisplay(name, gender, department)
            findNavController().navigate(action)
        }

        return view
    }
}
