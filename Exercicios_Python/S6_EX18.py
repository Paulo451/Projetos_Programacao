"""
Escreva um algoritimo que leia certa qtd de números e imprima o maior deles
e quantas vezes o maior número foi lindo. A quantidade de números a serem lidos deve ser fornecida pelo
usuário.
"""
# Entrada
limite = int(input('Escolha a quantidade de numeros a ser lida'))

# Loop
maior = -999999
contador = 0

for i in range(limite):
    num = int(input(f'Escreva o {i} numero: '))
    if num >= maior:
        maior = num
    if num == maior:
        contador = contador + 1
print(f'O numero {maior} é o maior numero e ')