function Person (name, cpf, number) {
    this.name = name
    this.cpf = cpf
    this.number = number
    this.situation = () => {
        return (`The customer ${this.name}, of CPF: ${this.cpf} is Active`)
    }
}

const customer = new Person("Lucas", "132.143.938-72", "(83)940039876")
const customer2 = new Person("Pedro", "164.194.209-56", "(11)965478378")

console.log(customer.situation())
console.log(customer2.situation())


function Employee(name, id) {
    this.name = name
    this.id = id
    this.situation = () => {
        return (`The employee ${this.name}, of ID: ${this.id} is Employed`)
    }
}

const employee1 = new Employee("John Doe", "0001")

console.log(employee1.situation())