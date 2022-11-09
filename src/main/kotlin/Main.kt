//inicio git.

//-------------> Las constantes no deben cambiar nunca y se generan antes de darle compilar la aplicación.
const val my_age = 22

fun main() {

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

    //-------------> Null

    var valor: String? = null
    println("El valor es: ${valor?.length}")

    //Try Catch - mala practica
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


    //-------------> Arrays

    //Array
    val array = arrayOf("platano", "naranja", "Blah", "fresa", "papaya", "mango", "cereza")
    println("Aqui esta el array de frutas: $array")

    //array to list
    val arrayToList = array.toList()
    println("Aqui esta el array de frutas convertido a lista: $arrayToList")

    //-------------> List

    //List
    val lista = listOf("platano", "naranja", "kiwi", "fresa", "papaya", "mango", "cereza")
    println("Aqui esta la lista de frutas: $lista")

    //MutableList
    val listaMutable = mutableListOf("platano", "naranja", "kiwi", "fresa", "papaya", "mango", "cereza")

    listaMutable.add("sandia")
    listaMutable.remove("naranja")
    println("Aqui esta la lista mutable de frutas: $listaMutable")

    //get item listaMutable
    val valorUsandoGet = listaMutable.get(4)
    val valorUsandoOperador = listaMutable[2]
    println("Aqui esta el valor usando get: $valorUsandoGet \nAqui esta el valor usando operador: $valorUsandoOperador")

    val primerValor = listaMutable.first()
    val ultimoValor = listaMutable.last()
    val primerValorNull = listaMutable.firstOrNull()
    val ultimoValorNull = listaMutable.lastOrNull()
    println("Aqui esta el primer valor: $primerValor \nAqui esta el primer valor null: $primerValorNull \nAqui esta el ultimo valor: $ultimoValor \nAqui esta el ultimo valor null: $ultimoValorNull")

    //delete item listaMutable
    listaMutable.removeAt(2)
    println("Aqui esta la lista mutable de frutas removeAt: $listaMutable")

    listaMutable.removeIf { fruta ->
        fruta.length == 5
    }
    println("Aqui esta la lista mutable de frutas removeIf: $listaMutable")

    //-------------> Ordenamiento de listas

    //sort
    val listaOrdenada = listaMutable.sorted()
    println("Aqui esta la lista mutable de frutas ordenada: $listaOrdenada")

    //sort descending
    val listaOrdenadaDescendente = listaMutable.sortedDescending()
    println("Aqui esta la lista mutable de frutas ordenada descendente: $listaOrdenadaDescendente")

    //sort by - condition
    val listaOrdenadaPorLongitud = listaMutable.sortedBy { fruta ->
        fruta.length > 5
    }
    println("Aqui esta la lista mutable de frutas ordenada por longitud: $listaOrdenadaPorLongitud")

    //sort by descending
    val listaOrdenadaPorLongitudDescendente = listaMutable.sortedByDescending { fruta ->
        fruta.length > 5
    }
    println("Aqui esta la lista mutable de frutas ordenada por longitud descendente: $listaOrdenadaPorLongitudDescendente")

    //ramdom
    val listaAleatoria = listaMutable.shuffled()
    println("Aqui esta la lista mutable de frutas aleatoria: $listaAleatoria")

    //reverse
    val listaReversa = listaMutable.reversed()
    println("Aqui esta la lista mutable de frutas reversa: $listaReversa")

    //----------------> map and filter

    //map
    val caracteresFrutas = listaMutable.map { fruta ->
        fruta.length
    }
    println("Aqui estan el número de caracteres de las frutas: $caracteresFrutas")

    val listaMap = listaMutable.map { fruta ->
        "$fruta con chilito"
    }
    println("Aqui esta la lista mutable de frutas map: $listaMap")

    //filter
    val listaFiltrada = caracteresFrutas.filter { largoCaracteresFrutas ->
        largoCaracteresFrutas > 5
    }
    println("Aqui estan las frutas con mas de 5 caracteres: $listaFiltrada")

    val listaFilter = listaMutable.filter { fruta ->
        fruta.length > 5
    }
    println("Aqui esta la lista mutable de frutas filter: $listaFilter")

    //----------------> Maps

    //Map
    val mapa =
        mapOf("platano" to 1, "naranja" to 2, "kiwi" to 3, "fresa" to 4, "papaya" to 5, "mango" to 6, "cereza" to 7)
    println("Aqui esta el mapa de frutas: $mapa")

    //MutableMap
    val mapaMutable = mutableMapOf(
        "platano" to 1,
        "naranja" to 2,
        "kiwi" to 3,
        "fresa" to 4,
        "papaya" to 5,
        "mango" to 6,
        "cereza" to 7
    )
    println("Aqui esta el mapa mutable de frutas: $mapaMutable")

    //add item mapaMutable
    mapaMutable.put("sandia", 8)
    println("Aqui esta el mapa mutable de frutas con sandia: $mapaMutable")

    //get item mapaMutable
    val valorUsandoGetMapa = mapaMutable.get("platano")
    val valorUsandoOperadorMapa = mapaMutable["platano"]
    println("Aqui esta el valor usando get: $valorUsandoGetMapa \nAqui esta el valor usando operador: $valorUsandoOperadorMapa")

    //delete item mapaMutable
    mapaMutable.remove("platano")
    println("Aqui esta el mapa mutable de frutas remove: $mapaMutable")

    //keys
    val llaves = mapaMutable.keys
    println("Aqui estan las llaves del mapa mutable de frutas: $llaves")

    //values
    val valores = mapaMutable.values
    println("Aqui estan los valores del mapa mutable de frutas: $valores")

    //isEmpty
    val estaVacio = mapaMutable.isEmpty()
    println("Aqui esta el valor de estaVacio: $estaVacio")

    //isNotEmpty
    val noEstaVacio = mapaMutable.isNotEmpty()
    println("Aqui esta el valor de noEstaVacio: $noEstaVacio")

    //size
    val tamaño = mapaMutable.size
    println("Aqui esta el valor de tamaño: $tamaño")

    //clear
    mapaMutable.clear()
    println("Aqui esta el valor de mapaMutable.clear(): $mapaMutable")

    //----------------> Sets (no valores repetidos)

    //Set
    val set = setOf("platano", "naranja", "kiwi", "fresa", "papaya", "mango", "cereza")
    println("Aqui esta el set de frutas: $set")

    //MutableSet
    val setMutable = mutableSetOf("platano", "naranja", "kiwi", "fresa", "papaya", "mango", "cereza")
    println("Aqui esta el set mutable de frutas: $setMutable")

    //add item setMutable
    setMutable.add("sandia")
    println("Aqui esta el set mutable de frutas con sandia: $setMutable")

    //delete item setMutable
    setMutable.remove("platano")
    println("Aqui esta el set mutable de frutas remove: $setMutable")

    //get item setMutable
    val valorUsandoFirst = setMutable.firstOrNull { fruta ->
        fruta == "kiwi"
    }
    println("Aqui esta el valor usando first: $valorUsandoFirst")

    //----------------> Functions

    //function - afuera del main
    fun sumar2(a: Int, b: Int): Int {

        val result = a + b
        return result
    }
    println("Aqui esta el resultado de la suma: ${sumar2(a = 2, b = 3)}")

    //function of extension
    fun String.sumar(c: Int, d: Int): String {

        val result = c + d
        return this + result
    }
    println("Aqui esta el resultado de la suma: ".sumar(c = 4, d = 5))

    // parametros in functions
    fun sumar3(a: Int, b: Int, c: Int, d: Int): Int {

        val result = a + b + c + d
        return result
    }
    println(sumar3(a = 1, b = 2, c = 3, d = 5))

    //lambda - funciones cortas anónimas
    val sumar4 = { a: Int, b: Int, c: Int, d: Int ->
        a + b + c + d
    }
    println(sumar4(1, 2, 3, 4))

    //hihg order functions
    fun sumar5(a: Int, b: Int, c: Int, d: Int, operation: (Int, Int, Int, Int) -> Int): Int {

        return operation(a, b, c, d)
    }

    val result = sumar5(1, 2, 3, 4) { a, b, c, d ->
        a + b + c + d
    }
    println(result)

    //----------------> let
    var apodo: String? = null
    apodo?.let { value ->
        println("Aqui esta el apodo: $value")
    }
    apodo = "amv"
    apodo.let { value ->
        println("Aqui esta el apodo: $value")
    }

    //----------------> with
    val colors = mutableListOf("red", "green", "blue")
    with(colors) {
        add("pink")
        add("black")
        println("Aqui esta la lista de colores: $this, $size")
    }

    //----------------> run
    val days = mutableListOf("monday", "tuesday", "wednesday")
        .run {
            add("thursday")
            add("friday")
            remove("monday")
            this
        }
    println("Aqui esta la lista de dias: $days")

    //----------------> apply
    val numbers = mutableListOf("one", "two", "three")
        .apply {
            add("four")
            add("five")
            remove("one")
        }
    println("Aqui esta la lista de numeros: $numbers")

    //apply null
    val letters: MutableList<String>? = null
    letters?.apply {
        println("Aqui esta la lista de letras: $this")
    }

    //----------------> also
    val names = mutableListOf("john", "jane", "joe")
        .also { list ->
            list.add("jack")
            list.add("jill")
            list.remove("john")
            println("Aqui esta la lista de nombres: $list")
        }.asReversed()
    println("Aqui esta la lista de nombres: $names")


}
/*
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
 */