import java.text.NumberFormat

fun main() {
    val vetor = DoubleArray(31)
    var total = 0.0
    var bestDay = 0
    var dayOff = 0
    val numFormat = NumberFormat.getCurrencyInstance();

    //Preencher o array
    for (i in 0..vetor.size - 1) {
        var random = Math.random() * 100

        vetor.set(i, random)
        total += random
    }

    for (j in 0..vetor.size - 1) {

        if (vetor[j] == vetor.max()) {

            println("O dia $j apresentou o maior faturamento deste mês, ${numFormat.format(vetor[j])}.")
        }
        if (vetor[j] == vetor.min()) {
            //pior faturamento diário

            println("O dia $j apresentou o menor faturamento deste mês, ${numFormat.format(vetor[j])}.")
        }
        if (vetor[j] == 0.0) {
            //Contador de dias sem faturamento
            dayOff++
        }
    }

    val average = vetor.sum() / vetor.size - dayOff

    for (k in 0..vetor.size - 1) {
        if (vetor[k] > average) {
            bestDay++
            //val numFormat = String.format("%.2f", vetor[i])
            //println("No dia ${i+1} o faturamento foi de $numFormat, maior que a média mensal.")
        }
    }
    print("O faturamento diário foi maior que o faturamento mensal em $bestDay dias do mês")

}