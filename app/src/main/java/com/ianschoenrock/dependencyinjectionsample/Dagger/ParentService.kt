package com.ianschoenrock.dependencyinjectionsample.Dagger

import javax.inject.Inject

class ParentService @Inject constructor(private val childService: ChildService){
    fun getParentData(): String{
        return "Parent Data Received, ${childService.getChildData()}"
    }
}