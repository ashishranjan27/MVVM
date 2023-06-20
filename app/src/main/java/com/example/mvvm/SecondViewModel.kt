package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {
    var viewModel = MutableLiveData("check")

    fun setData(){
        viewModel.value = "value is 3rd"
    }

}