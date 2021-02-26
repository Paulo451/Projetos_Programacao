"""
Converta os valores digitados para uma moeda especifica
"""
# Declaração de listas
nome = ""
cotacao = 1
cotacao2 = 1
lista = []
key = 'S'
# Entrada de dados
moeda = input('Escolha uma moeda\n'
              'E = Euro\n'
              'D = Dolar\n'
              'R = Real\n'
              'L = Libra esterlina')

moeda2 = input('Converter para\n'  
              'E = Euro\n'
              'D = Dolar\n'
              'R = Real\n'
              'L = Libra esterlina')

if moeda.upper() == 'E':
    cotacao = 6.45
    nome = "Euro"
elif moeda.upper() == 'D':
    cotacao = 5.35
    nome = "Dolar"
elif moeda.upper() == 'R':
    cotacao = 1
    nome = "Real"
elif moeda.upper() == 'L':
    cotacao = 7.35
    nome = "Libra esterlina"

if moeda2.upper() == 'E':
    cotacao2 = 6.45
elif moeda2.upper() == 'D':
    cotacao2 = 5.35
elif moeda2.upper() == 'R':
    cotacao2 = 1
elif moeda2.upper() == 'L':
    cotacao2 = 7.35
while key.upper() == 'S':
    real = float(input(f'Digite o valor em  {nome}: '))
    lista.append(real)
    key = input('Deseja digitar mais um valor (s para sim n para não)')

# Saída de dados
if cotacao2 > cotacao:
    res = cotacao2/cotacao
    print(list(map(lambda x: x * res, lista)))
else:
    res = cotacao/cotacao2
    print(list(map(lambda x: x * res, lista)))
