fun main(){
    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
      18-25 adulto
     */
    print("Digite a sua idade e veja em qual categoria voce se encaixa: ")
    val idade = readln().toInt()

    if (idade in 10..14){
        print("Voce esta na categoria INFANTIL!")
    } else if (idade in 15..17){
        print("Voce está na categoria JUVENIL!")
    } else if (idade in 18..25){
        print("Voce esta na categoria ADULTO!")
    } else {
        print("Voce tem $idade anos, e não se encaixa em nenhuma categoria!")
    }
}