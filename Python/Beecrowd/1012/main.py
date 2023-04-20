
A, B, C = input().split()

A = float(A)
B = float(B)
C = float(C)

pi = float(3.14159)

areaDoTriangulo = (A * C) / 2
areaDoCirculo = pi * (C * C)
areaDoTrapezio = ((A + B) * C) / 2
areaDoQuadrado = B * B
areaDoRetangulo = A * B

print("TRIANGULO: %.3f" % areaDoTriangulo)
print("CIRCULO: %.3f" % areaDoCirculo)
print("TRAPEZIO: %.3f" % areaDoTrapezio)
print("QUADRADO: %.3f" % areaDoQuadrado)
print("RETANGULO: %.3f" % areaDoRetangulo)




'''
TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
'''