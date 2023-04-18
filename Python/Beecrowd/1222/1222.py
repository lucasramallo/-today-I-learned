while True:
  try:
    N, L, C = input().split(" ")
    text = input()

    N = int(N)
    L = int(L)
    C = int(C)

    maximoDeCaracteres = L * C
    numeroDeCaracteresDoTexto = len(text)

    numeroDePaginas = numeroDeCaracteresDoTexto // maximoDeCaracteres

    print(numeroDePaginas)

  except EOFError:
    break

#n - o número de palavras do conto de Machado
#l - o número máximo de linhas por página
#c - número máximo de caracteres por linha