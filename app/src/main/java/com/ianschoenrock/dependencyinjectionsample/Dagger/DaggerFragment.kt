package com.ianschoenrock.dependencyinjectionsample.Dagger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.ianschoenrock.dependencyinjectionsample.Hilt.HiltFragment
import com.ianschoenrock.dependencyinjectionsample.R
import javax.inject.Inject


class DaggerFragment : Fragment() {

    @Inject
    lateinit var service: Service
    @Inject
    lateinit var parentService: ParentService

    private lateinit var serviceTV: TextView
    private lateinit var nestedServiceTV: TextView
    private lateinit var navBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dagger, container, false).apply {
            //Initializing the dagger component for this fragment
            DaggerDaggerComponent.create().inject(this@DaggerFragment)
            //Adding View References
            serviceTV = findViewById(R.id.service_text_tv)
            nestedServiceTV = findViewById(R.id.nested_text_tv)
            navBtn = findViewById(R.id.nav_btn)
            //Using Dependency Injection for a single class object
            serviceTV.text = service.getData()
            // Using Dependency Injection for nested class objects
            nestedServiceTV.text = parentService.getParentData()
            //Setting the Click Listener for the navigation button
            navBtn.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction()
                    .addToBackStack("")
                        //Using a new hilt fragment for each time we navigate to it
                    .replace(R.id.fragment_container, HiltFragment())
                    .commit()
            }
        }
    }
}