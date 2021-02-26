"""
Crie uma classe Agenda que pode armazenar 10 pessoas
"""


class Pessoa:

    def __init__(self, nome, idade, altura):
        self.__nome = nome
        self.__idade = idade
        self.__altura = altura

    def mostrar_infos(self):
        print(f'Nome: {self.__nome}\nIdade: {self.__idade}\nAltura: {self.__altura}m')

    def get_nome(self):
        return self.__nome

    def get_idade(self):
        return self.__idade

    def get_altura(self):
        return self.__altura


class Agenda:
    __contatos = []

    def adicionar_contatos(self, pessoa):
        self.__contatos.append(pessoa)

    def remover_contato(self, nome):
        flag = True
        for dados in self.__contatos:
            name = Pessoa.get_nome(dados)
            if nome == name:
                print(f'Contato {name} removido')
                self.__contatos.remove(dados)
                flag = False
        if flag is True:
            print(f'Nome Não Encontrado')

    def busca_pessoa(self, nome):
        flag = True
        for dados in self.__contatos:
            name = Pessoa.get_nome(dados)
            if nome == name:
                print(f'{self.__contatos.index(dados)}')
                flag = False
        if flag is True:
            print(f'Nome Não Encontrado')

    def imprimir_agenda(self):
        for dados in self.__contatos:
            print(f'{self.__contatos.index(dados)} - Nome: {Pessoa.get_nome(dados)}')
            print(f'    Idade: {Pessoa.get_idade(dados)}')
            print(f'    Altura: {Pessoa.get_altura(dados)} \n')

    def imprimir_pessoa(self, index):
        print(f'{Pessoa.get_nome(self.__contatos[index])}')


p1 = Pessoa('Paulo', 19, 1.84)
p2 = Pessoa('Luiz', 29, 1.80)
p3 = Pessoa('Carlos', 39, 1.54)
p4 = Pessoa('Antonio', 11, 1.74)
p5 = Pessoa('Maria', 15, 1.32)
p6 = Pessoa('Luiza', 14, 1.99)
p7 = Pessoa('Carminha', 16, 1.86)
p8 = Pessoa('Drumont', 89, 1.79)
p9 = Pessoa('Pedro', 49, 1.54)
p10 = Pessoa('Lauro', 6, 1.77)

lista_pessoas = [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10]

agenda = Agenda()

for elemento in lista_pessoas:
    Agenda.adicionar_contatos(agenda, elemento)


