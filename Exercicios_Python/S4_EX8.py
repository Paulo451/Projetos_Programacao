"""
Leia uma temperatura en graus Kelvin e apresente-a convertida em graus Celsius
"""

# entrada
temperatura = float(input('Digite uma temperatura em kelvin: \n'))

# processamento

resultado = temperatura - 273.15

# saida

print(f'Temperatura em Celsius {resultado}')
