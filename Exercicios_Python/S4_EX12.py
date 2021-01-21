"""
Leia uma distância em milhas e apresente-a convertida em quilometros
"""

# entrada

distancia = float(input('Digite uma distancia em milhas:\n'))

# processamento

resultado = 1.61 * distancia

# saida

print(f'A distancia convertida em KM eh: {resultado}')
