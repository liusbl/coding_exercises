import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt()

    val list = mutableListOf<Int>()
    list.add(n)
    var next = n
    while (next != 1) {
        if (next % 2 == 0) {
            next /= 2
        } else {
            next = (next * 3) + 1
        }
        list.add(next)
    }
    print(list.joinToString(" "))
}