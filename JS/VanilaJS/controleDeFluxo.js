//switch case break

let expression = true

switch (expression) {
    case true: 
        console.log('true')
    break 
    case false:
        console.log('false')
    break
}   

//Throw, try, catch

let password = 1237

function auth(password){
    if(password != 1234){
        throw new Error("Senha Incorreta!")
    }
}

try {
  auth(password)
} catch(e){
    console.log(e)
}

console.log("hello")


