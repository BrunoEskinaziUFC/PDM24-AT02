package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var percentual:Double = 0.7
    lateinit var tvVale: TextView
    lateinit var etAlcool: EditText
    lateinit var etGasolina: EditText
    lateinit var swPorcentagem: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvVale = findViewById(R.id.tvVale)
        etAlcool = findViewById(R.id.edAlcool)
        etGasolina = findViewById(R.id.edGasolina)
        swPorcentagem = findViewById(R.id.swPercentual)

        percentual = 0.7

        Log.d("PDM23","No onCreate, $percentual")

        val btCalc: Button = findViewById(R.id.btCalcular)
        btCalc.setOnClickListener(View.OnClickListener {
            //código do evento
            Log.d("PDM23","No btCalcular, $percentual")

            if (etAlcool.text.isNotBlank() and etGasolina.text.isNotBlank()){
                val valorAlcool = etAlcool.text.toString().toDouble()
                val valorGasolina = etGasolina.text.toString().toDouble()
                if (valorGasolina*percentual >= valorAlcool){
                    tvVale.text = "O Álcool tá valendo a pena"
                }else{
                    tvVale.text = "A Gasolina tá valendo a pena"
                }
            }

        })

        swPorcentagem.setOnClickListener{
            if (swPorcentagem.isChecked){
                percentual = 0.75
            }else{
                percentual = 0.7
            }
            swPorcentagem.text = percentual.toString()
        }


    }
override fun onResume(){
    super.onResume()
    Log.d("PDM23","No onResume, $percentual")
}
override fun onStart(){
    super.onStart()
    Log.d("PDM23","No onResume")
}
override fun onPause(){
    super.onPause()
    Log.d("PDM23","No onResume")
}
override fun onStop(){
    super.onStop()
    Log.d("PDM23","No onResume")
}
override fun onDestroy(){
    super.onDestroy()
    Log.d("PDM23","No onResume")
}
}