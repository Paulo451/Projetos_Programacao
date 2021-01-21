"""
Leia um numero fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
"""
# entrada
num = float(input('Digite um numero:\n'))

# desvio
if num > 0 or num == 0:
    print(f'A raiz quadrada de {num} eh {num**0.5}')
else:
    print('ERRO!, numero negativo')
