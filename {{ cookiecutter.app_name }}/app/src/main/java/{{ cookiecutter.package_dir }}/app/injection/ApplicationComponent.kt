package {{ cookiecutter.package_name }}.ui.injection

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import {{ cookiecutter.package_name }}.ui.{{ cookiecutter.app_name | title }}Application
import {{ cookiecutter.package_name }}.ui.injection.module.ActivityBindingModule
import {{ cookiecutter.package_name }}.ui.injection.module.ApplicationModule
import {{ cookiecutter.package_name }}.ui.injection.scopes.PerApplication

@PerApplication
@Component(modules = arrayOf(ActivityBindingModule::class, ApplicationModule::class,
        AndroidSupportInjectionModule::class))
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(app: {{ cookiecutter.app_name | title }}Application)

}
