fun main() {
    val string = "67.234"
    val string2 = "255"
    val string3 = "true"
    val double = 34.23234234534
    val float = 45.23432
    val long = 52342342344
    val int = 67

    print("--------Type conversion----------\n")

    // toByte() Int to Byte
    println("Int $int to Byte : ${int.toByte()}")

    // toLong()  Long to Int
    println("Long $long to Int : ${long.toInt()}")

    // toShort() Int to Short
    println("Int $int to Short : ${int.toShort()}")

    // toChar() Int to Char
    println("Int $int to Char : ${int.toChar()}")

    // toFloat() Double to Float
    println("Double $double to Float : ${double.toFloat()}")

    // toInt() float to Int
    println("Float $float to Int : ${float.toInt()}")

    // toDouble() String to Double
    println("String $string to Double : ${string.toDouble()}")

    // toInt() String to Int
    println("String $string2 to Int : ${string2.toInt()}")

    // toBoolean() String to Boolean
    println("String $string3 to Boolean : ${string3.toBoolean()}")

}