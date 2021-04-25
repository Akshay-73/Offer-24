package com.pstlservices.offers24.dagger.component

import android.app.Activity
import com.pstlservices.offers24.dagger.scope.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent


@ActivityScope
@Subcomponent
interface ActivityComponent {
    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun activity(activity: Activity): Builder
        fun build(): ActivityComponent
    }
}