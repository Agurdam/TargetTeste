fun main() {

    var n: Int
    var t1 = 0
    var t2 = 1

    println("Insira o número de termos para iniciar a sequência de Fibonacci.")
    n = readln().toInt();

    for (i in 1..n) {
        if (i == n) {
            print("$t1")
        } else print("$t1, ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

}