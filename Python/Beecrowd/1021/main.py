import math

value = input()

value = float(value)

oneHundred = math.floor(value / 100)
oneHundredRest = value % 100

fifty = math.trunc(oneHundredRest / 50)
fiftyRest = oneHundredRest % 50

twenty = math.trunc(fiftyRest / 20)
twentyRest = fiftyRest % 20

ten = math.trunc(twentyRest / 10)
tenRest = twentyRest % 10

five = math.trunc(tenRest / 5)
fiveRest = tenRest % 5

two = math.trunc(fiveRest / 2)
twoRest = fiveRest % 2

one = math.trunc(twoRest / 1)
oneRest = twoRest % 1



fiftyCents = math.trunc(oneRest / 0.50)
fiftyCentsRest = oneRest % 0.50

twentyFiveCents = math.trunc(fiftyCentsRest / 0.25)
twentyFiveRest = fiftyCentsRest % 0.25


tenCents = math.trunc(twentyFiveRest / 0.10)
tenRest = twentyFiveRest % 0.10

fiveCents = math.trunc(tenRest / 0.05)
fiveCentsRest = tenRest % 0.05

oneCents = round(value / 0.01)

print("NOTAS:")
print("%.0f nota(s) de R$ 100.00" % oneHundred)
print("%.0f nota(s) de R$ 50.00" % fifty)
print("%.0f nota(s) de R$ 20.00" % twenty)
print("%.0f nota(s) de R$ 10.00" % ten)
print("%.0f nota(s) de R$ 5.00" % five)
print("%.0f nota(s) de R$ 2.00" % two)

print("MOEDAS:")
print("%.0f moeda(s) de R$ 1.00" % one)
print("%.0f moeda(s) de R$ 0.50" % fiftyCents)
print("%.0f moeda(s) de R$ 0.25" % twentyFiveCents)
print("%.0f moeda(s) de R$ 0.10" % tenCents)
print("%.0f moeda(s) de R$ 0.05" % fiveCents)
print("%.0f moeda(s) de R$ 0.01" % oneCents)
