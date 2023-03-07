const DataBase = {
    Members: [
        {
            name: "Jonh Doe", 
            age: 24, 
            cpf: "132.112.321.32", 
            level: "junior", 
            salario: "3.500"
        },
        {
            name: "Diego Martins", 
            age: 37, 
            cpf: "273.998.142.01", 
            level: "senior", 
            salario: "12.850"
        },
        {
            name: "Filipe Fernandes", 
            age: 28, 
            cpf: "745.208.624.75", 
            level: "pleno", 
            salario: "7.200"
        }
    ]
} 

const teamMembers = DataBase.Members

const Member = (teamMembers) => {
    
   for(member of teamMembers){
        console.log(`Nome: ${member.name}\nIdade: ${member.age}\nCpf: ${member.cpf}\nNivel: ${member.level}\nSalário: R$${member.salario}\n`)
    }

}
Member(teamMembers)
