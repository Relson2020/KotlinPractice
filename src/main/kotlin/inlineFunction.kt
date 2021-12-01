
// inline function
inline fun inlineFunction(word : String){
    println(word)
}
// inline function
inline fun inlineFunction2( lambda : () -> Unit){
      lambda()
}
fun main(){

    // inline function call
    inlineFunction("hey its inline function")

    //inline function lambda as argument
    inlineFunction2 {
        println("inline lambda function ")
        return
    }
}