import math

value = input()

value = int(value)

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

print(value)
print("%.0f nota(s) de R$ 100,00" % oneHundred)
print("%.0f nota(s) de R$ 50,00" % fifty)
print("%.0f nota(s) de R$ 20,00" % twenty)
print("%.0f nota(s) de R$ 10,00" % ten)
print("%.0f nota(s) de R$ 5,00" % five)
print("%.0f nota(s) de R$ 2,00" % two)
print("%.0f nota(s) de R$ 1,00" % one)
