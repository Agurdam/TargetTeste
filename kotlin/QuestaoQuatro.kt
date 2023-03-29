import java.text.NumberFormat
import kotlin.math.roundToInt

fun main() {
    val numFormat = NumberFormat.getCurrencyInstance();

    val fatSP = 67836.43
    val fatRJ = 36678.66
    val fatMG = 29229.88
    val fatES = 27165.48
    val fatO = 19849.53
    val fatTotal = fatSP + fatRJ + fatMG + fatES + fatO

    val percentSP = ((fatSP / fatTotal) * 100)
    val percentRJ = ((fatRJ / fatTotal) * 100)
    val percentMG = ((fatMG / fatTotal) * 100)
    val percentES = ((fatES / fatTotal) * 100)
    val percentO = ((fatO / fatTotal) * 100)

    println("Faturamento total da distribuidora: ${numFormat.format(fatTotal)}.\n")

    println("Faturamento da filial São Paulo: ${numFormat.format(fatSP)}, corresponde a ${formatPercent(percentSP)}% do faturamento total.")

    println("Faturamento da filial Rio de Janeiro: ${numFormat.format(fatRJ)}, corresponde a ${formatPercent(percentRJ)}% do faturamento total.")

    println("Faturamento da filial Minas Gerais: ${numFormat.format(fatMG)}, corresponde a ${formatPercent(percentMG)}% do faturamento total.")

    println("Faturamento da filial Espirito Santo: ${numFormat.format(fatES)}, corresponde a ${formatPercent(percentES)}% do faturamento total.")

    println("Faturamento de outras filiais: ${numFormat.format(fatO)}, corresponde a ${formatPercent(percentO)}% do faturamento total.")

}

private fun formatPercent(d: Double): String {
    return String.format("%.2f", d)
}