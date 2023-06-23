import os
loop = True
fila = []


def clearTerminal():  # Limpa o Treminal
  if os.name == 'nt':  # Windows
    return os.system('cls')
  else:  # Linux e macOS
    return os.system('clear')


def lista():
  clearTerminal()
  ordem = 1
  print("Ordem da fila:\n")
  for paciente in fila:
    print(f"{ordem}º {paciente}")
    ordem += 1


print("BEM-VINDA Cremilda Chantilly 🦷🙎")

while True:
  print("\n1 - Adicionar paciente a fila.")
  print("2 - Remover paciente da fila.\n")
  option = int(input("Opção > "))

  if option == 1:
    paciente = input("\nNome do paciente > ")
    fila.append(paciente)
    clearTerminal()

  if option == 2:
    if len(fila) == 0:
      () # Faz nada
    else:
      fila.pop(0)

  lista()