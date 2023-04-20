import math

while True:
  try:
    N, L, C = input().split(" ")
    text = input().split()

    N = int(N)
    L = int(L)
    C = int(C)

    line = ""
    lines = 1

    for word in text:
         if line == "":
            line = word
         else:
            if len(line + " " + word) > C:
               lines += 1
               line = word
            else:
               line += " " + word

    result = math.ceil(lines/L)

    print(result)

  except EOFError:
    break

#n - o número de words do conto de Machado
#l - o número máximo de linhas por página
#c - número máximo de caracteres por linha



