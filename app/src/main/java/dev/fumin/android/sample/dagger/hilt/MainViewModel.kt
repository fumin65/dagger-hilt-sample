package dev.fumin.android.sample.dagger.hilt

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext

class MainViewModel @ViewModelInject constructor(
    @ApplicationContext val appContext: Context,
    @ActivityContext val activityContext: Context
) : ViewModel()
