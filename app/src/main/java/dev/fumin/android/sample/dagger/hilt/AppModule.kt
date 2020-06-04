package dev.fumin.android.sample.dagger.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Named("app")
    @Provides
    @Singleton
    fun provideDependence(): Dependence = Dependence()

}
