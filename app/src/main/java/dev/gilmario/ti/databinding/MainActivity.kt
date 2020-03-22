package dev.gilmario.ti.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import dev.gilmario.ti.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener({
            displayGreeting()
        });

    }

    private fun displayGreeting() {
        binding.apply {
            val messageView = greetingTextView
            val nameEditText = nameEditText
            val message = "OI!"+nameText
            messageView.text = message
        }
    }
}
