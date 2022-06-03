package com.example.applicationmvvm.ui.fragment.splash

import androidx.navigation.NavDirections
import com.example.applicationmvvm.R
import com.example.applicationmvvm.databinding.FragmentLoginBinding
import com.example.applicationmvvm.ui.fragment.base.BaseFragment
import com.example.applicationmvvm.ui.fragment.login.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment :
    BaseFragment<FragmentLoginBinding>(contentLayoutID = R.layout.fragment_splash) {

    private val viewModel: SplashViewModel by viewModel()

    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::handleNavigate)
    }

    private fun handleNavigate(navDirections: NavDirections) {
        navigate(direction = navDirections)
    }
}