package com.sideproject.sidus.main

class Presenter(listener: Listener) {
    var mListener = listener

    fun onClick() {
        println(">> Presenter onClick")

        mListener.onClick()
    }
}