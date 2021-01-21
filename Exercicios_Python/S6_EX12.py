"""
Faça um programa que leia um número inteiro positivo N e imprima todos os numeros naturais de
0 ate N em ordem descresente
"""
# ENTRADA
num = int(input('Digite um numero natural:\n'))

# loop
for i in range(num, -1, -1):
    print(i)
