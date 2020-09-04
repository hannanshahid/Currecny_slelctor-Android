package com.aliabbas.currecny_slelctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mynameismidori.currencypicker.CurrencyPicker
import com.mynameismidori.currencypicker.CurrencyPickerListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pickerFragment = CurrencyPicker()
        pickerFragment.setListener { name, code, dialcode, flagid ->

            Toast.makeText(this,"name: $name  code: $code dialcode: $dialcode",Toast.LENGTH_LONG).show()
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.currencyframelyout, pickerFragment).commit()
    }
}