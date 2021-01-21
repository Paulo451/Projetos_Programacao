"""
Faça um programa que leia 2 notas de um aluno e exiba na tela a media dessas notas.
"""
# entrada
n1 = float(input('Digite duas notas para efetuar o calculo da media:\n'))
n2 = float(input())

# desvio
if (0.0 < n1 < 10.0 or n1 == 10.0) and (0.0 < n2 < 10.0 or n2 == 10.0):
    print(f'A media das notas eh: {(n1+n2)/2}')
else:
    print('ERRO! valor da nota invalido')
