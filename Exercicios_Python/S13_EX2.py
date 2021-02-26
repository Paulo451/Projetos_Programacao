"""
Faça um programa que receba do usuário um arquivo texto e mostre na tela quantas linhas o arquivo possui
"""

import os
with open('arq.txt', 'r') as leitura1:
    print(leitura1.read())

with open('arq.txt', 'r') as leitura:
    linhas = leitura.readlines()
    print(f' O texto possui {len(linhas)} linhas')

os.remove('arq.txt')
