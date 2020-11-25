package com.ianschoenrock.dependencyinjectionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ianschoenrock.dependencyinjectionsample.Dagger.Service
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//Needed for using Hilt
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}