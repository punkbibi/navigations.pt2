package com.example.bottomnavigation_part2.fragmrntulikebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation_part2.R

class f1:Fragment(R.layout.fragment_1) {
    lateinit var button: Button
    lateinit var editText: EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            val text = editText.text.toString()
            val action = f1Directions.actionHomeToNotifi(text)
            findNavController().navigate(action)
        }

    }
}