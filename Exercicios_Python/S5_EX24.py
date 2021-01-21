"""
Calculo de imposto de acordo com o estado.
"""
# Entrada
est = input('Digite o destino desejado (mg, sp, rj, ms):')
uf = est.upper()

# verificacao
if uf == 'SP' or uf == 'MG' or uf == 'RJ' or uf == 'MS':
    valor = float(input('Digite o valor da carga:'))
    if uf == 'SP':
        print(f'O valor da carga com os impostos eh de : {valor * 1.12}')
    elif uf == 'MG':
        print(f'O valor da carga com os impostos eh de : {valor * 1.07}')
    elif uf == 'RJ':
        print(f'O valor da carga com os impostos eh de : {valor * 1.15}')
    elif uf == 'MS':
        print(f'O valor da carga com os impostos eh de : {valor * 1.08}')
else:
    print('Erro, estado inválido')
