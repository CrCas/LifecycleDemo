package com.example.lifecycleaware.ui.main

import androidx.core.content.PackageManagerCompat.LOG_TAG
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val displayLogcatObserver = LOG_TAG
    get() = displayLogcatObserver
}