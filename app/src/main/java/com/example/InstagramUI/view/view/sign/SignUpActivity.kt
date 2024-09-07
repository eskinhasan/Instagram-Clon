package com.example.InstagramUI.view.view.sign

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.InstagramUI.R
import com.example.InstagramUI.databinding.ActivitySignupBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags (
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        )
        findViewById<TextView>(R.id.SignUp).setOnClickListener {
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }




    }
}