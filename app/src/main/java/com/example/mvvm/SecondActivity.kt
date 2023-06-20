package com.example.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        var viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        var data = Person("Ashish","Rajeev","Ranjan")

        binding.person = data
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

//        binding.apply {
//            firstText.text = "Ashish"
//            secondtext.text = "Rajeev"
//            thirdText.text = "Ranjan"
//        }


    }


}