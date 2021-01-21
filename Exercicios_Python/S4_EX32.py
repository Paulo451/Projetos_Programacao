"""
Leia um nuemro inteiro e imprima a soma do sucessor de su triplo com o antecessor de seu dobro
"""

# entrada

num = int(input('Digite um numero inteiro:\n'))

# processamento

st = (num * 3) + 1

ad = (num * 2) - 1

# saída

print(ad+st)