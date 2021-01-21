"""
Faça um programa que receba dois numeros e mostre qual deles é maior
"""
# entrada
num = int(input('Digite dois numeros interios:'))
num2 = int(input())
# desvio
if num > num2:
    print(f'{num}>{num2}')
elif num < num2:
    print(f'{num2}>{num}')
else:
    print(f'{num}={num2}')
