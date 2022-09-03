package com.ianschoenrock.dependencyinjectionsample.Hilt

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

//This class was made to exemplify how easy it is to inject context into a service.
//Be careful using this though, using context outside of android framework specific classes
// can cause tight coupling, architecture fails, and be harder to unit test. Use this when
// absolutely necessary and try to keep it out of the view model when possible
class HiltContextService @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getContext(): String = "Context check: $context"
}