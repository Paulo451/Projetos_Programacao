"""
Escreva um código que apresente a classe Moto, com atributos marca,
modelo, cor e marcha e, o método imprimir. O método imprimir deve mostrar na
tela os valores de todos os atributos. O atributo marcha indica em que a marcha
a Moto se encontra no momento, sendo representado de forma inteira, onde 0 -
neutro, 1 — primeira, 2 — segunda, etc.
"""


class Moto:

    __marcha_atual = 0

    def __init__(self, marca, modelo, cor, marcha):
        self.__marca = marca
        self.__modelo = modelo
        self.__cor = cor
        self.__marcha = marcha

    def trocar_marcha(self, marcha):
        if marcha <= self.__marcha:
            Moto.__marcha_atual = marcha
        else:
            print(f'Marcha maxima atingida')

    def imprimir(self):
        print(f'Moto de marca {self.__marca}, modelo {self.__modelo}, cor {self.__cor} e está'
              f'na marcha {Moto.__marcha_atual}')


m1 = Moto('BMW', 'XR1', 'Azul', 6)
Moto.imprimir(m1)
Moto.trocar_marcha(m1, 5)
Moto.imprimir(m1)
Moto.trocar_marcha(m1, 7)
Moto.imprimir(m1)
