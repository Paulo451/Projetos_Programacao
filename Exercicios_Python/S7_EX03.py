"""
Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos têsm 10 elementos cada. Imprimir todos os conjuntos
"""
# Criando lista
lista = []
resultados = []

# Entrada
for indice in range(1,11):
    num = float(input(f'Digite o {indice} numero:\n'))
    lista.append(num)
    quad = num ** 2
    resultados.append(quad)

# saida
print(lista)

print(resultados)