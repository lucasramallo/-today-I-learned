import os
filaRegular = []
filaPrioridade = []

def clearTerminal():  # Limpa o Treminal
  if os.name == 'nt':  # Windows
    return os.system('cls')
  else:  # Linux e macOS
    return os.system('clear')
    
    
def consultarFila():
  lenFilaPrioridade = len(filaPrioridade)
  lenFilaRegular = len(filaRegular)

  print("FILA:\n")

  ordem = 1
  indexPrioridade = 0
  indexRegular = 0

  while indexPrioridade < lenFilaPrioridade or indexRegular < lenFilaRegular:
    if indexPrioridade < lenFilaPrioridade:
      print(f"{ordem}º {filaPrioridade[indexPrioridade]} (P)")
      ordem += 1
      indexPrioridade += 1
    if indexRegular < lenFilaRegular:
      print(f"{ordem}º {filaRegular[indexRegular]}")
      ordem += 1
      indexRegular += 1

    if lenFilaPrioridade + lenFilaRegular == 0:
      print("Nenhum Paciente Na Fila!")


print("BEM-VINDA Cremilda Chantilly 🦷🙎")

while True:
  print("\n-- ADICIONAR PACIENTE --\n")

  print("1 - Regular")
  print("2 - Prioridade\n")
  option2 = int(input("Digite a opção > "))
  clearTerminal()

  if option2 == 1: # Regular
    paciente = input("Nome do paciente regular > ")
    filaRegular.append(paciente)
    clearTerminal()

  elif option2 == 2: # Prioridade
    paciente = input("Nome do paciente prioritário > ")
    filaPrioridade.append(paciente)
    clearTerminal()
    
  consultarFila()