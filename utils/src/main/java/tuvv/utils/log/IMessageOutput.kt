package com.tuvv.utils.log

interface IMessageOutput {
    fun sendMessage(type:String, tag: String, msg: String)
}