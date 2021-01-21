"""
Faça um programa que leia um vetor de 8 posições e, em seguida, leia tgambém dois valores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.
"""
# Criando Lista

lista = []

# Entrada
for i in range(1,9):
    num = int(input(f'Digite o {i} numero:\n'))
    lista.append(num)

# Escolha dos indices
x = int(input('Digite um valor para x:\n'))
y = int(input('Digite um valor para y:\n'))

result = lista[x] + lista[y]

print(f'A soma dos valores {lista[x]} e {lista[y]} é {result}')
