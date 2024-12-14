package affiinity

import ivy.di.Di
import ivy.di.get
import module.AndroidModule

fun main() {
    Di.init(AndroidModule)
    Di.appScope {
        get<String>()
    }
}