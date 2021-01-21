"""
Faça um programa que leia 1- numeros e escreva o menor valor lido e o maior valor lido.
"""
# Entrada + loop
maior = -9999999
menor = 99999999
for i in range(10):
    num = float(input(f'Digite o {i+1}º numero: '))
    if num > maior:
        maior = num
    if num < menor:
        menor = num
print(f'O maior numero é : {maior}\n O menor numero é: {menor}')
