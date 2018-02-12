package org.buffer.android.boilerplate.ui.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
//import org.buffer.android.boilerplate.data.executor.JobExecutor
import {{ cookiecutter.package_name }}.domain.executor.PostExecutionThread
import {{ cookiecutter.package_name }}.domain.executor.ThreadExecutor
import {{ cookiecutter.package_name }}.ui.BuildConfig
import {{ cookiecutter.package_name }}.ui.UiThread
import {{ cookiecutter.package_name }}.ui.injection.scopes.PerApplication

/**
 * Module used to provide dependencies at an application-level.
 */
@Module
open class ApplicationModule {

    @Provides
    @PerApplication
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @PerApplication
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @PerApplication
    internal fun providePostExecutionThread(uiThread: UiThread): PostExecutionThread {
        return uiThread
    }
}
