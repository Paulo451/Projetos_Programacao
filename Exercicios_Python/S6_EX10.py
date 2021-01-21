"""
Faça um programa que calcule e mostre a soma dos 50 primeiros números pares
"""
# Loop
acm = 0
i = 0
while i <= 50:
    acm = acm + i*2
    i = i+1
print(f'A soma dos 50 primeiros numeros pares é : {acm}')
