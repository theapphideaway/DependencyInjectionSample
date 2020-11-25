package com.ianschoenrock.dependencyinjectionsample.Hilt

import javax.inject.Inject

class HiltService @Inject constructor() {
    fun getData():String{
        return "Hilt Data Received"
    }
}