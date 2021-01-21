"""
Faça um programa que leia dois vetores de 10 posiçoes e calcule outro vetor contendo nas posições pares os valores do primeiro e nas posições impares os valores do segundo
"""
# Criando as listas
a = []
b = []
result = []
# Entrada
for i in range(0, 10):
    numA = int(input(f'Conjunto A: Digite o {i+1} numero:\n'))
    a.append(numA)
for s in range(0, 10):
    numB = int(input(f'Conjunto B: Digite o {s+1} numero:\n'))
    b.append(numB)

# Processamento
for p in range(0, 10):
    if p % 2 == 0:
        if a[p] % 2 == 0:
            if b[p] % 2 == 0:
                result.insert(p, a[p])
                result.insert(p+2, b[p])
            else:
                result.insert(p, a[p])
        elif b[p] % 2 == 0:
            result.insert(p, b[p])
        else:
            result.insert(p, 'S.V')
    else:
        if a[p] % 2 != 0:
            if b[p] % 2 != 0:
                result.insert(p, a[p])
                result.insert(p+2, b[p])
            else:
                result.insert(p, a[p])
        elif b[p] % 2 != 0:
            result.insert(p, b[p])
        else:
            result.insert(p, 'S.V')

print(result)
