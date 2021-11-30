fun main(){

    // defining String
    val variableName = "hello"
    val variableName2 = "hello"

    // defining empty String
    val emptyString = String()

    // traversing through String by indices
    print("traversing through String by indexe : ")
    print("${variableName[0]} ")
    print("${variableName[1]} ")
    print("${variableName[2]} ")
    print("${variableName[3]} ")
    print("${variableName[4]} \n")

    // traversing through String using for loop
    println("\ntraversing through String using for loop : ")
    for (i in variableName2.indices){
        print("${variableName2[i]} ")
    }

    // String length properties
    println("\n\n\"$variableName\" String length is : ${variableName.length} ")

    // String get(index) function
    println("\n\"$variableName\" String index 2 value is : ${variableName.get(2)}")

    // subSequence(starting , end ) function in String
    val string = "hello world in kotlin"
    println("\nSubString of \"$string\" from 6 to 11 : \"${string.subSequence(6 , 11)}\"")

    //.compareTo() function in string
    println("\n${variableName.compareTo(variableName2)}")

    //Escaped String
    println("\n----------Escaped String-------------\n\'hello\' \n\t \"world\"")

    //Raw String
    val rawString ="""
        hello
        world 
        in 
        kotlin
    """
    println("\n------------RawString-----------\n$rawString ")

    // == Structural equality
    println("\n------------Structural equality -------------\n $variableName == $variableName2 : ${variableName == variableName2}")

    // === Reference equality
    println("\n------------Reference equality --------------\n $variableName == $variableName2 : ${variableName == variableName2}")
}