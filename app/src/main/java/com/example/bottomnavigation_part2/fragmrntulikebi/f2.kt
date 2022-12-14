package com.example.bottomnavigation_part2.fragmrntulikebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation_part2.R

class f2:Fragment(R.layout.fragment_2) {
    lateinit var editText: EditText
    lateinit var button2: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editTextTextPersonName2)
        button2 = view.findViewById(R.id.button2)
        view.findViewById<TextView>(R.id.textView).text = f2Args.fromBundle(requireArguments()).text

    }
}