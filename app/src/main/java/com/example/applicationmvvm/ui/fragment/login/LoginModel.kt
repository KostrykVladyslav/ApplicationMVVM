package com.example.applicationmvvm.ui.fragment.login

import androidx.databinding.ObservableField

data class LoginModel(
    var login: String = "",
    val loginErrorRes: ObservableField<Int> = ObservableField()
)