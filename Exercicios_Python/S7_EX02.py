"""
Crie um programa qie l~e 6 valores inteiros e, em seguida, mostre na tela os valores lidos
"""
# Entrada

lista = []

for ind in range(1,7):
    num = int(input(f'Digite o {ind} numero:\n'))
    lista.append(num)

print('Os elementos digitados foram', end=" :")
for elemento in lista:
    print(elemento, end=' ')
