run = True

print("-- OPTIONS --")
print("- Balance")
print("- Deposit")
print("- Statement\n")

DB = []

while run:


    def verifyLenOfDB():
        if DBClone > DB:
            return True
        else:
            return False

    
    DBClone = DB

    def deposit(value):
        DB.append(value)
        return print(f"✅ {value} added to your account.\n")


    def getBalance():
        totalBalance = 0
        for e in DB:
            totalBalance += e

        return print(f"Your Balance: {totalBalance}")
    
    def statement():
        allStatement = ""

        for i in DB:
            allStatement += f"Deposit: ${str(i)}\n"

        return print(allStatement)



    option = input("Digite uma opção > ").lower()

    if option == "balance":
        getBalance()

    elif option == "deposit":
        value = int(input("Valor > "))
        deposit(value)

    elif option == "statement":
        statement()

    elif option == "exit":
        run = False

    print(verifyLenOfDB())
    
