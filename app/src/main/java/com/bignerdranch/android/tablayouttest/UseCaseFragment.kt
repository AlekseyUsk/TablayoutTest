package com.bignerdranch.android.tablayouttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bignerdranch.android.tablayouttest.databinding.FragmentContentBinding
import com.bignerdranch.android.tablayouttest.databinding.FragmentInfoBinding
import com.bignerdranch.android.tablayouttest.databinding.FragmentUseCaseBinding
import com.bignerdranch.android.tablayouttest.viewModel.MainViewModel

class UseCaseFragment : Fragment() {

    private lateinit var binding: FragmentUseCaseBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUseCaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = UseCaseFragment()
    }
}