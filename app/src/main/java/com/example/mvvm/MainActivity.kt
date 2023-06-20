package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainViewModel
    lateinit var textView: TextView
    lateinit var incrementButton : Button
    lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(15)).get(MainViewModel::class
            .java)
        textView = findViewById(R.id.number)
        incrementButton = findViewById(R.id.increment)
        resetButton = findViewById(R.id.reset)

        resetButton.setOnClickListener {
             mainViewModel.resetValue()
        }

        incrementButton.setOnClickListener {
            mainViewModel.increment()
        }

        mainViewModel.count.observe(this, Observer {
            textView.text = mainViewModel.count.value.toString()
        })

        GlobalScope.launch {
            val data : Flow<Int> = Producer()
            data.collect{
                Log.d("Ashish","data is "+it)
            }
        }

    }

    suspend fun Producer()= flow{
        Log.d("Ashish","data is as")
        var a = listOf(1,2,56,7)
        a.forEach {
            delay(1000)
            emit(it)
        }
    }

}


