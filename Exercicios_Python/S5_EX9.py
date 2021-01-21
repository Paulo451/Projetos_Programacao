"""
Leia o salário de um trabalhador e o valor da presyação de um emprestimo, imprima se o emprestimo foi concedido ou nao
"""
# Entrada
sal = float(input('Digite seu salario:'))
emp = float(input('Digite o valor da prestacao:'))

# Desvio
if emp>(sal*0.2):
    print('Emprestimo nao concedido')
else:
    print('Emprestimo concedido')
