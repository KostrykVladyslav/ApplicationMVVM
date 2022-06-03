package com.example.applicationmvvm.ui.fragment.ext

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("error")
fun TextInputLayout.setError(valueRes: Int?) {
    valueRes?.let {
        val value = context.getString(valueRes)
        if (error != value) {
            error = value
        }
    }
}