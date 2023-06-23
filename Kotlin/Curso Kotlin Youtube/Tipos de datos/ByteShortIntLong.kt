fun main() {
    //var number: Int = 22

    val maxIntegerValue: Int = Int.MAX_VALUE //2147483647
    val minIntegerValue: Int = Int.MIN_VALUE //-2147483648

    println("Integer max value: $maxIntegerValue")
    println("Integer min value: $minIntegerValue")

    //number = 2147483648 // No puede asignar el número a una variable Int porque no cabe

    val maxByteValue: Byte = Byte.MAX_VALUE //127
    val minByteValue: Byte = Byte.MIN_VALUE //-128

    println("Byte max value is: $maxByteValue")
    println("Byte min value is: $minByteValue")

    val maxShortValue: Short = Short.MAX_VALUE //32767
    val minShortValue: Short = Short.MIN_VALUE //-32768

    println("Short max value is: $maxShortValue")
    println("Short min value is: $minShortValue")

    val maxLongValue: Long = Long.MAX_VALUE //9223372036854775807
    val minLongValue: Long = Long.MIN_VALUE //-9223372036854775808

    println("Long max value is: $maxLongValue")
    println("Long min value is: $minLongValue")

    val myNumber = 26
}