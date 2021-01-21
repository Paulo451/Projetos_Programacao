"""
Programa de ajuda a vendedores:
    O total a pagar com o desconto de 10%
    O valor de cada parcela, no porcelamento de 3x sem juros
    A comissão do vendedor, no caso da venda ser a vista(5% sobre o valor com desconto)
    A comissão do vendedor, no caso da venda ser parcelada(5% sobre o valor total)
"""

# entrada

valor = float(input('Insira um valor:\n'))

# processo

totalDesc = valor - (valor * 0.1)

parcela = valor/3

comisV = totalDesc * 0.05

comisP = valor * 0.05

# saída

print(f'Total a pagar com desconto: {totalDesc}\n Valor de cada parcela (3x s/juros): {parcela}\n Comissao do vendedor a vista: {comisV}\n Comissao do vendedor parcelado: {comisP}')