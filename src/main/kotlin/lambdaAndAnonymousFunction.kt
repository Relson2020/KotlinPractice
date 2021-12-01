
fun main(){

    // lambda function
    println("-------lambda function----------- ")
     val lambdaFunction: (Int , Int ,Int) -> Int  = { a , b, c  ->
         a+b+c
    }
    println("${lambdaFunction(10,30,44)}")

    //anonymous function
    println("----------anonymous function----------")
    val anonymousFunction= fun (a:Int , b:Int):Int{
        return  a+b
    }
    println("${anonymousFunction(40,23)}")

}