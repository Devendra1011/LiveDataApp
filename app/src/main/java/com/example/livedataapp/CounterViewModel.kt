package com.example.livedataapp

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {


    // creating instance of "MutableLivedata" class
    // MutableLiveData: Subclass of 'LiveData' that holds and manages
    // observable data


      var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun incrementCounter(view: View) {
        counter.value = (counter.value)?.plus(1)
    }



}
