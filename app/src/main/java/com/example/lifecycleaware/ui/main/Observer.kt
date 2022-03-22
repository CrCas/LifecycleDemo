package com.example.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.example.lifecycleaware.ui.main.MainViewModel

class Observer: LifecycleObserver{

    private val LOG_TAG = "Observer"
    private var mv = MainViewModel

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        // Log.i(LOG_TAG, "onResume")
        mv.addMsg("OnResume was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        // Log.i(LOG_TAG, "onPause")
        mv.addMsg("OnPause was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        // Log.i(LOG_TAG, "onCreate")
        mv.addMsg("OnCreate was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        // Log.i(LOG_TAG, "onStart")
        mv.addMsg("OnStart was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
       // Log.i(LOG_TAG, "onStop")
        mv.addMsg("OnStop was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
      //  Log.i(LOG_TAG, "onDestroy")
        mv.addMsg("OnDestory was fired")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(owner: LifecycleOwner, event: Lifecycle.Event) {
        Log.i(LOG_TAG, owner.lifecycle.currentState.name)
    }
}