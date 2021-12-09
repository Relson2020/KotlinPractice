import kotlin.coroutines.CoroutineContext

data class DataClass (val name : String, val age : Int)

fun main(){
    val obj = DataClass("alpha" , 34)
    val (name,age) = obj
    println("$name and $age")

    val map = mapOf<Int,String>(1 to "hey",2 to "there")
    val map2 = map.mapValues { ( key,values) -> "hello ${values}" }
    println(map2)
}
