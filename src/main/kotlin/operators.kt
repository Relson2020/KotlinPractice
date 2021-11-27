fun main() {

    // immutable variable
    val num1 = 23
    val num2 = 12
    val boolValue = false
    val temp2  = 12
    
    // mutable variable
    var temp  = 50



    println("----- Arithmetic operator --------------\n")

    // addition operator
    println("Method1 -----> Addition of $num1 and $num2 (+): ${num1 + num2}   ")

    // subtraction operator
    println("Subtraction of $num1 and $num2 (-) : ${num1 - num2}")

    //  multiplication operator
    println("Multiplication of $num1 and $num2 (*) : ${num1 * num2}")

    // division operator
    println("Division of $num1 and $num2 (/) : ${num1  / num2}")

    // modulus operator
    println("Reminder of $num1 and $num2 (%) : ${num1 % num2}")


    println("\n-------------Relational operator------------ \n")

    // Greater than relational operator
    println("$num1 Greater than $num2 ( a > b ): ${num1 > num2}")

    // Smaller than relational operator
    println("$num1 Smaller than $num2 ( a < b ): ${num1 < num2}")

    // greater than or equal to
    println("$num1 Greater than or equal to $num2 ( a >= b ): ${num1 >= num2}")

    //  smaller than or equal to
    println("$num1 smaller than or equal to $num2 ( a <= b ): ${num1 <= num2}")
                //  equal to
    println("$num1 equal to  $num2 ( a == b ): ${num1 == num2}  ")

    /* not equal to */
    println("$num1 not equal to $num1 ( a != b ): ${num1 != num2}")

    println("\n------------Assignment Operator-------------\n")

    // Addition assignment operator
    var result : Int = temp
     result += temp2
    println("Addition Assignment operator ( $temp += $temp2 ) : $result")

    // Subtraction assignment operator
    result = temp
    result -= temp2
    println("Subtraction Assignment operator ( $temp -= $temp2) : $result")

    // multiplication assignment operator
    result = temp
    result *= temp2
    println("Subtraction Assignment operator ( $temp *= $temp2 ) : $result")


    // division assignment operator
    result = temp
    result /= temp2
    println("Subtraction Assignment operator ( $temp /= $temp2 ) : $result")


    // modulus assignment operator
    result = temp
    result %= temp2
    println("Subtraction Assignment operator ( $temp %= $temp2 ) : $result")

    println("\n-------------Unary operator-------------- \n")

    // post Increment operator
    result = temp
    println("Post increment operator $result++ : ${temp++}")
    println("value of $result after post increment : $temp")
               // pre increment operator
    println("Pre increment operator ++$temp : ${++temp}")

    // post decrement
    result = temp
    println("\nPost increment operator $result-- : ${temp--}")
    println("value of $result after post increment : $temp")
                // pre decrement operator
    println("Pre increment operator --$temp : ${--temp}")

    println("\n--------logical operator---------\n")

    // || (or) operator
    println("|| (or) logical operator ")
    println("($num1 > $num2) || ($num1 == $num2)")
       if ((num1 > num2 )||(num1 == num2)){
           println("|| (or) logical operator execute because $num1 is greater \n")
       }

    // && (and) operator
    println("&& (and) logical operator ")
    println("($num1 > $num2) && ($num1 == $num2)")
        if ((num1 > num2 )&&(num1 == num2)){
            println("&& (and) logical operator execute because $num1 is greater and equal to $num2\n")
        }
    else{
        println("if block is not executed because the one of the condition is false \n")
    }

    // .not() (not) operator
    println(".not() (not) logical operator ")
    if (boolValue.not()){
        println("if block execute because .not() operator compliment the variable value false to true\n" )
    }

    println("----------bitwise operator----------\n")

    // shl
    println("$num1 signed shift left $2 : ${num1.shl(2)}")

    // shr
    println("$num1 signed shift right $2 : ${num1.shr(2)}")

    // bitwise or
    println("$num1 bitwise or $num2 : ${num1.or(num2)}")

    // bitwise and
    println("$num1 bitwise and $num2 : ${num1.and(num2)}")

    // bitwise xor
    println("$num1 bitwise xor $num2 : ${num1.xor(num2)}")

    // bitwise inverse
    println("$num1 bitwise inverse : ${num1.inv()}")

    // unsigned shift right
    println("$num1 bitwise unsigned shift right $2 : ${num1.ushr(2)}")
}