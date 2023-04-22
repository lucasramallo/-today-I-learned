import math

value = input()
value = int(value)

daysInAYear = 365

year = math.trunc(value / daysInAYear)
months = math.trunc(((value % daysInAYear) / 30))
days = value - (year * 365 + months * 30)

print("{} ano(s)".format(year))	
print("{} mes(es)".format(months))	
print("{} dia(s)".format(days))	


