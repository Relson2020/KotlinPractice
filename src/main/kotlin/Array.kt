fun main(){

    // creating array using arrayOf()
    val numbers = arrayOf(1,2,3,4,5,6,7,8)

    // creating array using arrayOf<dataType>()
    val things  = arrayOf<String>("desk","computer","chair","building","earth")

    // creating array using Array constructor
    val numbers2 = Array(6) { i -> i * 1 }

    //Traversing the array using for in loop
    println("arrayOf() function ")
    for (num in numbers){
        print("$num ")
    }

    // Traversing using for loop and range
    println("\n\narrayOf<dataType>() function")
    for (word in 0 until things.count()){
        print("${things[word]}, ")
    }

    // Traversing using for in loop with indices
    println("\n\nArray() constructor")
    for (num in numbers2.indices){
        print("$num ")
    }

    // set() and get() functions
    val words = arrayOf("weird","follow","create","assemble","sell")
    println("\n------------printing before using get() and set()------------ ")
    for (word in words){
        print("$word, ")
    }

    println("\n\nafter get() and set()")

    // set()
    words.set( 3 , "destroy" )
    words.set( 0 , "nice")

    // get()
    println("\nset assemble to destroy and weird to nice\n")
    for (word in words.indices){
        print("${words.get(word)}, ")
    }

    // traversing using forEach loop
    /*val fruits = arrayOf("Orange","Apple","Mango","Banana")
    fruits.forEach {  }*/

    println("\n\n---------Taking array input------------")

    // Taking array as input using for loop
    println("Enter the numbers ")
    val array = IntArray(5)
    var temp : String
    for (i in 0 until array.count()){
        temp = readLine()!!
        array[i] = temp.toInt()
    }
    println("Entered array is : ")
    for (i in array.indices){
        print("${array[i]} ")
    }
}