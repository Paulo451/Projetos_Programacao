"""
A quantia de R$ 780.000,00 será dividida entre três ganhadores de um concurso.
    O primeiro recebera 46%, o segundo 32% e o terceiro o restante.
"""

# processamento

quantia = int(780_000)

g1 = quantia * 0.46

g2 = quantia * 0.32

g3 = quantia - (g1 + g2)

# saída

print(f'Ganhador 1: {g1}\n Ganhador 2: {g2}\n Ganhador 3: {g3}')