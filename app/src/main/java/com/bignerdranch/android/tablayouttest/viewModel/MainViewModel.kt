package com.bignerdranch.android.tablayouttest.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.tablayouttest.PlantModel

class MainViewModel : ViewModel() {
    val plant = MutableLiveData<PlantModel>()
}