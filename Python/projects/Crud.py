run = True

print("-- OPTIONS --")
print("- Balance")
print("- Deposit")

DB = []

while run:

    def deposit(value):
        DB.append(value)
        return print(f"✅ {value} added to your account.")

    def getBalance():
        totalBalance = 0
        for e in DB:
            totalBalance += e

        return print(f"Your Balance: {totalBalance}")


    option = input("Digite uma opção > ").lower()

    if option == "balance":
        getBalance()

    elif option == "deposit":
        value = int(input("Valor > "))
        deposit(value)

    elif option == "exit":
        run = False
