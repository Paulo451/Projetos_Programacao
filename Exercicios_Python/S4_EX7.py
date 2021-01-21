"""
Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius
"""

# entrada
temperatura = float(input('Digite uma temperatura em Fahrenheit:\n'))

# processamento

resultado = 5.0 * (temperatura-32.0)/9.0

# saída

print(f'A temperatura em graus Celsius eh {resultado}')
