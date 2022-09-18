import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter the number: ")
    val num : Int = reader.nextInt()

    if (num%2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}