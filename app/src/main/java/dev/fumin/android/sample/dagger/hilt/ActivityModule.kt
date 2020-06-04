package dev.fumin.android.sample.dagger.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @Provides
    @Named("activity")
    @ActivityScoped
    fun provideDependence(): Dependence = Dependence()

}
