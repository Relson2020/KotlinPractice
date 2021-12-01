// lambda expression
val lambda = {
    println("lambda in higherOrder function ")
}

// higher order function with lambda as a parameter
fun higherOrder(lbd:() -> Unit){
    lbd()
}

// lambda function with parameter and return type
val lambdaWithParameter : (Int , Int ) -> Int = { a , b  ->
    a+b
}

// higherOrder function
fun higherOrderFunction( lmb:(Int , Int) -> Int , a:Int ,b:Int){
    println(" higher order function with lambda function parameter : ${lmb( a ,b )}")
}

// higherOrder function
fun higherOrderFunction2 (lmb:() -> Unit){
    lmb()
}

// normal function
fun printLine(line:String){
    println(line)
}

// higherOrder function passing a normal function
fun higherOrderFunction3( lmb :(String) -> Unit, line:String ){
    lmb(line)
}

//normal function
fun sum( a:Int , b:Int){
    println("${a+b}")
}

// higher order function returning function
fun higherOrderFunction4():(Int,Int) -> Unit{
    return ::sum
}

// main function
fun main(){
    // higherOrder function call
    higherOrder(lambda)

    // higherOrder function call
    higherOrderFunction(lambdaWithParameter,34,5)

    // higherOrder function call with lambda as parameter
    higherOrderFunction2 { println("lambda body as parameter in higherOrder function call ") }

    // higherOrder function passing the normal function as argument
    higherOrderFunction3(::printLine,"passing a normal function to the higherOrder function")

    // calling higherOrder function which going to return function and saving that return function in calSum
    val calSum = higherOrderFunction4()
    val result = calSum(45,63)
    println(result)
}