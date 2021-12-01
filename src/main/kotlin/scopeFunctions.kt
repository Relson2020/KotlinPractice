// class define
class ScopeFunction{
    var name: String? = null
    var age:Int? = null

    fun scopeFunction(){
        println("name : $name and age : $age")
    }
}

fun main(){

    // creating class ScopeFunction instance and storing it in obj
    val obj = ScopeFunction()

    // run scope function with null safety check
    obj.name?.run{
        println("run $this")
    }

    // apply function to initializing the class instance members
    obj.apply {
        name ="tree"
        age = 23
    }

    // using let function to check null safety
    val temp=obj.name?.let {
        //println("let safety check $it")
        it
    }
    println("let null safety check : $temp")
    // using with function to call function
    with(obj){
        scopeFunction()
    }

    // using also function to add or initializing the name again
    obj.also{
        it.name = "plant"
    }

    // using run function to check null safety anf if it's not run the print function
    obj.name?.run{
        println("run $this")
    }

    class Class{
        var name: String? = null
        fun call(){
            println(name)
        }
    }
    val classObject= Class()
     classObject.apply{
       name = "asffs"

   }
    classObject.name?.let {
        println(it)
    }
    with(classObject){
        call()
    }
   /* classObject.apply{
        name = "asffs"

    }*/
    //print(classObject.name)
}