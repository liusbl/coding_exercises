package project_euler

fun getPrimeFactors(n: Long): List<Int> {
    var number = n
    var divisor = 2
    val result = mutableListOf<Int>()
    while (number > 1) {
        if (number % divisor == 0L) {
            number /= divisor
            result.add(divisor)
            divisor = 2
        } else {
            divisor++
        }
    }
    return result
}

getPrimeFactors(600851475143)