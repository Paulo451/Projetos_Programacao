"""
Elabore uma função que receba três notas de um aluno como parâmetros e uma letra. Se a letra for A, a função deverá caluclar a média aritimética das notas do aluno, se for P deverá calcular a média ponderada com pesos 5,3 e 2.
"""
# Funções


def entrada():
    notas = []
    for i in range(3):
        nota = float(input(f'Digite a {i + 1}º nota: '))
        notas.append(nota)
    n1, n2, n3 = notas
    return n1, n2, n3


def escolha_media(nota1, nota2, nota3):
    escolha = input('Escolha A para média aritimetica e P para media ponderada: ')
    escolha_new = escolha.lower()
    if escolha_new == 'a':
        return media_aritimetica(nota1, nota2, nota3)
    else:
        return media_ponderada(nota1, nota2, nota3)


def media_aritimetica(na1, na2, na3):
    media = (na1 + na2 + na3)/3
    print(f'A media aritimetica do aluno é: {media}')


def media_ponderada(np1, np2, np3):
    media = (np1*5 + np2*3 + np3*2)/(5 + 3 + 2)
    print(f'A media ponderada do aluno é: {media}')


# Parametros para entrada

n_1, n_2, n_3 = entrada()

# Parametros media

escolha_media(n_1, n_2, n_3)
