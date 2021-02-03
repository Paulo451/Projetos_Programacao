"""
Leia uma matriz 4 x 4, conte e escreva quantos valores maiorses que 10 ela possui
"""
lista = []
matriz = []
maiores = []


for i in range(4):
    lista = []
    for num in range(4):
        numero = int(input('Digite um numero: '))
        lista.append(numero)
    matriz.append(lista)


for n in matriz:
    for num in n:
        if num > 10:
            maiores.append(num)

print(f'São {len(maiores)} numeros maiores que 10, os números são: {maiores}')
