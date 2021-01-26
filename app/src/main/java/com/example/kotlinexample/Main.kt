package com.example.kotlinexample
//1
fun main() {
//2
    var nombres = "Ignacio Javier"
    var apellidos = "Caro Aguilera"
    println("Mi nombre completo es $nombres $apellidos")
//3 Declarar Int con numeros especificos
    val num1 = 10
    val num2 = 20
    val num3 = 30
//4
    println(num1 + num2 + num3)
//5 Declarara variable String y Char
    var variable1: String
    var variable2: Char
//6 Asignarle valor a las variables

    variable1 = "Ark Reign"

    variable2 = 'A'

//7 imprimir la cantidad de caracteres de la variable String falta modificar el char A por otro
    println(variable1.length)

//8
    var a : Float
//9
     a = 32.23F
    println(a)
//10

    val byteMaximo = Byte.MAX_VALUE
    println(byteMaximo)
    val shortMaximo = Short.MAX_VALUE
    println(shortMaximo)

//11
    val intMinimo = Int.MIN_VALUE
    println(intMinimo)
    val LongMinimo = Long.MIN_VALUE
    println(LongMinimo)

//12

    var booleano :Boolean
    booleano = true
    booleano = false
    println(booleano)
    //13

    imprimiendoParametros(param1 = "hola", param2 = "mundo")

}
//13

    fun imprimiendoParametros(param1:String, param2:String ){
        println("Los parametros 1 $param1 y 2 $param2 tienen un total de   caracteres ")
        println(param1.length)

    }