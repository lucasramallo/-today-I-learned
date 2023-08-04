list = ["Luccas", "Maria", "João"];

run = True;

while(run):

    print(f"A lista possue: {len(list)} elementos")

    index = int(input("Position > "))
    newName = input("New Name > ");
    
    if newName == "sair":
        run = False;
    else:
        list.insert(index, newName);
        print(list)


# list = ["Luccas", "Maria", "João"];

# run = True;

# while(run):
#     newName = input("New Name > ");
    
#     if newName == "sair":
#         run = False;
#     else:
#         list.append(newName);
#         print(list)