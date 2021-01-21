"""
Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em metros por segundo.
"""

# entrada

velocidade = float(input('Digite uma velocidade em Km/H:\n'))

# processamento

resultado = velocidade/3.6

# saída

print(f'A velocidade convertida para m/s eh: {resultado}')
