"""
Escreva um programa que leia um inteuri entre 1 e 7 e imprima o dia da semana correspondente a este numero
"""
# entrada
num = int(input('Digite um numero:'))

# desvio
if num == 2:
    print('Segunda-Feira')
elif num == 3:
    print('Terca-Feira')
elif num == 4:
    print('Quarta-Feira')
elif num == 5:
    print('Quinta-Feira')
elif num == 6:
    print('Sexta-Feira')
elif num == 7:
    print('Sábado')
elif num == 1:
    print('Domingo')
else:
    print('ERRO, numero invalido')
