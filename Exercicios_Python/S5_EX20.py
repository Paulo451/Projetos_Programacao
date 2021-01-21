"""
Classificação de triangulos, dado 3 valores
"""
# Entrada

a = float(input('Digite o lado a do triangulo:'))
b = float(input('Digite o lado b do triangulo:'))
c = float(input('Digite o lado c do triangulo:'))

# desvio
if a < b+c or b < c+a or c < b+a:
    if a == b == c:
        print('Triangulo Equilatero')
    elif a == b or b == c or c == a:
        print('Triangulo Isoceles')
    else:
        print('Triangulo Escaleno')
else:
    print('ERRO!')
