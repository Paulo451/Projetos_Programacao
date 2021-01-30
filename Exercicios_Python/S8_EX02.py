"""
Faça uma função que receba a data atual e exiba-a na tela no formato textual por extenso
"""
# Funções


def data_ext(dia, mes, ano):
    """
    Função para transformar o mes em extenso
    :param dia: dia do ano em inteiro
    :param mes: mes do ano em inteiro
    :param ano: ano em inteiro
    :return: retorna uma string com dia em inteiro ano em string e mes em inteiro
    """
    if mes == 1:
        mesext = 'Janeiro'
    elif mes == 2:
        mesext = 'Fevereiro'
    elif mes == 3:
        mesext = 'Março'
    elif mes == 4:
        mesext = 'Abril'
    elif mes == 5:
        mesext = 'Maio'
    elif mes == 6:
        mesext = 'Junho'
    elif mes == 7:
        mesext = 'Julho'
    elif mes == 8:
        mesext = 'Agosto'
    elif mes == 9:
        mesext = 'Setembro'
    elif mes == 10:
        mesext = 'Outubro'
    elif mes == 11:
        mesext = 'Novembro'
    else:
        mesext = 'Dezembro'
    return f'{dia} de {mesext} de {ano}'


def transformando(value):
    """
    Transforma a string digitada no input1 em valores inteiros
    :param value: string digitada no input1
    :return: retorna dia, mes e ano em inteiros
    """
    date_new = value.split("/")
    lista = []
    for i in date_new:
        lista.append(int(i))
    dia_t, mes_t, ano_t = lista
    return validacao(dia_t, mes_t, ano_t)


def validacao(dia_v, mes_v, ano_v):
    """
    Valida se a data digitada no input1 é válida
    :param dia_v: dia em inteiro
    :param mes_v: mes em inteiro
    :param ano_v: ano em inteiro
    :return: retorna o print do valor retornado na data_ext
    """
    if 31 >= dia_v >= 1 and 1 <= mes_v <= 12:
        return print(data_ext(dia_v, mes_v, ano_v))
    else:
        print('Data inválida')


# Input
num = input('Digite uma data válida: ')  # input1

# Chamada da função transformando
transformando(num)
