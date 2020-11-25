package com.ianschoenrock.dependencyinjectionsample.Dagger

import javax.inject.Inject

class ChildService @Inject constructor() {
    fun getChildData(): String{
        return "Child Data Received"
    }
}