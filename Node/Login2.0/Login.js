const db = require('./DB');
const dataInput = require('./Input');

let nameInDataBase = db.username
let emailInDataBase = db.email
let passwordInDataBase = db.password

//Recebe o valor do input
let LoginUser = dataInput.User
let = loginPassword = dataInput.Password 

function Login(dataBaseDataUsername, dataBaseDataEmail, dataBaseDataPassword, identifier, _password) {
    this.dataBaseData = dataBaseDataUsername;
    this.dataBaseDataEmail = dataBaseDataEmail;
    this.dataBaseDataPassword =dataBaseDataPassword;
    this.identifier = identifier;
    this._password = _password;
    this.auth = () => {
        if((this.identifier == dataBaseDataUsername || this.identifier == dataBaseDataEmail) && this._password == this.dataBaseDataPassword){
            return true
        } else return false
    }
}

const login = new Login(nameInDataBase, emailInDataBase, passwordInDataBase, LoginUser, loginPassword)
login.auth()

function App() {
    console.log(`Welcome ${nameInDataBase}`)
    console.log("✅Authenticated! You are on the App!🔥")
}

function ErrorInAuth() {
    console.log(("❌Incorrect Username/Email or Password. Please Try Again."))
}

let Auth = null

if(login.auth() == true) {
    Auth = true
} else if(login.auth() == false) Auth = false

const authentication = Auth ? App() : ErrorInAuth()



