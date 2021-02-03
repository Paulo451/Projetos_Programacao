"""
Escreva uma função que receba um número inteiro maior do que zero e retorne a soma de todos os seus algarismos.
"""
# Funções


def verificacao(num_v):
    if num_v > 0:
        return soma_algarismos(num_v)
    else:
        print('O numero deve ser maior que zero')


def soma_algarismos(num_s):
    soma = 0
    while num_s > 0:
        soma += num_s % 10
        num_s = int(num_s/10)
    print(f'A soma dos algarismos de {num} é: {soma}')


# Entrada
num = int(input('Digite um numero maior que zero: '))
# Chamada da função
verificacao(num)
