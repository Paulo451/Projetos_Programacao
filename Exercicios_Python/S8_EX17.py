"""
Faça uma função que receba dois números inteiros positibos por parâmetro e retorne a soma dos N números inteiros existentes entre eles.
"""
# Funções


def verificacao(nv1, nv2):
    if nv1 >= 0 and nv2 >= 0:
        return soma_num(nv1, nv2)
    else:
        print('Os numeros devem ser positiivos')


def soma_num(num1, num2):
    soma = 0
    cont = 0
    if num1 > num2:
        while num1 > num2 + 1:
            cont += 1
            soma += (num1 - 1)
            num1 = num1 - 1
    else:
        while num2 > num1 + 1:
            cont += 1
            soma += (num2 - 1)
            num2 = num2 - 1
    print(f'A soma é igual a: {soma}')


# Entrada
n1 = int(input('Digite dois numeros inteiros positivos: '))
n2 = int(input())
# Chamada da função
verificacao(n1, n2)
