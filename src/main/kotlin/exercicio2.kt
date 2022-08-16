fun main(){
    //2- Faça um programa que entre com três números e coloque em ordem crescente.

    print("Digite o primeiro numero: ")
    val num1 = readln().toDouble()

    print("Digite o segundo numero: ")
    val num2 = readln().toDouble()

    print("Digite o terceiro numero: ")
    val num3 = readln().toDouble()

    if(num1 > num2 && num1 > num3 && num2 > num3){
        print("A ordem crescente dos valores digitados é: $num1, $num2, $num3")
    } else if(num2 > num1 && num2 > num3 && num1 > num3){
        print("A ordem crescente dos valores digitados é: $num2, $num1, $num3")
    } else if(num3 > num1 && num3 > num2 && num1 > num2){
        print("A ordem crescente dos valores digitados é: $num3, $num1, $num2")
    } else if(num1 > num2 && num1 > num3 && num3 > num2){
        print("A ordem crescente dos valores digitados é: $num1, $num3, $num2")
    } else if(num2 > num1 && num2 > num3 && num3 > num1){
        print("A ordem crescente dos valores digitados é: $num2, $num3, $num1")
    } else{
        print("A ordem crescente dos valores digitados é: $num3, $num2, $num1")
    }


}