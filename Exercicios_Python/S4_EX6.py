"""
Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
"""
# entrada
temperatura = float(input('Digite uma temperatura:\n'))

# processamento
resultado = temperatura * (9.0/5.0) + 32.0

# saida
print(f'Temperatura em Fahrenheit {resultado}')
