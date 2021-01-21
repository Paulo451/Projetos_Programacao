"""
Calculadora
"""
# Entrada
num = float(input('Digite um numero:'))
op = input('Digite uma operacao(+, -, *, /):')
num2 = float(input('Digite um numero:'))

# Desvios
if op == '+':
    print(f'{num}+{num2} = {num+num2}')
elif op == '-':
    print(f'{num}-{num2} = {num - num2}')
elif op == '*':
    print(f'{num}*{num2} = {num * num2}')
elif op == '/':
    if num2 == 0:
        print('ERRO! Divisao por zero')
    else:
        print(f'{num}/{num2} = {num / num2}')
