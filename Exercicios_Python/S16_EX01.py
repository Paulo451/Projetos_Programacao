"""
Crie Umca Classe Para Representar Uma Pessoa Com Atributos Privados De Nome Idade E Altura

"""


class Pessoa:

    def __init__(self, nome, idade, altura):
        self.__nome = nome
        self.__idade = idade
        self.__altura = altura

    def mostrar_infos(self):
        print(f'Nome: {self.__nome}\nIdade: {self.__idade}\nAltura: {self.__altura}m')


nomeP = input('Digite o nome: ')
idadeP = int(input('Digite a idade: '))
alturaP = float(input('Digite a altura: '))

pessoa1 = Pessoa(nomeP, idadeP, alturaP)

pessoa1.mostrar_infos()
