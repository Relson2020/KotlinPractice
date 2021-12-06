import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main(){

    print("Enter two numbers : ")
    val num1 = readLine()!!
    val num2 = readLine()!!

    // try block
    try{
        println("$num1 divide by $num2 : ${num1.toInt()/num2.toInt()}")
    }

    // multiple catch block fot ArithmeticException
    catch (e:ArithmeticException){
        println("cant divide number with zero")
    }
    catch (e: NumberFormatException){
        println("Enter the number")
    }

    
    val temp :String? = null

    // try block
    try{
        println(temp!!)
    }

    // catch block for NullPointerException
    catch (e: NullPointerException){
        println("cant print $temp because its null")
    }

    val array = arrayOf(1,2,4,5,6)

    // try block
    try {
        println(array[6])
    }

    // catch block for ArrayIndexOutOfBoundsException
    catch (e:ArrayIndexOutOfBoundsException){
        println("Array is out of bound ")
    }

    println("Enter The Password : ")
    val password = readLine()!!

    // try block

    try{
        if(password.length<8){

        // throw keyword is used to throw exception
        throw Exception(" password should be minimum 8 characters")

    }else{
        println("Strong password")
    }

    }catch (e:Exception){
        println(e)
    }
}