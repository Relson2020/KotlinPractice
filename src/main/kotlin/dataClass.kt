fun main(){

    // defining the dataClass
    data class DataClass(val name : String , val id : String )

    // creating the dataClass Instance
    val obj = DataClass("never", "c28")

    // accessing the dataClass
    println(obj.name)
    println(obj.id)

    println("----- dataClass function -------\n")

    // toString()

    println("dataClass toString function : ${obj.toString()}")

    // Copy()

    val obj2 = obj.copy()
    val obj3 = obj.copy(id = "c26")

    println("obj2 toString : ${obj2.toString()}  \nobj3 toString : ${obj3.toString()} ")

    // hashCode()

    val hashCode1 = obj.hashCode()
    val hashCode2 = obj2.hashCode()
    val hashCode3 = obj3.hashCode()

    println("\nhashCode1 : $hashCode1 \nhashCode2 : $hashCode2 \nhashCode3 : $hashCode3")

    // equal()

    println("\nashCode1 == hashCode2 : ${hashCode1.equals(hashCode2)} \nhashCode2 == hashCode3 : ${hashCode2.equals(hashCode3)} \nhashCode3 == hashCode1 : ${hashCode3.equals(hashCode1)}")

}
