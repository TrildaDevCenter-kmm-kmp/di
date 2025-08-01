package ivy.di.autowire

import ivy.di.Di
import ivy.di.get
import kotlin.jvm.JvmName

/**
 * Inspired by [Koin](https://github.com/InsertKoinIO/koin).
 */
inline fun <reified R> new(
  crossinline constructor: () -> R,
): R = constructor()

/**
 * @see new
 */
@JvmName("new1")
inline fun <reified R, reified T1> Di.Scope.new(
  crossinline constructor: (T1) -> R,
): R = constructor(get())

/**
 * @see new
 */
@JvmName("new2")
inline fun <reified R, reified T1, reified T2> Di.Scope.new(
  crossinline constructor: (T1, T2) -> R,
): R = constructor(get(), get())

/**
 * @see new
 */
@JvmName("new3")
inline fun <reified R, reified T1, reified T2, reified T3> Di.Scope.new(
  crossinline constructor: (T1, T2, T3) -> R,
): R = constructor(get(), get(), get())

/**
 * @see new
 */
@JvmName("new4")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4) -> R,
): R = constructor(get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new5")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5) -> R,
): R = constructor(get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new6")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6) -> R,
): R = constructor(get(), get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new7")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7) -> R,
): R = constructor(get(), get(), get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new8")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
): R = constructor(get(), get(), get(), get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new9")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
): R = constructor(get(), get(), get(), get(), get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new10")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
): R = constructor(get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

/**
 * @see new
 */
@JvmName("new11")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new12")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new13")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new14")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new15")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new16")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new17")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new18")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new19")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new20")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new21")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new22")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new23")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new24")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new25")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new26")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25, reified T26> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new27")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25, reified T26, reified T27> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new28")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25, reified T26, reified T27, reified T28> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28) -> R,
): R = constructor(
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get(),
  get()
)

/**
 * @see new
 */
@JvmName("new29")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25, reified T26, reified T27, reified T28, reified T29> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29) -> R,
): R = constructor(
  get(), get(), get(), get(), get(), get(), get(), get(), get(), get(),
  get(), get(), get(), get(), get(), get(), get(), get(), get(), get(),
  get(), get(), get(), get(), get(), get(), get(), get(), get()
)

/**
 * @see new
 */
@JvmName("new30")
inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23, reified T24, reified T25, reified T26, reified T27, reified T28, reified T29, reified T30> Di.Scope.new(
  crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30) -> R,
): R = constructor(
  get(), get(), get(), get(), get(), get(), get(), get(), get(), get(),
  get(), get(), get(), get(), get(), get(), get(), get(), get(), get(),
  get(), get(), get(), get(), get(), get(), get(), get(), get(), get()
)