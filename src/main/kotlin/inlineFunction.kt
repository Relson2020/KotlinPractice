
// inline function
inline fun inlineFunction(word : String){
    println(word)
}
// inline funtion
inline fun inlineFuntion2( lambda : () -> Unit){
      lambda()
}
fun main(){

    // inline function call
    inlineFunction("hey its inline function")

    //inline function lambda as argument
    inlineFuntion2 {
        println("inline lambda function ")
        return
    }
}