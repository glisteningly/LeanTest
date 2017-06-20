package com.example.arex.leantest

import android.app.Application

import com.avos.avoscloud.AVOSCloud

class MyLeanCloudApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this, "IoCtWYqG7soFL0xsuELkjkGO-gzGzoHsz", "nLO6RCS17tyCYjy3Jjo1A6gY")
//        AVOSCloud.setDebugLogEnabled(true)
    }
}