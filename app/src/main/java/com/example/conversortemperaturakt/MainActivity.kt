package com.example.conversortemperaturakt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonConverter.setOnClickListener{ converter(it) }
    }

    fun converter(view: View) {
      var temp: Double = editTemperatura.text.toString().toDouble()

        if(radioCelsius.isChecked){
            temp = ( temp - 32 ) * 5/9
        } else if (radioFahrenheit.isChecked){
            temp = temp * 9/5 + 32
        }
        editTemperatura.setText(temp.toString())

       /* var temperatura: Int = editTemperatura.text.toString().toInt()
        var temp: Int
        if (radioFahrenheit.isChecked) {
            temp = (temperatura - 32) * 5/9
            return editTemperatura.setText(temp)
        } else if (radioCelsius.isChecked) {
            temp = temperatura * 9 / 5 + 32
            return editTemperatura.setText(temp)
        }*/
    }
}
