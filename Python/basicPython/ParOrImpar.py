number = input('Informe um número, por favor! |> ')

stringToNumber = int(number)

restOfDivision = stringToNumber % 2

if restOfDivision == 0:
    print('This number is PAIR.')
else: 
    print('This number is ODD.')