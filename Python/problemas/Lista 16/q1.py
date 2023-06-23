loop = True
list = []
i = 0
print("BEM-VINDO Cicinho Cabeça 👨‍🔧")
print("Ao adicionar todas as peças digite X para terminar.\n")
print("Adicione as peças removidas:")

while loop:
  peca = input(f"🔧 Peça {i + 1}: ")
  i += 1

  if peca == "x" or peca == "X":
    print("\nOrdem de peças a serem adicionadas:\n")
    for i in range(len(list)):
      print(f"{i+1}º peça: {list.pop()}")
    loop = False
  else:
    list.append(peca)
