package com.example.mvvm

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mvvm.databinding.ActivityFourthBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class FourthActivity : AppCompatActivity() , communictaion{

    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        var viewModel = ViewModelProvider(this).get(FourthViewModel::class.java)

        getSupportActionBar()?.hide()

        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.data.observe(this, Observer {
//            Log.d("Ashish","check value is as= "+it)
        })

        viewModel.check()
        Log.d("Ashish","Activity = onCreate")

     //   runBlocking {
//            delay(3000)
            supportFragmentManager.beginTransaction()
                .replace(R.id.firstFrame, FirstFragment())
                .addToBackStack(null)
                .commit()
       // }





    }

    override fun dataPass(data: String) {
        Log.d("Ashish","pass data is as = "+data)
        binding.textViewAct.text = data
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ashish","Activity = onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ashish","Activity = onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ashish","Activity = onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ashish","Activity = onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ashish","Activity = onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ashish","Activity = onRestart")
    }

}