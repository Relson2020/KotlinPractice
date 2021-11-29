fun main(){

    var temp = 1
    val number = 3
    var result = 1

    println("printing numbers in interval of 4 between 1 and 30 using while loop")

    // while loop
    while (temp <= 30){
        if (temp == 24){
            break
        }
        else if (temp%4 == 0){
            println("$temp")
        }
        temp ++
    }
    println("\nprinting $number power ${5} using do while loop ")
    temp = 1

    // do while loop
    do{
        result *= number
        temp ++
    }while(temp <= 5)
    println("$number power 5 is : $result")

    println("\nprinting prime numbers between 1 to 30 using for loop ")
    // for loop
    for ( num in 1..30){
       if (num == 1){
           println("$num")
           continue
       }
        else if (num == 3){
            println("$num")
           continue
       }
        else if (num == 5){
            println("$num")
           continue
       }
        else if (( num%2 == 0)||(num%3 == 0)||(num%5==0)){
            continue
       }
        else {
            println("$temp")
       }
    }

    println("for loop range 1 to 10 step 3")

    // for loop step
    for (num in 1..10 step 3){
       println("$num")
    }

    println("for in loop down to from 10 to 1 step 4")

    // for loop down to and step
    for (num in 10 downTo 1 step 4){
        println("$num")
    }

    println("\nlabeled break ")
    outer@ for (num in 1..3){
        for (num2 in 1..4){
            // labeled break
            if (num == 3){
                break@outer
            }
            // unlabeled break
            if (num == 2){
                break
            }
            println("temp : $num and temp2 : $num2")
        }
    }

    println("\nlabeled continue ")
      for (num in 1..2){
        inner@ for (num2 in 1..4){
            // labeled continue
            if (num2 == 3){
                continue@inner
            }
            // unlabeled continue
            if (num2 == 4){
                continue
            }
            println("num : $num and num2 : $num2")
        }
    }
}