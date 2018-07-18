package com.bananacoding.android.pin_assistant_android.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bananacoding.android.pin_assistant_android.MainApp
import com.bananacoding.android.pin_assistant_android.R
import rx.Observable
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainApp.graph.inject(this)

        val dummyProcessTime = 2L
        Observable.timer(dummyProcessTime, TimeUnit.SECONDS).subscribe {
            startActivity(DemoActivity.getStartIntent(this))
        }

    }
}