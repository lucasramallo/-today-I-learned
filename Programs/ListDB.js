const DB = {
    user1:{
        name: 'Lucas',
        age: 18,
        cpf: '154.365.967-65',
        email: 'lucas@gmsil.com'
    },
    user2:{
        name: 'Pedro',
        age: 19,
        cpf: '174.395.654-68',
        email: 'pedro@gmsil.com'
    },
    user3:{
        name: 'Diego',
        age: 21,
        cpf: '234.768.058-96',
        email: 'diego@gmsil.com'
    },
    user4:{
        name: 'Filipe',
        age: 28,
        cpf: '754.342.211-09',
        email: 'filipe@gmsil.com'
    },
    user5:{
        name: 'Aline',
        age: 21,
        cpf: '334.234.742-04',
        email: 'aline@gmsil.com'
    },
    user6:{
        name: 'Millene',
        age: 20,
        cpf: '644.355.977-69',
        email: 'millene@gmsil.com'
    }
}


let paramiter = "all"

for(users in DB) {

    let data = (DB[users])
    let spacing = "-----------------"
    
    switch(paramiter) {
        case paramiter = "name":
            console.log(data.name) 
        break
        case paramiter = "age":
            console.log(data.age)
        break
        case paramiter = "cpf":
            console.log(data.cpf)
        break
        case paramiter = "email":
            console.log(data.email)
        break
        case paramiter = "all":
            for(user in data){
                console.log(`${user}:`)
                console.log(`${data[user]}`)
            }
        break
    }

    console.log(spacing)
}


