
fun main(){

    // lambda function
    println("-------lambda function----------- ")
     val lambdaFunction  = { a:Int , b:Int  ->
         a+b
    }
    println("${lambdaFunction(10,30)}")

    //anonymous function
    println("----------anonymous function----------")
    val anonymousFunction= fun (a:Int , b:Int):Int{
        return  a+b
    }
    println("${anonymousFunction(40,23)}")

}