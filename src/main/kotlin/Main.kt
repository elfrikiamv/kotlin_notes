//inicio git.

//-------------> Las constantes no deben cambiar nunca y se generan antes de darle compilar la aplicación.
const val my_age = 22

fun main(args: Array<String>) {

    println("Hello World!")
    println("Mi edad es: " + my_age + " años")
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
    val numerobyte: Byte = 127
    println("Byte: $numerobyte")

    //SHORT
    val numeroshort: Short = 32767
    println("Short: $numeroshort")

    //INT
    val numeroInt: Int = 2147483647
    println("Int: $numeroInt")

    //LONG
    val numeroLong: Long = 9223372036854775807
    val numerol = -9223372036854775807L
    println("Long: $numeroLong\nLong: $numerol")

    //DOUBLE
    val numeroDouble: Double = 18.01234567890123
    println("Double: $numeroDouble")

    //FLOAT
    val numeroFloat: Float = 8.012345f
    println("Float: $numeroFloat")

    //Típos alfanuméricos.

    //BOOLEAN
    val booleanVerdadero: Boolean = true
    val booleanFalso: Boolean = false
    println("Boolean: $booleanVerdadero \nBoolean: $booleanFalso")

    //CHAR
    val caracter: Char = 'F'
    val caracterNumero: Char = '2'
    val caracterChar: Char = '@'
    println("Char: $caracter \nChar: $caracterNumero \nChar: $caracterChar")

    //STRING
    val textString: String = "Hola, soy un string xd"
    val testString2: String = "Test. 12345!-$%S/"
    println("String: $textString \nString: $testString2")

    //-------------> Condicionales

    //IF - ELSE
    var numero = 22

    if (numero.equals(22)) {

        println("es tu edad!")
    } else {

        println("no es tu edad")
    }

    numero = 13

    if (numero.equals(22)) {

        println("es tu edad!")
    } else {

        println("no es tu edad")
    }

    //WHEN
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

    //-------------> Bucles

    //WHILE
    var contador = 0
    while (contador < 10) {

        println("el valor de contador es: $contador")
        contador++
    }

    //DO WHILE
    do {

        println("Generando número...")
        val numeroAleatorio = (0..222).random()
        println("El número genrado es $numeroAleatorio")
    } while (numeroAleatorio > 22)

    //for
    val listaDeFrutas = listOf("platano", "naranja", "kiwi", "fresa", "papaya", "mango", "cereza")
    for (fruta in listaDeFrutas) {

        println("Aqui estan las frutas: $fruta")
    }

    //forEach
    listaDeFrutas.forEach { fruta ->
        println("Aqui estan la fruta: $fruta")
    }

    //map
    val caracteresFrutas = listaDeFrutas.map { fruta ->
        fruta.length
    }
    println("Aqui estan el número de caracteres de las frutas: $caracteresFrutas")

    //filter
    val listaFiltrada = caracteresFrutas.filter { largoCaracteresFrutas ->
        largoCaracteresFrutas > 5
    }
    println("Aqui estan las frutas con mas de 5 caracteres: $listaFiltrada")

    //-------------> Null

    var valor: String? = null
    println("El valor es: ${valor?.length}")

    //Try Catch - mala practtica
    try {

        println("El valor es: ${valor!!.length}")
    } catch (e: Exception) {

        println("El valor es nulo")
    } finally {

        println("Esta wea aún es nulo")
    }

    //elvis operator
    val valor2: String? = null
    val valor3 = valor2 ?: "El valor es nulo"
    val valor4: Int = valor2?.length ?: 22
    println("El valor3 es: $valor3 \nEl valor4 es: $valor4")

}
/*
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
 */