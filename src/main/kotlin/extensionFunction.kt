// class define
class Test{
    companion object {
       fun display(){
         println("calling function with the name of the class ")
       }
    }
}

// main function
fun main(){
    val str1 = "hey "
    val str2 = "hello "
    val str3 = "there"

    // calling the extension function
    val concatenate = str1.add(str2,str3)
    println(concatenate)

    Test.display()
    Test.display2()
    Test().classDisplay()

}

// extension function
fun String.add( str2: String , str3 :String):String {
    return this + str2 + str3
}
// extension function
fun Test.classDisplay(){
    println("extension class function ")
}

// extension companion function
fun Test.Companion.display2(){
    println("companion display2 function")
}

// fun Text?.displayIt()