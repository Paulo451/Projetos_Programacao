# Entrada de dados

num = int(input('Digite um numero: '))

# Inicialização da "flag"

flag = 0  # Flag irá mostrar se o numero passou pelo desvio, ou seja, foi dividido com resto 0 por mais de um numero

# Verificação

for count in range(2, num):
    if num % count == 0:
        flag += 1

# Saída de dados

if flag == 0:
    print(f'{num} eh primo')
else:
    print(f'{num} NAO eh primo')
