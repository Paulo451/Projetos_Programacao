# Função

def alterar_nome(nome):
    """
    Função para alterar o valor de uma variavel global
    :param nome: Parametro de troca da variavel global
    """
    global nomeCandidato
    nomeCandidato = nome


# Declarando variavel publica

nomeCandidato = "Nome sem alteração"

# Mostrando variavel sem alteração

print(nomeCandidato)

# Chamada da função

alterar_nome('Nome alterado')

# Mostrando nome alterado

print(nomeCandidato)
