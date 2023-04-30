horaInicial, minutoInicial, horaFinal, minutoFinal = input().split()

horaInicial = int(horaInicial)
minutoInicial = int(minutoInicial)
horaFinal = int(horaFinal)
minutoFinal = int(minutoFinal)

duracaoEmHoras = horaFinal - horaInicial
duracaoEmMinutos = minutoFinal - minutoInicial

if (horaInicial == horaFinal and minutoInicial > minutoFinal):
    duracaoEmMinutos = 60 - (minutoInicial - minutoFinal)
    duracaoEmHoras = 23

elif (horaInicial == horaFinal and minutoInicial < minutoFinal):
    minutoFinal - minutoInicial
    duracaoEmHoras == 24

elif (horaInicial == horaFinal and minutoInicial == minutoFinal):
    duracaoEmHoras = 24
    duracaoEmMinutos = 0

elif (horaInicial > horaFinal and minutoInicial > minutoFinal):
    duracaoEmMinutos = 60 - (minutoInicial - minutoFinal)
    duracaoEmHoras = 23 - (horaInicial - horaFinal)

elif (horaInicial > horaFinal and minutoInicial == minutoFinal):
    duracaoEmHoras = 24 - (horaInicial - horaFinal)

elif (minutoInicial > minutoFinal and horaInicial != horaFinal):
    duracaoEmMinutos = 60 - (minutoInicial - minutoFinal)
    duracaoEmHoras = duracaoEmHoras - 1

print("O JOGO DUROU {} HORA(S) E {} MINUTO(S)".format(duracaoEmHoras, duracaoEmMinutos))