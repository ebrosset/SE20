import kotlin.math.*
import java.math.*

fun isPrime(x:BigInteger): Boolean{
    if(x==BigInteger.valueOf(1L)) return false

    for (j in 2L..(sqrt(x.toDouble()).toLong())) {
            if ((x.remainder(BigInteger.valueOf(j))).toInt() == 0){
                return false
            }
    }
    return true
}

fun main() {
    for (i in 1..20) {
        var n = BigInteger.valueOf(10).pow(i) / BigInteger.valueOf(9)
        println("%s %b".format( n.toString(), isPrime(n)))
    }
}
