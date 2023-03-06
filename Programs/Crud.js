const DataBase = {
    Members: [
        {
            name: "Jonh Doe", 
            age: 24, 
            cpf: "132.112.321.32", 
            level: "junior", 
            salario: "3.500"
        }
    ]
} 

const teamMembers = DataBase.Members

const Member = (teamMembers) => {
    
   for(member of teamMembers){
        return(`Nome: ${member.name}\nIdade: ${member.age}\nCpf: ${member.cpf}\nNivel: ${member.level}\nSalário: R$${member.salario}`)
    }

}


console.log(Member(teamMembers))