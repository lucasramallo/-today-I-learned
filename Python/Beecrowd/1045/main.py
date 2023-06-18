lista = input().split()
listStringToNumber = []

for i in lista:
    toFloat = float(i)
    listStringToNumber += [toFloat]

listaOrdenada = sorted(listStringToNumber, reverse = True) # [7.0, 7.0, 5.0]

A, B, C = listaOrdenada





# lista = input().split()
# listaStringToNumber = [float(i) for i in lista]

# listaOrdenada = sorted(listaStringToNumber, reverse = True)

# A, B, C = listaOrdenada
# A = float(A)
# B = float(B)
# C = float(C)

# if A >= (B + C):
#     print("NAO FORMA TRIANGULO")
# else:

#     if A ** 2 == ((B ** 2) + (C ** 2)):
#         print("TRIANGULO RETANGULO")

#     if A ** 2 > ((B ** 2) + (C ** 2)):
#         print("TRIANGULO OBTUSANGULO")

#     if A ** 2 < ((B ** 2) + (C ** 2)):
#         print("TRIANGULO ACUTANGULO")

#     if A == B and A == C:
#         print("TRIANGULO EQUILATERO")

#     if A == B and A != C or A == C and A != B or B == C and B != A:
#         print("TRIANGULO ISOSCELES")

