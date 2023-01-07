//Declaração 
function creat() {
    console.log('hello world')
}

creat()

//Arrowfunction

const app = (a) => {
    return a
} 
let result = app("Hello World")

console.log(result)

//Callback

function a(b) {
    b()
}

a(
    () => {
        console.log("Sou a função b")
    }
)