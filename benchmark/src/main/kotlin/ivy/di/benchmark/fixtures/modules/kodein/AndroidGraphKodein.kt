package ivy.di.benchmark.fixtures.modules.kodein

import ivy.di.benchmark.fixtures.*
import org.kodein.di.*

val AndroidGraphKodein = DI.Module(name = "AndroidGraphKodein") {
  // Singletons
  bind<Context>() with singleton { Context() }
  bind<Backstack>() with singleton { Backstack("/") }
  bind<Navigation>() with singleton { Navigation(instance(), instance(), instance()) }
  bind<SessionManager>() with singleton { SessionManager(instance(), instance()) }
  bind<ArticlesUseCase>() with singleton { ArticlesUseCase(instance(), instance(), instance()) }
  bind<ContentScreen>() with singleton { ContentScreen(instance(), instance(), instance()) }
  bind<ArticlesScreen>() with singleton { ArticlesScreen(instance(), instance()) }
  bind<AuthorScreen>() with singleton { AuthorScreen(instance(), instance()) }

  // Factories
  bind<LocalStorage>() with provider { LocalStorage() }
  bind<ArticlesDataSource>() with factory {
    RemoteArticlesDataSource(
      httpClient = lazy { instance<HttpClient>() },
      sessionManger = instance()
    )
  }
  bind<ArticlesRepository>() with singleton { ArticlesRepositoryImpl(instance(), instance()) }
  bind<AuthorDataSource>() with provider { AuthorDataSource(instance()) }
  bind<AuthorRepository>() with provider { AuthorRepository(instance()) }
  bind<ArticlesViewModel>() with provider {
    ArticlesViewModel(instance(), instance(), instance(), instance(), instance())
  }
  bind<AuthorViewModel>() with provider {
    AuthorViewModel(instance(), instance(), instance(), instance(), instance(), instance())
  }

  // App factory
  bind<App>() with provider {
    App(instance(), instance(), instance(), instance(), instance(), instance())
  }
}