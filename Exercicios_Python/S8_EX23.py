"""
Escreva uma função que gera um triangulo lateral de altura 2*n-1 e b largura.

"""
# Função


def triangulo(lista_r, lista2_t):

    for i in lista_r:
        while i > 0:
            print("*", end="")
            i -= 1
        print("\n")

    for f in lista2_t:
        while f > 0:
            print("*", end="")
            f -= 1
        print("\n")


# Entrada
n = int(input('Digite uma largura para um triangulo: '))

# Listas
lista = [n]
lista2 = []


# Fazendo a lista

while 0 < n - 1:
    lista.append(n-1)
    lista2.append(n-1)
    n -= 1

listaR = lista[::-1]

# Chamada da função
triangulo(listaR, lista2)
