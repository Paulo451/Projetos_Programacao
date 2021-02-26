"""
Escreva um código que apresente a classe Pessoa, com atributos nome, endereço
e telefone em o método imprimir. O método imprimir deve mostrar na tela os valores de todos os atributis
"""


class Pessoa:

    def __init__(self, nome, endereco, telefone):
        self.__nome = nome
        self.__endereco = endereco
        self.__telefone = telefone

    def imprimir(self):
        print(f'Nome: {self.__nome}\nEndereco: {self.__endereco}\nTelefone: {self.__telefone}')


p1 = Pessoa('Paulo Szuparits', 'Alameda dos Aicas, 392', '(11)9 8760-2831')

Pessoa.imprimir(p1)
