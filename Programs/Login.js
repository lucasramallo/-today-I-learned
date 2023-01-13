function App() {
    return console.log("You are on the App!")
}


function Login() {
    return console.log(("Logado"))
}

function Register() {
    return console.log("First you need to register")
}

const Auth = false

const authentication = Auth ? App() : Login()