//inicio git.

    //-------------> Las constantes no deben cambiar nunca y se generan antes de darle compilar la aplicación.
    const val my_age = 22

fun main(args: Array<String>) {
    println("Hello World!")

    //println("Mi edad es: "+my_age)
    println("Mi edad es: $my_age años")

    //-------------> Variable de lectura y escritura.

    var saldo = 13
    //println("Saldo actual: "+saldo)
    println("Tu saldo actual es de: $saldo pejecoins")
    saldo = 42
    //println("Saldo actualizado: "+saldo)
    println("Tu saldo se a actualizado: $saldo pejecoins")

    //-------------> variable de solo lectura (No se puede modificar).

    val name = "M&J"
    //println("Su nombre es: "+name)
    println("Su nombre es: $name")

    //-------------> kotlin detecta automaticamente el tipo de variable pero si eres necio lo puedes especificar:

    //Típos numéricos.

    //BYTE
    val numerobyte : Byte = 127
    println("Byte: $numerobyte")

    //SHORT
    val numeroshort : Short = 32767
    println("Short: $numeroshort")

    //INT
    val numeroInt : Int = 2147483647
    println("Int: $numeroInt")

    //LONG
    val numeroLong : Long = 9223372036854775807
    val numerol = -9223372036854775807L
    println("Long: $numeroLong\nLong: $numerol")

    //DOUBLE
    val numeroDouble : Double = 18.01234567890123
    println("Double: $numeroDouble")

    //FLOAT
    val numeroFloat : Float = 8.012345f
    println("Float: $numeroFloat")

    //Típos alfanuméricos.

    //BOOLEAN
    val booleanVerdadero : Boolean = true
    val booleanFalso : Boolean = false
    println("Boolean: $booleanVerdadero\nBoolean: $booleanFalso")

    //CHAR
    val caracter : Char = 'F'
    val caracterNumero : Char = '2'
    val caracterChar : Char = '@'
    println("Char: $caracter\nChar: $caracterNumero\nChar: $caracterChar")

    //STRING
    val textString : String  = "Hola, soy un string xd"
    val testString : String = "Test. 12345!-$%S/"
    println("String: $textString\nString: $testString")

    //-------------> Condicionales

    //if - else
    var amv = 22

    if (amv.equals(22)) {
        println("es tu edad!")
    } else {
        println("no es tu edad")
    }

    val amv2 = 13

    if (amv2.equals(22)) {
        println("es tu edad!")
    } else {
        println("no es tu edad")
    }

    //when

    when (my_age) {

        22 -> {

                println("¡es tu edad!")
        }
        13 -> {

            println("no es tu edad!")
        }
    }

    when (name) {

        "M&J", "Icee" -> {

            println("Su nombre es: $name")
        }
        "Amv" -> {

            println("Su nombre no es: $name")
        }
        else -> {
            println("Ups!, algo no salio bien")
        }
    }

    val code = 222
    when (code) {

        in 200..299 -> {

            println("Esta dentro del rango su número: $code")
        }
        in 400..500 -> {

            println("Esta dentro del rango su número: $code")
        }
        else -> {
            println("Ups!, algo no salio bien")
        }
    }
}
/*
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
 */