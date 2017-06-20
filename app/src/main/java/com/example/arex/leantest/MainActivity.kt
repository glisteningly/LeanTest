package com.example.arex.leantest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.avos.avoscloud.AVException
import com.avos.avoscloud.AVObject
import com.avos.avoscloud.SaveCallback
import com.example.arex.leantest.utils.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        button.setText(R.string.main_btn)
        button.setOnClickListener { toast("Click") }

        val testObject = AVObject("TestObject")
        testObject.put("words","Hello Kotlin!")
        testObject.saveInBackground(object : SaveCallback() {
            override fun done(e: AVException?) {
                if (e == null) {
                    Log.d("saved", "success!")
                }
            }
        })
    }
}
