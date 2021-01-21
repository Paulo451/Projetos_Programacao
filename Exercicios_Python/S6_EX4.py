"""
Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente de 100 em 100,
imprimindo seu valor na tela, até que seu bvalor seja cem mil
"""
# entrada
num2 = int(input('Digite um valor inteiro:'))

# loop
for num in range(0, 100_000, 1000):
    if num == 0:
        print(num)
    else:
        print(num + num2)
