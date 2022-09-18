fun main() {
    print("Enter the first number: ")
    var n1: Int =Integer.valueOf(readLine())
    print("Enter the second number: ")
    var n2: Int =Integer.valueOf(readLine())
    println("1.Addition")
    println("2.substraction")
    println("3.multiplication")
    println("4.division")

    println("Enter the  arthemetic operation")
    var x:Int =Integer.valueOf(readln())
    when(x)  {
        1-> addition(n1,n2)
        2-> substraction(n1,n2)
        3-> multiplication(n1,n2)
        4-> division(n1,n2)
    }
}
fun addition(n1:Int,n2:Int){
    var a:Int=n1+n2
    println("Answer is:$a")
}
fun substraction(n1:Int,n2:Int) {
    var b: Int = n1 - n2
    println("Answer is:$b")
}
fun multiplication(n1:Int,n2:Int){
    var c:Int=n1*n2
    println("Answer is:$c")
}
fun division(n1:Int,n2:Int){
    var d:Int=n1/n2
    println("Answer is:$d")
}





