package com.tuvv.utils.log

import android.util.Log

class MessageAndroidLog: IMessageOutput {
    override fun sendMessage(type: String, tag: String, msg: String) {
        when (type) {
            "i" -> Log.i(tag, msg)
            "v" -> Log.v(tag, msg)
            "d" -> Log.d(tag, msg)
            "e" -> Log.e(tag, msg)
        }
    }
}