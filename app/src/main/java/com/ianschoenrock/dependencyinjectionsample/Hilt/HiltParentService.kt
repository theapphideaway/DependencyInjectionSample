package com.ianschoenrock.dependencyinjectionsample.Hilt

import com.ianschoenrock.dependencyinjectionsample.Dagger.ChildService
import javax.inject.Inject

class HiltParentService @Inject constructor(private val childService: ChildService) {
    fun getParentData():String {
        return "Parent Hilt Data Received, ${childService.getChildData()}"
    }
}