package br.com.artstar10.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var mContador = MutableLiveData<String>().apply { value  = "0" }
}