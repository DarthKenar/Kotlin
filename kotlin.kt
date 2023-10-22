fun main() {
    fun sumar(primerNumero: Int, segundoNumero: Int): Int {
        return primerNumero + segundoNumero;
    }
    fun restar(primerNumero: Int, segundoNumero: Int) = primerNumero - segundoNumero
    var a:Int = 2
    var b:Int = 1
    
    println("El resultado de la suma es: ${sumar(a,b)}")
    println("El resultado de la resta es: ${restar(a,b)}")

    do {
        println(a--)
    } while (a>=0);
}


