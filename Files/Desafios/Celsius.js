let valor = "65C"

function transforme(val){

    const fahrenheit = val.includes('F' || 'f')
    const celsius = val.includes('C' || 'c')

    let toCelsius = null
    let toFahrenheit = null
    
    
    if(fahrenheit){

        let noLeter = Number(val.replace('F', ''))
        toCelsius = ((noLeter - 32) * 5/9)
        console.log(toCelsius)
    }else
    
    if(celsius){
        let noLeter = Number(val.replace('C', ''))
        toFahrenheit = (noLeter * 9/5 + 32)
        console.log(toFahrenheit)
    }
}

transforme(valor)