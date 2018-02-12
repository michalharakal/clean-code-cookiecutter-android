package {{ cookiecutter.package_name }}.ui.injection.scopes

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerApplication