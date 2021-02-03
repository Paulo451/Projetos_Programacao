"""
Escreva uma função que gera um triângulo de altura e lados n e base 2n-1. Por exemplo, a saída para n = 6 seria:
"""


def verifiacao(alt_v, f2, esp_v):
    if alt_v > 0:
        return fazer_triangulo(alt_v, f2, esp_v)
    else:
        print('Altura deve ser maior que zero! ')


def fazer_triangulo(altura, formula2, espacos):
    for i in range(altura):
        for e in range(espacos):
            print(" ", end="")
        for s in range(formula2):
            print("*", end="")
        for e in range(espacos):
            print(" ", end="")
        espacos -= 1
        formula2 += 2
        print("\n")


alt = int(input('Digite a altura do trinagulo: ')) + 1

formula1 = 2*alt-1

formula_2 = 2*alt - 2*alt-1

esp = int(formula1/2)

verifiacao(alt, formula_2, esp)
