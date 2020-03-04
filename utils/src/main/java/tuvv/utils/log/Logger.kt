package com.tuvv.utils.log

object Logger {

    private var output: IMessageOutput = MessageAndroidLog()

    internal fun debug(tag: String, msg: String) {
        log("d", tag, msg)
    }

    internal fun info(tag: String, msg: String) {
        log("i", tag, msg)
    }

    internal fun error(tag: String, msg: String) {
        log("e", tag, msg)
    }

    fun e(tag: String, msg: String) { log("e", tag, msg) }
    fun w(tag: String, msg: String) { log("w", tag, msg) }
    fun i(tag: String, msg: String) { log("i", tag, msg) }
    fun d(tag: String, msg: String) { log("d", tag, msg) }
    fun v(tag: String, msg: String) { log("v", tag, msg) }

    internal fun log(type:String, tag: String, msg: String) {
        output.sendMessage(type, tag, msg)
    }

    fun setOutput(value: IMessageOutput) {
        output = value;
    }

}