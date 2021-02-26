"""
Escreva um código que apresente a classe Retângulo, com atributos
comprimento, largura, área e perímetro e, os métodos calcularArea,
calcularPerimetro e imprimir. Os métodos calcularArea e calcularPerimetro
devem efetuar seus respectivos cálculos e colocar os valores nos atributos area e
perimetro. O método imprimir deve mostrar na tela os valores de todos os
atributos.
"""


class Retangulo:

    __area = 0
    __perimetro = 0

    def __init__(self, comprimento, largura):
        self.__comprimento = comprimento
        self.__largura = largura

    def calcular_area(self):
        Retangulo.__area = self.__comprimento * self.__largura

    def calcular_perimetro(self):
        Retangulo.__perimetro = (2 * self.__comprimento) + (2 * self.__largura)

    def imprimir(self):
        print(f'Largura: {self.__largura}\nComprimento: {self.__comprimento}\n'
              f'Area: {Retangulo.__area}\nPerimetro: {Retangulo.__perimetro}')


r1 = Retangulo(3, 2)
Retangulo.calcular_area(r1)
Retangulo.calcular_perimetro(r1)
Retangulo.imprimir(r1)
