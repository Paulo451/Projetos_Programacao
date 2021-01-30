# Definindo a função

def ultimo_nome(nomes):
    """
    Função para retornar o ultimo elemento de uma lista de strings
    :param nomes: lista com os nomes (string)
    :return: retorna o ultimo elemento da lista
    """
    lista = []
    count = -1  # Inicializando o contador com um numero a menos ja que a lista começa a contagem do 0

    for i in nomes:
        lista.append(i)  # Colocando elementos na lista
        count += 1
    return lista[count]

# Criação da lista

lista2 = ['Bill Gates', 'Steve Jobs', 'Elon Musk', 'Mark Zuckerberg', 'Henry Ford']

# Saída

print(f'O ultimo registro eh: {ultimo_nome([*lista2])}')
