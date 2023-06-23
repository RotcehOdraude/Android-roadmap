fun main(args: Array<String>) {
    var userName: String = "José" //Redundante debido al type Inference
    userName = "Héctor"
    //userName = 5 Statically typed, No se le puede cambiar el tipo de dato a una variable ya asignado
    //val userName //No podemos cambiar el valor de la variable una vez asignado el valor
    var age: Int = 26
    age = 25
    println("¡Hola $userName! tu edad es $age")
}