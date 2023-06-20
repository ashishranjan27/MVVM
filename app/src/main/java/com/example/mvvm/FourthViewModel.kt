package com.example.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FourthViewModel : ViewModel() {

    val inputText = MutableLiveData<String>()

    var data = MutableLiveData<String>()

    fun setData(){
       Log.d("Ashish","called view model = "+inputText.value)
        data.value = inputText.value
    }

    fun check(){
        Log.d("Ashish","check is as "+data.value)
    }
}