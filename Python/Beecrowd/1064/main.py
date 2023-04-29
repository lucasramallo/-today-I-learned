counter = 0
soma = 0

for i in range(6):
    value = float(input())
    if value > 0:
        counter += 1
        soma = soma + value

media = soma / counter

print("{} valores positivos".format(counter))
print("{:.1f}".format(media))