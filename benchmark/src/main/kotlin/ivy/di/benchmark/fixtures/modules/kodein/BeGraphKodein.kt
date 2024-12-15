package ivy.di.benchmark.fixtures.modules.kodein

import ivy.di.benchmark.fixtures.*
import org.kodein.di.*

val BeGraphKodein = DI.Module(name = "BeGraphKodein") {
  // UrlProvider
  bind<UrlProvider>() with provider { AwsUrlProvider() }

  // Environment
  bind<Environment>() with singleton { RealEnvironment() }

  // ServerConfig
  bind<ServerConfig>() with provider { ServerConfig(instance()) }

  // KtorApp
  bind<KtorApp>() with singleton { KtorApp() }

  // RateLimiter
  bind<RateLimiter>() with singleton { RateLimiter(instance()) }

  // Database
  bind<Database>() with singleton { Database(instance(), instance()) }

  // Auth-related bindings
  bind<AuthRepository>() with provider { AuthRepository(instance()) }
  bind<GoogleLoginUseCase>() with provider { GoogleLoginUseCase(instance(), instance()) }
  bind<AuthService>() with provider { AuthService(instance(), instance()) }
  bind<AuthApi>() with provider { AuthApi(instance(), instance(), instance()) }

  // Cars-related bindings
  bind<CarsRepository>() with provider { CarsRepository(instance(), instance()) }
  bind<CarsService>() with provider { CarsService(instance(), instance()) }
  bind<CarsApi>() with provider { CarsApi(instance()) }

  // Apis
  bind<Apis>() with provider { Apis(instance(), instance(), instance()) }

  // ServerApp
  bind<ServerApp>() with provider { ServerApp(instance(), instance(), instance(), instance()) }
}