"""
Faça um programa que receba do usuário um arquivo texto e mostre na tela quantas vogais ele possui
"""
import os

vogais = ['a', 'e', 'i', 'o', 'u']
cont = 0
lista_d_letras = []

with open("arq.txt", 'r') as arquivo:
    lista = arquivo.readlines()
    for elemento in lista:
        letras_lista = elemento.split()
        for i in letras_lista:
            f = list(i)
            lista_d_letras.append(f)
    for a in lista_d_letras:
        for b in a:
            for vog in vogais:
                if b == vog:
                    cont += 1

print(f'Tem {cont} vogais')

os.remove('arq.txt')