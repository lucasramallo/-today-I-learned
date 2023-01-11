let users = ["Lucas", "Pedro", "Martyn"]

//adicionar no final do array
//users.push("john")

//adicionar no começo do array
//users.unshift("lucas")

//remover do final do array
//users.pop()

//remover do começo
//let a  = users.shift()

//pega determinado ponto do array
//console.log(users.slice(1, 3))

//remove determinado ponto do array
//users.splice(1, 3)

//achar o index no array
let index = users.indexOf("Pedro")
users.splice(index, 1)

console.log(users)
