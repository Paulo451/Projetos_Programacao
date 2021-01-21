"""
Sejam a e b os catetos de um triangulo, calcule o valor da hipotenusa
"""

# entrada

a = float(input('Digite o valor do cateto adjacente:'))

b = float(input('Digite o valor do cateto oposto:'))

# processamento

hipot = (a**2 + b**2)**0.5

# saída

print(f'A hipotenusa eh: {hipot}')
