fun main(){

    // safety call operator ?.

    var value : String? = "hey "
    value = null
    println(value?.length)

    // ?.let

    var temp : String? = null
    temp?.let {
        println(temp)
    }
    temp = "null safety check by let"
    temp?.let {
        println(temp)
    }

    // ?.run

    var temp1 : String? = null
    temp1?.run {
        println(temp)
    }
    temp1 = "null safety check by run"
    temp1?.run {
        println(temp1)
    }

    // Elvis operator

    println(value?:"printing this because the value is null via Elvis operator ")

    // !!. null safety check

    val temp2 : String? = null
    try {
         println(temp2!!)
    }
    catch (e:NullPointerException){
        println("couldn't print null")
    }

}