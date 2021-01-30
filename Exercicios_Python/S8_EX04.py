"""
Faça uma função para verificar se um número é um quadrado perfeito
"""
# Funções


def verificador(n1):
    if n1 > 0:
        return quadrado_perfeito(n1)
    else:
        print("Numero negativo (invalido)!")


def quadrado_perfeito(num):
    if num % 2 == 0:
        return se_par(num ** 0.5)
    elif num == 0:
        print('É um quadrado perfeito!')
    else:
        return se_impar(num ** 0.5)


def se_par(num):
    if num % 2 == 0:
        print('Quadrado perfeito')
    else:
        print('Quadrado não perfeito')


def se_impar(num):
    if num % 2 == 0:
        print('Quadrado não perfeito')
    else:
        print('Quadrado perfeito')


# Entrada
numero = int(input('Digite um numero: '))
# Chamada da função
verificador(numero)
