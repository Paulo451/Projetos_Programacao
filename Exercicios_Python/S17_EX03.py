"""
Escreva um código que apresente a classe Quadrado, com atributos
lado, área e perímetro e, os métodos calcularArea, calcularPerimetro e imprimir.
Os métodos calcularArea e calcularPerimetro devem efetuar seus respectivos
cálculos e colocar os valores nos atributos area e perimetro. O método imprimir
deve mostrar na tela os valores de todos os atributos.
"""


class Quadrado:

    __area = 0
    __perimetro = 0

    def __init__(self, lado):
        self.__lado = lado

    def calcular_area(self):
        Quadrado.__area = self.__lado * self.__lado

    def calcular_perimetro(self):
        Quadrado.__perimetro = 4 * self.__lado

    def imprimir(self):
        print(f'Lado: {self.__lado}\nArea: {Quadrado.__area}\nPerimetro: {Quadrado.__perimetro}')


q1 = Quadrado(2)
Quadrado.calcular_area(q1)
Quadrado.calcular_perimetro(q1)
Quadrado.imprimir(q1)
