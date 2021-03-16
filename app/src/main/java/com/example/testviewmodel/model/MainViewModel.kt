package com.example.testviewmodel.model

import androidx.lifecycle.ViewModel

class MainViewModel(countReserved: Int) : ViewModel() {
    var  counter = countReserved
}