"""
Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na tela. sorted
"""
# Criando a lista
lista = []
iguais = {1, 2}
iguais.clear()
# Entrada
for i in range(1, 11):
    num = input(f'Digite o {i} numero:\n')
    lista.append(num)
for p in range(0, 10):
    for j in range(0, 10):
        if lista[p] == lista[j] and p != j:
            iguais.add(lista[p])
# Transformando a lista
lIguais = list(iguais)
lIguais.sort()
# Saída
print(f'A lista de numeros : {lista} \n')
print('Os numeros que se repetem são: ', end=' ')
for elemento in lIguais:
    print(elemento, end=' ')
