package com.bignerdranch.android.tablayouttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bignerdranch.android.tablayouttest.adapter.ViewPagerAdapter
import com.bignerdranch.android.tablayouttest.databinding.FragmentContentBinding
import com.bignerdranch.android.tablayouttest.viewModel.MainViewModel
import com.google.android.material.tabs.TabLayoutMediator

class ContentFragment : Fragment() {

    private lateinit var binding: FragmentContentBinding
    private val viewModel: MainViewModel by activityViewModels()

    private val fragmentsList = listOf<Fragment>(
        InfoFragment.newInstance(),
        UseCaseFragment.newInstance()
    )

    private val fragmentsListTitles = listOf("Описание", "Применение")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ViewPagerAdapter(requireActivity(), fragmentsList)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            tab.text = fragmentsListTitles[pos]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ContentFragment()
    }
}