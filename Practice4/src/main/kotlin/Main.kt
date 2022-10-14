fun printFullName(firstName:String, lastName:String)
{
    println(firstName + " " + lastName);
}

fun calculateFullName(firstName:String, lastName:String):String
{
    return firstName + " " + lastName;
}

fun calculateFullNameSecond(firstName: String, lastName: String): Pair<String, Int>
{
    val fullName = firstName + " " + lastName;
    return Pair(fullName, fullName.length)
}

//5
fun primeNumber(number: Int): Boolean
{
    for (i in 2..(Math.sqrt(number.toDouble()).toInt()) step 1)
    {
        if (number % i == 0)
            return false
    }
    return true
}

//6
fun fibonacci(number: Int): Int
{
    if (number == 1 || number == 2)
        return 1
    return (fibonacci(number - 1) + fibonacci(number - 2))
}


fun main(args: Array<String>)
{
    //2
    printFullName("Магамет", "Ситимов");
    //3
    val name = calculateFullName("Магамет", "Ситимов");
    println(name)
    //4
    val nameTwo = calculateFullNameSecond("Магамет", "Ситимов")
    println(nameTwo)
    //5
    val number:Int=999
    print("Простые числа: ")
    for (i in 2 ..number step 1)
    {
        if(primeNumber(i)) print("$i, ")
    }
    //6
    println()
    print("Фибоначчи: ")
    for (i in 1..10 step 1)
    {
        print("$i - ${fibonacci(i)}     ")
    }
}