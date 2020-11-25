package com.ianschoenrock.dependencyinjectionsample.Hilt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ianschoenrock.dependencyinjectionsample.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//Also added the Main Activity and an entry point
@AndroidEntryPoint
class HiltFragment : Fragment() {

    @Inject lateinit var hiltService: HiltService
    @Inject lateinit var hiltParentService: HiltParentService

    private lateinit var serviceTV: TextView
    private lateinit var nestedServiceTV: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hilt, container, false).apply{

            serviceTV = findViewById(R.id.hilt_service_text_tv)
            nestedServiceTV = findViewById(R.id.hilt_nested_text_tv)
            //Hilt service is ready to go, no need to initialize a component
            //  since this is using constructor injection
            serviceTV.text = hiltService.getData()
            nestedServiceTV.text = hiltParentService.getParentData()
        }
    }
}