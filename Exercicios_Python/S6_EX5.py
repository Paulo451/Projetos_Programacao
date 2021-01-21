"""
Faça um programa que leia 10 inteiros e some-os
"""
# Entrada + loop
acm = 0
for i in range(1, 11):
    num = int(input(f'Digite o {i} número'))
    acm = acm+num
print(f'A soma dos valores digitados é: {acm}')
