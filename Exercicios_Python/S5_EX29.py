"""
Faça uma prova de matemática para crianças que estão aprendendo a somar números
inteiros menores do que 100. Escolha números aleatórios entre 1 e 100, e mostre na
tela a pergunta: qual é a soma de a + b, onde a e b são os números aleatórios. Peça a
resposta. Faça cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas
corretas, além de quantas vezes o aluno acertou.
"""
from random import *

# Randomização + entrada de dados
n1 = randint(0, 100)
n2 = randint(0, 100)

pA = int(input(f'a)O numero a eh {n1} e o numero b eh {n2}\n qual eh a soma de a+b ?'))

n3 = randint(0, 100)
n4 = randint(0, 100)

pB = int(input(f'b)O numero a eh {n3} e o numero b eh {n4}\n qual eh a soma de a+b ?'))

n5 = randint(0, 100)
n6 = randint(0, 100)

pC = int(input(f'c)O numero a eh {n5} e o numero b eh {n6}\n qual eh a soma de a+b ?'))

n7 = randint(0, 100)
n8 = randint(0, 100)

pD = int(input(f'd)O numero a eh {n7} e o numero b eh {n8}\n qual eh a soma de a+b ?'))

n9 = randint(0, 100)
n10 = randint(0, 100)

pE = int(input(f'e)O numero a eh {n9} e o numero b eh {n10}\n qual eh a soma de a+b ?'))

cont = 0  # zerando o contador

print('Respostas:\n')

# Desvios condicionais + impressões dos resultados
if pA == (n1+n2):  # se correta
    cont = cont + 1
    print(f'{n1}+{n2}={pA} CORRETA')
else:  # se incorreta
    print(f'{n1}+{n2}={pA} INCORRETA\n Resposta correta:{n1}+{n2}={n1+n2}')
if pB == (n3+n4):  # se correta
    cont = cont + 1
    print(f'{n3}+{n4}={pB} CORRETA')
else:  # se incorreta
    print(f'{n3}+{n4}={pB} INCORRETA\n Resposta correta:{n3}+{n4}={n3 + n4}')
if pC == (n5+n6):  # se correta
    cont = cont + 1
    print(f'{n5}+{n6}={pC} CORRETA')
else:  # se incorreta
    print(f'{n5}+{n6}={pC} INCORRETA\n Resposta correta:{n5}+{n6}={n5 + n6}')
if pD == (n7+n8):  # se correta
    cont = cont + 1
    print(f'{n7}+{n8}={pD} CORRETA')
else:  # se incorreta
    print(f'{n7}+{n8}={pD} INCORRETA\n Resposta correta:{n7}+{n8}={n7 + n8}')
if pE == (n9+n10):  # se correta
    cont = cont + 1
    print(f'{n9}+{n10}={pE} CORRETA')
else:  # se incorreta
    print(f'{n9}+{n10}={pE} INCORRETA\n Resposta correta:{n9}+{n10}={n9 + n10}')

# contador de questões certas + impressão

if cont > 0:
    if cont == 5:
        print('Voce acertou todas as perguntas, parabéns')
    elif cont == 1:
        print('Voce acertou apenas 1 pergunta')
    else:
        print(f'Voce acertou {cont} perguntas')
else:
    print('Voce nao acertou nenhuma pergunta :(')
