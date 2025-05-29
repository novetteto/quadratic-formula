// TODO: Documentate the code.

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var x1: Double?

    var x2: Double?

    val a = readlnOrNull()
        ?.takeIf { it.isNotBlank() && it.contains(Regex("-?\\d+(\\.\\d+)?")
        ) }
        ?.toDouble()
        ?: 0.0

    if (a == 0.0) {
        println("A cannot be zero!")
        return
    }

    val b = readlnOrNull()
        ?.takeIf { it.isNotBlank() && it.contains(Regex("-?\\d+(\\.\\d+)?")
        ) }
        ?.toDouble()
        ?: 0.0

    val c = readlnOrNull()
        ?.takeIf { it.isNotBlank() && it.contains(Regex("-?\\d+(\\.\\d+)?")
        ) }
        ?.toDouble()
        ?: 0.0

    val delta = (b.pow(2.0) - 4 * a * c)

    when {
        delta > 0.0 -> {
            x1 = (-(b) + sqrt(delta)) / (2.0 * a)
            x2 = (-(b) - sqrt(delta)) / (2.0 * a)
            println("${x1}, ${x2}, delta: $delta")
        }
        delta == 0.0 -> {
            println("There's only one root.")
        }
        delta < 0.0 -> {
            println("There's no real roots.")
        }
    }
}
