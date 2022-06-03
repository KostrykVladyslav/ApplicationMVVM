package com.example.applicationmvvm.ui.fragment.login

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import com.example.applicationmvvm.R
import com.example.applicationmvvm.databinding.FragmentLoginBinding
import com.example.applicationmvvm.ui.fragment.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment :
    BaseFragment<FragmentLoginBinding>(contentLayoutID = R.layout.fragment_login) {

    private val viewModel: LoginViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.model = viewModel.model
        binding.presenter = viewModel
    }

    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::handleNavigate)
    }

    private fun handleNavigate(navDirections: NavDirections) {
        navigate(direction = navDirections)
    }
}