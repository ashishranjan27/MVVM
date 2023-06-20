package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val counter:Int) : ViewModel() {
    private var countViewModel = MutableLiveData(counter)

    val count: LiveData<Int>
    get() = countViewModel

    fun increment() {
        countViewModel.value= count.value?.plus(1)
    }

    fun resetValue(){
        countViewModel.value = 0
    }

}