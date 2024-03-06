package com.example.myapplication

// DisplayFragment.kt
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.myapplication.DisplayFragmentArgs


class DisplayFragment : Fragment() {
    private lateinit var textViewName: TextView
    private lateinit var textViewGender: TextView
    private lateinit var textViewDepartment: TextView

    // Menerima data dari FormFragment menggunakan navArgs
    private val args: DisplayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_display, container, false)

        textViewName = view.findViewById(R.id.textViewName)
        textViewGender = view.findViewById(R.id.textViewGender)
        textViewDepartment = view.findViewById(R.id.textViewDepartment)

        // Set data yang diterima dari FormFragment ke TextViews
        textViewName.text = "Nama: ${args.name}"
        textViewGender.text = "Jenis Kelamin: ${args.gender}"
        textViewDepartment.text = "Jurusan: ${args.department}"

        return view
    }
}

