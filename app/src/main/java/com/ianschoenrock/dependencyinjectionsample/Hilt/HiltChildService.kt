package com.ianschoenrock.dependencyinjectionsample.Hilt

import javax.inject.Inject

class HiltChildService @Inject constructor() {
    fun getChildData():String{
        return "Child Hilt Data Received"
    }
}