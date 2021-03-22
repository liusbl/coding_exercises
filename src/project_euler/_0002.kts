package project_euler

fun createFibonacci(maxValueInclusive: Int): Int {
    val list = mutableListOf<Int>()
    var previous = 1
    var next = 1
    while (true) {
        val temp = next
        next += previous
        previous = temp
        if (next >= maxValueInclusive) {
            break
        }
        if (next % 2 == 0) {
            list.add(next)
        }
    }
    return list.sum()
}

createFibonacci(4_000_000)