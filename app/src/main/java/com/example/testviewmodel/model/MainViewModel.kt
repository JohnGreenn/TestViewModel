package com.example.testviewmodel.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(countReserved: Int) : ViewModel() {
    val counter : LiveData<Int>
        get() = _counter

    private val _counter = MutableLiveData<Int>() //外部不可见,保证viewmodel的封装性

    init {
        _counter.value = countReserved
    }

    fun plusOne() {
        val count = counter.value ?:0
        _counter.value = count + 1
    }

    fun clear() {
        _counter.value = 0
    }
}