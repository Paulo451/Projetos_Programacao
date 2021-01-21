"""
Faça um algoritimo ultilizando while que mostra uma contagem regressiba na tela iniciando no 10 e terminando no 0
"""
# Ultilizando a biblioteca time
import time

# loop 1
num = 10
while num >= 0:
    print(num)
    num = num - 1
    time.sleep(1)
print('FIM')
