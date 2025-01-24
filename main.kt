fun main(){
    println("Valores: a=15 b=15 c=15")
    println( Triangulo(15,15,15))
    println(" ")
    println("Valores: a=8 b=10 c=12")
    println(Triangulo(8,10,12))
    println(" ")
}

fun Triangulo(a: Int, b: Int, c: Int){
    if (a<=0 || b<=0 || c<=0){
        println("Los valores ingresados tienen que ser mayor a 0")
    }else if (a+b>c&& b+c>a && a+c>b){
        if (a==b && c==b){
            println("Es un triangulo equilatero")
        }else if ((a==b && b!=c)||(b==c && c!= a)||(c==a && a!=b)){
            println("Es un triangulo isoseles")
        }else{
            println("Es un triangulo escaleno")
        }

    }else{
        println("Los valores dados no forman un triangulo")
    }

}