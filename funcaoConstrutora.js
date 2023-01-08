function Team_member(name, id, office) {
    this.name = name;
    this.id = id;
    this.office = office;
    this.info = () => {
        return (`Name:${this.name} ID:${this.id} Office:${this.office}`)
    }
}

function Customer(name, sobrenome, cpf, email, cep, uf) {
    this.name = name;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
    this.email = email;
    this.cep = cep;
    this.uf = uf;
    this.data = function() {
        return (
            `NOME: ${this.name} ${this.sobrenome} | CPF: ${this.cpf} | E-MAIL: ${this.email} | CEP: ${this.cep} | UF: ${this.uf}`
        )
    }
}

const programmer1 = new Team_member("Diego", "01","Frontend Developer");
const programer2 = new Team_member("Filipe", "02", "Frontend Developer");
const programer3 = new Team_member("Rodrigo", "03", "Backend Engineer");
const programmer4 = new Team_member("Fernando", "04", "Backend Engineer");
const programmer5 = new Team_member("William", "05", "BD Engineer")

const customer = new Customer("José", "Valim", "134.687.876-97", "jose.valim@gmail.com", "58121-000", "PB")

//console.log(programmer1.info())
//console.log(programer2.info())
//console.log(programer3.info())
//console.log(programmer4.info())
//.log(programmer5.info())

console.log(customer.data())
/*
function Person (name, cpf, number) {
    this.name = name
    this.cpf = cpf
    this.number = number
    this.situation = () => {
        return (`The customer ${this.name}, of CPF: ${this.cpf} is Active`)
    }
}

function Employee(name, id) {
    this.name = name
    this.id = id
    this.situation = () => {
        return (`The employee ${this.name}, of ID: ${this.id} is Employed`)
    }
}

function Manager(name, id, sector, situation) {
    this.name = name;
    this.id = id;
    this.sector = sector;
    this.infos = () => {
        return (`The manager ${this.name}, of ID: ${this.id} that operates in the sector: ${sector} is ${situation}`)
    }
}

const customer = new Person("Lucas", "132.143.938-72", "(83)940039876")
const customer2 = new Person("Pedro", "164.194.209-56", "(11)965478378")
const employee1 = new Employee("John Doe", "0001")
const manager1 = new Manager("Rodrigo", "01", "1", "Active")
const manager2 = new Manager("Diego", "02", "2", "Disabled")

console.log(customer.situation())
console.log(customer2.situation())
console.log(employee1.situation())
console.log(manager1.infos())
console.log(manager2.infos())
*/