// let a = 10

// for(let i = 0; i < a; a--){
//     console.log(a)
// }


let i = 0

while(i < 10){
    //console.log(i)
    i++
}

let a = 10000000

while(a !== 0){
    //console.log(a)
    a /= 2
}


// For of

const users = ["Lucas", "João", "Pedro", "Diego"]

for(user of users){
   // console.log(user)
}


// For in
const customer = {
    name: 'Lucas',
    cpf: '123.432.432-65',
    age: 18
}

for(data in customer) {
    console.log(`${data}:`)
    console.log(customer[data])
}
