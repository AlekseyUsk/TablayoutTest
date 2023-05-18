package com.bignerdranch.android.tablayouttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.tablayouttest.databinding.FragmentMaimBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMaimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMaimBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMainFr.setOnClickListener {

        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}