package com.example.arex.leantest.utils

import android.app.Activity
import android.widget.Toast


/** Activity 拓展 start */
fun Activity.toast(msg:String) {
    Toast.makeText(applicationContext,msg,Toast.LENGTH_SHORT).show()
}

fun Activity.toast(msgId:Int) {
    Toast.makeText(applicationContext,msgId,Toast.LENGTH_SHORT).show()
}


/** Activity 拓展 end */



/** String 拓展 start */

fun String.isEmpty(str:String):Boolean {
    return str == null || str == ""
}

/** String 拓展 end */