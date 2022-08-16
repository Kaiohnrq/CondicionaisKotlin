fun main() {
    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite o primeiro numero: ")
    val num1 = readln().toInt()

    print("Digite o segundo numero: ")
    val num2 = readln().toInt()

    print("Digite o terceiro numero: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        print("$num1 é o maior numero!")
    } else if (num2 > num1 && num2 > num3){
        print("$num2 é o maior numero!")
    } else {
        print("$num3 é o maior numero!")
    }
}