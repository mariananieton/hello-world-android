package com.example.helloworld

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate (layoutInflater)
        val view = binding.root
        setContentView (view)
        var btnCalcular = findViewById<Button>(binding.idButton.id)

        btnCalcular.setOnClickListener { view: View? ->
                var salario = binding.txtNome.text.toString().toInt()
                var mensagem = ""
            if (salario >= 1300) {
                mensagem = "Você vai pagar 40% de imposto"
            } else if (salario < 1300) {
                mensagem = "Você não paga imposto"
            } else {
                mensagem = "Tanto faz"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
            }
    }
}