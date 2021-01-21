"""
Faça um programa que possua um vetor denomindao A que armazene 6 numero inteiros. O programa deve executar os seguintes passos:
"""
# Criação dos vetores

A = [1, 0, 5, -2, -5, 7]
# Soma dos valores

soma = A[0] + A[2] + A[5]


# saída
print(f'A soma dos valores é : {soma}')

A[4] = 100

print(A[4])

print('\n \n')  # Quebra de linha

for elemento in A:
    print(elemento)
