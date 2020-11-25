package com.ianschoenrock.dependencyinjectionsample.Dagger

import javax.inject.Inject

class Service @Inject constructor(){
    fun getData(): String{
        return "Data Received!"
    }
}