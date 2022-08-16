import kotlin.math.pow

fun main(){
    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */
    print("Digite um numero qualquer: ")
    val num = readln().toInt()

    if(num % 2 == 0){
        print("Voce digitou o numero $num, ele é um numero par, a raiz quadrada de $num é ${Math.sqrt(num.toDouble())}")
    } else {
        print("Voce digitou o numero $num, ele é um numero impar, $num elevado ao quadrado é ${num*num} ")
    }
}