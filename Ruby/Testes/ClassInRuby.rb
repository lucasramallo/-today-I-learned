class User 
    def initialize(name, email, age) 
        @name = name
        @email = email
        @age = age
    end

    def get()
        puts @name
        puts @email
        puts @age
    end

end


user = User.new("Lucas", "lucasdebrito2.jd@gmail.com", 18)

user.get()