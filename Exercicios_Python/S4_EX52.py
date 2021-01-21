"""
Faça um programa que leia quanto cada apostador investiu, o valor do prêmio, e imprima quanto cada um ganharia do premio com base no valor investido
"""

# entrada

premio = float(input('Digite o valor do premio:\n'))

a1 = float(input('Digite quanto o 1 apostador investiu:\n'))

a2 = float(input('Digite quanto o 2 apostador investiu:\n'))

a3 = float(input('Digite quanto o 3 apostador investiu:\n'))

# processamento

cte = premio/(a1+a2+a3)

p1 = a1*cte

p2 = a2*cte

p3 = a3*cte

# saida

print(f'Ganhador 1 leva: {p1}\nGanhador 2 leva: {p2}\nGanhador 3 leva: {p3}')
