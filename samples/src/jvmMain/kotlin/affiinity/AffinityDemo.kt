package affiinity

import ivy.di.Di
import ivy.di.get

fun main() {
    Di.appScope {
        get<String>()
    }
}