"""
Crie uma classe denominada Elevaor para armazenar as informações de um elevador dentro de um prédio
"""


class Elevador:

    __andares = []
    __elevador = []
    __andar = 0

    def __init__(self, capacidade, total):
        self.__capacidade = capacidade
        self.__total = total
        self.__elevador = ['0' for i in range(self.__capacidade)]
        for andar in range(self.__total):
            self.__andares.append(['0' for i in range(self.__capacidade)])

    def entra(self):
        if self.__elevador[self.__capacidade - 1] == '0':
            for p in range(self.__capacidade):
                if self.__elevador[p] != '1':
                    self.__elevador[p] = '1'
                    break
        else:
            print('Elevador cheio')
        self.__andares[self.__andar] = self.__elevador
        print(f'{self.__andares}')

    def sair(self):
        if self.__elevador[0] == '1':
            self.__elevador.remove('1')
            self.__elevador.append('0')
        else:
            print('Elevador vazio')
        self.__andares[self.__andar] = self.__elevador
        print(f'{self.__andares}')

    def sobe(self):
        if self.__andar < self.__total:
            self.__andar = Elevador.__andar + 1
            self.__andares[self.__andar] = self.__elevador
            Elevador.__andar = self.__andar
            self.__andares[self.__andar - 1] = ['0' for i in range(self.__capacidade)]
        else:
            print('Ultimo Andar')

        print(f'{self.__andares}')

    def desce(self):
        if self.__andar > 0:
            self.__andar = Elevador.__andar - 1
            self.__andares[self.__andar] = self.__elevador
            Elevador.__andar = self.__andar
            self.__andares[self.__andar + 1] = ['0' for i in range(self.__capacidade)]
        else:
            print('Primeiro andar')
            self.__andares[self.__andar] = self.__elevador

        print(f'{self.__andares}')


elevador = Elevador(3, 5)


elevador.entra()
elevador.entra()
elevador.entra()
elevador.sobe()
elevador.sobe()
elevador.sair()
elevador.desce()


