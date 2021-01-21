"""
Faça um vetor de tamanho 50 preenchido com o seguinte valor (i+5*i)%i+1, sendo i a posição do elemento no vetor. em seguida imprima o valor na tela
"""
# Criando a lista
lista = []

# Processamento
for i in range(0,50):
    num = (i+5*i)%(i+1)
    lista.append(num)

# Saída
print(lista)
