A, B, C = input().split()

A = int(A)
B = int(B)
C = int(C)

maiorAB = (A + B + abs(A - B)) / 2

maior = (maiorAB + C + abs(maiorAB - C)) / 2

print("%.0f eh o maior" % maior)