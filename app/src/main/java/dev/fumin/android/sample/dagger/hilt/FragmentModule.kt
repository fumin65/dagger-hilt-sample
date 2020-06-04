package dev.fumin.android.sample.dagger.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Named

@Module
@InstallIn(FragmentComponent::class)
object FragmentModule {

    @Provides
    @Named("fragment")
    @FragmentScoped
    fun provideDependence(): Dependence = Dependence()

}
