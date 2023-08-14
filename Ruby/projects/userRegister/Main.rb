require './models/User'
require 'securerandom'

@db = []
loop = true

def create_user(fullName, firstName, email, contact, adress)
    id = Random.new.rand(1..500000000)
    user = User.new(id, fullName, firstName, email, contact, adress)
    save_user(user)
    # return user.get()
end

def save_user(user)  
    @db.push(user.save_format())
    puts "\nDATA BASE - User Table\n"
    puts @db
end

while loop
    puts "\nNome: "
    name = gets.chomp

    puts "E-mail: "
    email = gets.chomp

    puts "Telefone: "
    contact = gets.chomp

    puts "Endereço: "
    adress = gets.chomp

    create_user(name, name, email, contact, adress)
end

