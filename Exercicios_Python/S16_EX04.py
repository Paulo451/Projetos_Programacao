"""
Crie uma classe Televisão e uma classe Controle Remoto que pode controlar o volume e trocar os canais da televisão
"""


class Televisao:

    __canais = []

    def __init__(self, volume):
        self.__volume = volume

    def adicionar_canais(self, canal):
        self.__canais.append(canal)

    def get_canais(self):
        return self.__canais

    def get_volume(self):
        return self.__volume


class ControleRemoto:

    __volume = 0
    __canal = 0

    def aumentar_volume(self):
        if ControleRemoto.__volume < Televisao.get_volume(televisao):
            self.__volume = ControleRemoto.__volume + 1
            ControleRemoto.__volume = self.__volume
        else:
            print('Volume no Máximo')

    def diminuir_volume(self):
        if ControleRemoto.__volume < Televisao.get_volume(televisao):
            self.__volume = ControleRemoto.__volume - 1
            ControleRemoto.__volume = self.__volume
        else:
            print('Volume no Máximo')

    @staticmethod
    def mostar_volume():
        print(f'Volume: {ControleRemoto.__volume}')

    def aumentar_canal(self):
        if ControleRemoto.__canal + 1 < len(Televisao.get_canais(televisao)):
            self.__canal = ControleRemoto.__canal + 1
            ControleRemoto.__canal = self.__canal
        else:
            self.__canal = 0
            ControleRemoto.__canal = self.__canal

    def diminuir_canal(self):
        if ControleRemoto.__canal > 0:
            self.__canal = ControleRemoto.__canal - 1
            ControleRemoto.__canal = self.__canal
        else:
            self.__canal = len(Televisao.get_canais(televisao)) - 1
            ControleRemoto.__canal = self.__canal

    @staticmethod
    def trocar_canal(canal):
        if canal <= len(Televisao.get_canais(televisao)) or canal >= 0:
            ControleRemoto.__canal = canal
        else:
            print('Canal não encontrado')

    @staticmethod
    def mostrar_canais():
        print(f'{Televisao.get_canais(televisao)}')

    @staticmethod
    def mostrar_canal_atual():
        print(f'{Televisao.get_canais(televisao)[ControleRemoto.__canal]}')


televisao = Televisao(10)
controle = ControleRemoto()

lista_canais = ['0-Globo', '1-SBT', '2-Record', '3-Band', '4-Cultura', '5-Telecine 1', '6-Telecine 2', '7-Telecine 3']

for elemento in lista_canais:
    Televisao.adicionar_canais(televisao, elemento)

controle.mostrar_canais()
controle.trocar_canal(3)
controle.mostrar_canal_atual()
controle.aumentar_canal()
controle.mostrar_canal_atual()

