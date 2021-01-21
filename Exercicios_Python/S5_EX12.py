"""
Ler um numero inteiro. Se o numero foi positivo, calcule o log.
"""
import math
# Entrada
num = float(input('Digite um numero para efetuar seu log:'))
base = float(input('Digite a base do log:'))

# desvio
if num > 0 and base > 0:
    print(f'O resultado do log de {num} na base {base} eh: {math.log(num, base)}')
else:
    print('Erro, numero invalido')
