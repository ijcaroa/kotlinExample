package com.example.kotlinexample

fun main(){
imprimirNombreCompleto(nombre = "Ignacio", apellido = "caro", edad = 40)


}

 fun getNombre(): String{
     return "ignacio caro"

}
fun imprimirNombreCompleto(nombre:String, apellido:String,edad:Int){
    println("Mi nombre es $nombre $apellido y mi edad es $edad" )
}