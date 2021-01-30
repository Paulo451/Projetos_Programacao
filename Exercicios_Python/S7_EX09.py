"""
Crie um programa que lê 6 valores inteiros pares e em seguida mostre os valores lidos na ordem inversa
"""
# Criando a lista
lista = []

# Entrada
for i in range(1, 7):
    p = False
    while not p:
        num = int(input('Digite um numero par:\n'))
        if num % 2 == 0:
            p = True
            lista.append(num)
        else:
            print(f'{num} não é par!, digite outro número!')

# Saída
for s in range(5, -1, -1):
    print(lista[s])
