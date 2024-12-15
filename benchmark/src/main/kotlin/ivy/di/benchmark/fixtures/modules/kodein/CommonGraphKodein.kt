package ivy.di.benchmark.fixtures.modules.kodein

import ivy.di.benchmark.fixtures.*
import org.kodein.di.*

val CommonGraphKodein = DI.Module(name = "CommonGraphKodein") {
  bind<DispatchersProvider>() with provider { RealDispatchersProvider() }
  bind<Logger>() with provider { LoggerImpl() }
  bind<Json>() with singleton { Json() }
  bind<Serialization>() with provider { KotlinXSerialization(instance()) }
  bind<HttpClient>() with singleton { HttpClient(instance(), instance(), instance()) }
}