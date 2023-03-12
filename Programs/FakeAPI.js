const DataBase = {
    Users: [
        {
            name: "Jonh Doe", 
            nota: 80, 
            cpf: "132.112.321.32", 
            level: "junior", 
            salario: "3.500"
        },
        {
            name: "Diego Martins", 
            nota: 97, 
            cpf: "273.998.142.01", 
            level: "senior", 
            salario: "12.850"
        },
        {
            name: "Filipe Fernandes", 
            nota: 65, 
            cpf: "745.208.624.75", 
            level: "pleno", 
            salario: "7.200"
        }
    ]
} 

const Users = DataBase.Users

console.log('Total de Usuarios')
const totalUsers = Users.forEach((_, index) => {
    console.log(index +1)
})

const approvedUsers = Users.forEach((value) => {

    if(value.nota > 70){
        console.log(`\n${value.name}`)
        console.log(`Nota${value.nota} \n`)
    }
})

