"""
Faça uma função que receba 3 números inteiros como parâmetro, representando horas, minutos e segundos e os converta em segundos
"""
# Funções


def transformando(horas):
    horas_spliced = horas.split(":")
    lista = []
    for i in horas_spliced:
        lista.append(int(i))
    horas, minutos, segundos = lista
    return convertendo(horas, minutos, segundos)


def convertendo(horas, minutos, segundos):
    minutos_a_mais = horas * 60
    minutos_nv = minutos + minutos_a_mais
    segundos_a_mais = minutos_nv * 60
    segundos_nv = segundos + segundos_a_mais
    print(f'{horas}:{minutos}:{segundos} em segundos é igual a : {segundos_nv}')


# Entrada
horario = input('Digite horas minutos e segundos (neste formato: horas:minutos:segundos): ')

# Chamada da função
transformando(horario)
