import java.lang.ClassCastException

fun main(){
    val name = "alpha"
    val age = 345
    val percentage = 78.1

    val list : List<Any> = listOf(name,age, percentage)

    // is to check type and using forEach loop and if elseif conditional statement
    list.forEach{
       if(it is String){
           println("name : $it")
       }
        else if (it is Int){
            println("age : $it")
       }
        else if (it is Double){
            println("percentage : $it")
       }
    }

    println("\n is to check the type and using the when statement ")
    // is to check type and using forEach loop and when statement
    list.forEach{
        when(it){
            is String -> {  println("name : $it")}
            is Int -> { println("name : $it")}
            is Double -> { println("name : $it")}
        }
    }

    // !is operator e.g ( !is like != but for type checking )

    if (name !is String){
        println("name is not String ")
    }else{
        println("name is string ")
    }

    // as type casting
    val str1  = 11
    val str2 : String? = str1 as? String
    println(str2)

    val str3 = "hat "
    try {
        val str4 : Int = str3 as Int
    }
    catch (e:ClassCastException){
        println("cant type cast String to Int ")
    }
}
