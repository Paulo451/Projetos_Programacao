"""
Escreva um programa que leia 10 números inteiros e os armazene em um vetor. imprima o vetor, o maior elemento e a posição que ele se encontra
"""
# Criando a lista
lista = []

# Entrada
for i in range(1,11):
    num = int(input(f'Digite o {i} numero:\n'))
    lista.append(num)

# Processamento
maior = (max(lista))

# Saída
print(f'O maior elemento é: {maior}, ele se encontra na posição {lista.index(maior)}')
