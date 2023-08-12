require './models/User'
require 'securerandom'

def create_user(fullName, firstName, email, contact, adress)
    id = Random.new.rand(1..500000000)
    user = User.new(id, fullName, firstName, email, contact, adress)
    return user.get()
end

puts "Nome: "
name = gets.chomp

puts "E-mail: "
email = gets.chomp

puts "Telefone: "
contact = gets.chomp

puts "Endereço: "
adress = gets.chomp

create_user(name, name, email, contact, adress)
