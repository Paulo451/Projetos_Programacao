"""
Faça uma função que receba um vetor de inteiros e o preencha com números aleatorios sem repetição
"""
from random import randint

numeros = (randint(1, 1000) for numero in range(5))

print(list(numeros))