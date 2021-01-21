"""
Faça um programa que receba do usuário um vetor com 10 posições. Em seguida deverá ser impresso o maior e o menor elemento do vetor.
"""
# Criando lista
lista = []

# Entrada
for i in range(1, 11):
    num = int(input(f'Digite o {i} numero:\n'))
    lista.append(num)

# Saída
print(f'O maior valor da lista é {max(lista)}')
print(f'O menor valor da lista é {min(lista)}')
