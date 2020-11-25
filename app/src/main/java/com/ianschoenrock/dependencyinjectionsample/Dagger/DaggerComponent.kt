package com.ianschoenrock.dependencyinjectionsample.Dagger

import dagger.Component

@Component
interface DaggerComponent {
    fun inject(daggerFragment: DaggerFragment)
}