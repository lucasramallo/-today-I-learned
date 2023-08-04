user = {'name': "Lucas", 'age': 18};
# values = "lucas", 18
# keys = 'name', 'age'
# itens = 'name': "Lucas", 'age': 18

for k, v in user.items():
    print(f"{k}: {v}");

run = True;


users = [{'name': "Lucas", 'age': 18}, {'name': "Pedro", 'age': 21}, {'name': "Julia", 'age': 19}]

for user in users:
    print(f"Nome: {user['name']}")
    print(f"Idade: {user['age']}\n")

# print(f"Nome: {user['name']}, idade: {user['age']}");
    
