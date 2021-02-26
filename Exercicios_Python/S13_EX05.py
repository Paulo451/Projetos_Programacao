"""
Faça um programa que receba do usuário um arquivo texto e um caractere. Mostre na tela quantas vezes aquele caractere ocorre dentro do arquivo
"""
import os
count = 0

with open('arq.txt', 'r') as arquivo:
    carac = input('Digite um caractere para busca: ')
    lista_texto = arquivo.readlines()
    for linha in lista_texto:
        palavras = linha.split()
        for palavra in palavras:
            lista_letras = list(palavra)
            for letra in lista_letras:
                if letra == carac:
                    count += 1


print(f'o texto tem {count} cacateres {carac}')

os.remove('arq.txt')
