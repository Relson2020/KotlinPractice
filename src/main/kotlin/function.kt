fun main(){

    // parameterized function
    print("Enter your name : ")
    val name = readLine()!!
    print("Enter your age : ")
    var temp = readLine()!!

    fun display(name: String , age: Int){
        println("Entered name is : $name \nEntered age is : $age")
    }
    println(display(name=name,temp.toInt()))

    // recursion
    println("Enter the number to see its factorial : ")

    // recursion function
    fun recursion (num : Int):Int{
        if (num>1){
            return num * recursion(num -1)
        }
        return num
    }
    temp = readLine()!!
    println("factorial of ${temp.toInt()} : ${recursion(temp.toInt())}")

    println("Enter how many number you want to print start from 1 :")
    // recursion function
    fun recursion2 (num : Int):Int{
        if (num>1){
            print("${recursion2(num-1)} ")
            return num
        }
        return num
    }
    temp = readLine()!!
    recursion2(num = (temp.toInt()) + 1)

    // recursion tail
    println("Enter the number to see its factorial using tail recursion : ")

    // recursion tail function
    fun recursion3 (num : Int , x:Int):Int{
        return if(num==1){
            x
        }else{
            recursion3(num-1,x*num)
        }
    }
    temp = readLine()!!
    println("factorial of ${temp.toInt()} : ${recursion3(temp.toInt() , 1)}")
}