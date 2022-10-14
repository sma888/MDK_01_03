fun main(args: Array<String>)
{
    //1
    val age1 = 42;
    val age2 = 21;
    //2//3
    val avg1 = (age1.toDouble()+age2.toDouble())/2;
    println(avg1);
    //4
    val firstName = "Магамет";
    val lastName = "Ситимов";
    //5
    val fullName = firstName + " " + lastName;
    println(fullName);
    //6
    val myDetails = "Привет, меня зовут $fullName";
    println(myDetails);
    //7
    val date = Triple(10,10,2022);
    //8
    var (month, day, year) = date;
    println(date);
    //9
    var (month1,_ , year1) = date;
    //10
    month1 = 4
    val vafli = Pair(month1, year1)
    println(vafli);
}