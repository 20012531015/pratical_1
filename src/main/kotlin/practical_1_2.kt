fun main() {
    println("Type Coversion")
    println()
    var a = 10
    println("Integer Value : " + a)
    val x: Double = a.toDouble()
    println("Double Value (From Integer) " + x)

    var b = 20
    println("String Value : " + b)
    val y: Int = b.toInt()
    println("Integer Value (From String) " + y)

    var c = 30
    println("String Value : " + c)
    val z: Double = c.toDouble()
    println("Double Value (From String) " + z)
}