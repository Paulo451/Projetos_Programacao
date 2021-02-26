"""
Faça um programa que receba do usuário um arquivo texto. Crie outro arquivo texto contendo o texto do arquivo de entrada mas com as vogais subistituidas por '*'
"""

import os
vogais = ['a', 'e', 'i', 'o', 'u']
lista_letras_r = []
lista_arquivo = []
count = 0

with open('arq.txt', 'r') as arquivo:

    lista_texto = arquivo.readlines()

    for linha in lista_texto:
        y = linha.replace('\n', '∞')
        palavras1 = y.split()
        x = '✄'.join(palavras1)
        palavras = list(x)
        for palavra in palavras:
            lista_letras = list(palavra)
            for letra in lista_letras:
                for vogal in vogais:
                    if letra == vogal:
                        letra = '*'
            lista_letras_r.append(letra)

with open('arq2.txt', 'w') as arquivo2:
    for elemento in lista_letras_r:
        if elemento == '✄':
            elemento = ' '
        if elemento == '∞':
            elemento = '\n'
        arquivo2.write(elemento)

os.remove('arq2.txt')
os.remove('arq.txt')





