package com.example.applicationmvvm.ui.fragment.login

interface LoginPresenter {

    fun onLoginClick()

    fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int)

}