"""
Faça uma função chamada DesenharLinha. Ele deve desenhar uma linha na tela usando vários simbolos de igual. A função recebe como parametro quantos sinais de igual serão mostrados.
"""
# Função


def DesenharLinha(iguais):
    for i in range(iguais):
        print('=', end="")


# Entrada
vezes = int(input('Digite o numero de linhas desejado: '))
# Chamada da função
DesenharLinha(vezes)
