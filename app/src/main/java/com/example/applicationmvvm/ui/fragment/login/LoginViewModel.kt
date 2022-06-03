package com.example.applicationmvvm.ui.fragment.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import com.example.applicationmvvm.R
import com.example.applicationmvvm.ui.fragment.base.BaseViewModel

class LoginViewModel : BaseViewModel(), LoginPresenter {

    val model: LoginModel = LoginModel()

    private val _navigate = MutableLiveData<NavDirections>()
    val navigate: LiveData<NavDirections> = _navigate

    override fun onLoginClick() {
        if (model.login.isNotEmpty()) {
            _navigate.value = LoginFragmentDirections.actionLoginFragmentToMainFragment(
                login = model.login
            )
        } else {
            model.loginErrorRes.set(R.string.empty_field_label)
        }
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        model.login = s.toString()
    }
}