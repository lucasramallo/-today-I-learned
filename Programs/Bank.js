let _name = "John"
let _surname = "Doe"
let _account_number = 96875896
let _agency = "000-1"
let _password = "1234"
let _balance = 765.87
let show_pessoal_informations = true
let show_the_balance = true

function User (name, surname, account_number, agency, password) {
    this.name = name;
    this.surname = surname;
    this.account_number = account_number;
    this.agency = agency;
    this.password = password
    this.encrypt = () => {
        let pass = this.password
        return(pass.replace(pass, "****"))
    }
    this.data = () => {
        return(`NAME: ${this.name} ${this.surname}\nACCOUNT NUMBER: ${account_number}\nAGENCY: ${this.agency}\nPASSWORD: ${this.encrypt()}`)
    }
}

function Balance(user_name, value){
    this.user_name = user_name;
    this.value = value;
    this.data_balance = () => {
        return (`$${this.value}`)
    }
}

const user = new User(_name, _surname, _account_number,  _agency, _password)
const balance = new Balance(_name, _balance)

if(show_pessoal_informations == true && show_the_balance == true){
    console.log(`Dashboard\nYour Balance: ${balance.data_balance()}\n \nYour Informations:\n${user.data()}`)
}else if(show_pessoal_informations == true) {
    console.log(user.data())
}else if(show_the_balance == true){
    console.log(`Your Balance is: ${balance.data_balance()}`)
}else (console.error("404: Choose an opition"))