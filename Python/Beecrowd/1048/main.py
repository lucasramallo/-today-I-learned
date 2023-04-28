# 0 - 400.00 
# 400.01 - 800.00
# 800.01 - 1200.00
# 1200.01 - 2000.00
# Acima de 2000.00

salary = float(input())
percentual = None
newSalary = None
reajuste = None
percentual = None
percentualFracionado = None

if salary > 0 and salary <= 400:
    percentual = 15
    percentualFracionado = 15 / 100
    reajuste = salary * percentualFracionado
    newSalary = salary + reajuste

elif salary > 400 and salary <=800:
    percentual = 12
    percentualFracionado = 12 / 100
    reajuste = salary * percentualFracionado
    newSalary = salary + reajuste 

elif salary > 800 and salary <=1200:
    percentual = 10
    percentualFracionado = 10 / 100
    reajuste = salary * percentualFracionado
    newSalary = salary + reajuste 
   
elif salary > 1200 and salary <=2000:
    percentual = 7
    percentualFracionado = 7 / 100
    reajuste = salary * percentualFracionado
    newSalary = salary + reajuste   

elif salary > 2000:
    percentual = 4
    percentualFracionado = 4 / 100
    reajuste = salary * percentualFracionado
    newSalary = salary + reajuste

print("Novo salario: %.2f" % newSalary)
print("Reajuste ganho: %.2f" % reajuste)
print("Em percentual: {} %".format(percentual))

	
# Novo salario: 2140.00
# Reajuste ganho: 140.00
# Em percentual: 7 %