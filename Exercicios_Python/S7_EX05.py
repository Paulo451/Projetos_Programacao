"""
Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui
"""
# Criando Lista
listaImpares = []
listaPares = []
# Entrada
for i in range(1, 11):
    num = int(input(f'Digite o {i} numero:\n'))
    if num % 2 == 0:
        listaPares.append(num)
    else:
        listaImpares.append(num)
# saida

print(f'Temos {len(listaPares)} numeros pares, são eles:{listaPares}')
print(f'Temos {len(listaImpares)} numeros impares, são eles:{listaImpares}')
