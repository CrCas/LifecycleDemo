package com.example.lifecycleaware.ui.main

import androidx.core.content.PackageManagerCompat.LOG_TAG
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun displayLogcatObserver(): MutableLiveData<String>{
        return message
    }

    companion object {

        private var message: MutableLiveData<String> = MutableLiveData()

        private var mess = ""
        fun addMsg(msg: String) {
            mess += msg
            message.setValue(mess)
        }
    }
}
