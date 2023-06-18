couter = 0

for i in range(6):
    value = float(input())
    if value > 0:
        couter += 1

print("{} valores positivos".format(couter))