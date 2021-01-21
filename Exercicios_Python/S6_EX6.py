"""
Faça um programa que leia 10 inteiros e imprima sua média
"""
# Entrada + loop
acm = 0
i = 0
for i in range(1, 11):

    num = float(input(f'Digite o {i} numero: '))
    acm = acm+num

# processamento
media = acm/i

# saida
print(f'A media dos numeros digitados é:{media}')
