package com.example.toastlibrary

import android.widget.Toast
import android.content.Context

class SToast{
    fun showToast(context : Context){
        Toast.makeText(context, "Button Clicked!!", Toast.LENGTH_LONG).show()
    }
}
