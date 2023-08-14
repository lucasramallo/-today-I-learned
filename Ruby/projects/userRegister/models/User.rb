class User
    def initialize(id, fullName, firstName, email, contact, adress)
        @id = id
        @fullName = fullName
        @firstName = firstName
        @email = email
        @contact = contact
        @adress = adress
    end

    def get()
        puts("id: #{@id}")
        puts("Name: #{@fullName}")
        puts("E-mail: #{@email}")
        puts("Contato: #{@contact}")
        puts("Endereço: #{@adress}")
    end

    def save_format()
       ("id: #{@id}, name: #{@fullName}, e-mail: #{@email}, contato: #{@contact}, endereço: #{@adress}")
    end
end