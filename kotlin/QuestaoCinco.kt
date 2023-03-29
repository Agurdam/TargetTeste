lateinit var s: String
fun main() {
    println("Insira uma palavra")
    s = readln();

    for(i in s.length downTo 1)
        print(s.get(i-1))
}