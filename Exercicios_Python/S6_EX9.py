"""
Faça um programa que leia um número inteiro N e depois imprima os N primeiros números naturais ímpares.
"""
# Entrada
num = int(input('Digite um numero inteiro: '))

# Loop
i = 0
while i < num:
    i = i+3
    print(i)
