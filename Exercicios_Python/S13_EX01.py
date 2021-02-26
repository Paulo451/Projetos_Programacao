"""
Escreva um programa que:
Crie/abra um arquivo texto de nome arq.txt
Permita que o usuário grave diversos caracteres nesse arquivo até que o usuário entre com o caractere 0
Feche o arquivo
"""

import os
with open('arq.txt', 'r') as arquivo:
    print(arquivo.read())

with open('arq.txt', 'w') as arquivo:
    while True:
        carac = input('Digite um caractere(se quiser sair digite 0): \n')
        if carac != '0':
            arquivo.write(carac + '\n')
        else:
            break

with open('arq.txt', 'r') as arquivo:
    print(arquivo.read())

os.remove('arq.txt')
