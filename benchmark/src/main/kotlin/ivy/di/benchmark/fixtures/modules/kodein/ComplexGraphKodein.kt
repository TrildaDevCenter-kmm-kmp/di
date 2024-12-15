package ivy.di.benchmark.fixtures.modules.kodein

import ivy.di.benchmark.fixtures.*
import org.kodein.di.*

val ComplexGraphKodein = DI.Module(name = "ComplexGraphKodein") {
  // Holder bindings
  bind<Holder1>() with factory { Holder1(instance(), instance()) }
  bind<Holder2>() with singleton { Holder2(instance(), instance(), instance()) }
  bind<Holder3>() with factory { Holder3(instance(), instance()) }
  bind<Holder4>() with singleton { Holder4(instance(), instance(), instance()) }
  bind<Holder5>() with factory { Holder5(instance(), instance(), instance(), instance()) }
  bind<Holder6>() with singleton { Holder6(instance(), instance(), instance(), instance(), instance()) }
  bind<Holder7>() with factory {
    Holder7(instance(), instance(), instance(), instance(), instance(), instance())
  }
  bind<Holder8>() with singleton {
    Holder8(instance(), instance(), instance(), instance(), instance(), instance(), instance())
  }
  bind<Holder9>() with factory {
    Holder9(instance(), instance(), instance(), instance(), instance(), instance(), instance(), instance())
  }
  bind<Holder10>() with singleton {
    Holder10(
      instance(), instance(), instance(), instance(), instance(),
      instance(), instance(), instance(), instance(),
    )
  }

  // MultiHolder bindings
  bind<MultiHolder>() with factory {
    MultiHolderImpl(
      instance(), instance(), instance(),
      instance(), instance(), instance(),
      instance(), instance(), instance(),
      instance(), instance(), instance(),
      instance(), instance()
    )
  }
  bind<MultiHolderFinal>() with factory {
    MultiHolderFinal(instance(), instance(), instance(), instance(), instance())
  }
}