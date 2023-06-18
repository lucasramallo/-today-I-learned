matrizA = []
matrizB = []
matrizResultante = []


def separarColunas(matriz):
  colunas = []
  for i in range(len(matrizB[0])):
    for linha in matrizB:
      colunas.append(int(linha[i]))
  return colunas

def apresentarMatriz(matriz):
  print("\nA multiplicação resultou na matriz:\n")
  print(*matriz, sep="\n")


# Validações de entrada

print("--- Matriz 1 ---\n")

numeroDeLinhasDaMatrizA = int(input("A matriz possui quantas linhas? > "))
numeroDeColunasDaMatrizA = int(input("A matriz possui quantas colunas? > "))

numeroDeLinhas = 1
for i in range(numeroDeLinhasDaMatrizA):
  linha = input(
    f"Digite os valores da linha {numeroDeLinhas} separados por espaço: ")
  matrizA.append(linha.strip().split())
  numeroDeLinhas += 1

# Matrix 2
condicaoInvalida = True
while condicaoInvalida:
  print("\n--- Matriz 2 ---\n")
  numeroDeLinhasDaMatrizB = int(input("A matriz possui quantas linhas? > "))
  if numeroDeLinhasDaMatrizB != numeroDeColunasDaMatrizA:
    print(
      "⚠️ Para que a multiplicação de matrizes seja definida, o número de linhas da segunda matriz tem que ser igual ao número de colunas da primeira matriz!"
    )
  else:
    numeroDeColunasDaMatrizB = int(
      input("A matriz possui quantas colunas? > "))
    condicaoInvalida = False

numeroDeLinhas = 1
for i in range(numeroDeLinhasDaMatrizB):
  linha = input(
    f"Digite os valores da linha {numeroDeLinhas} separados por espaço: ")
  matrizB.append(linha.strip().split())
  numeroDeLinhas += 1


# Multiplicação

colunasMatrizB = separarColunas(matrizB)

for index in range(len(matrizA)):
  indexDeB = 0
  linhaResultante = []
  
  for _ in range(len(matrizB[0])):
    soma = 0
    for el in matrizA[index]:
      indexDeB += 1
      mult = int(el) * colunasMatrizB[indexDeB - 1]
      soma += mult

    linhaResultante.append(soma)
  matrizResultante.append(linhaResultante)
  
apresentarMatriz(matrizResultante)
