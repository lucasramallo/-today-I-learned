
let array = {
    receita: [2134, 276],
    despesas: [915, 23, 54, 14, 54, 98, 45]
}

function sum(array) {
    let total = 0
    
    for(val of array){
        total += val
    }

    return total
}

let sumReceita = sum(array.receita)
let sumDespesas = sum(array.despesas)

function calc(rec, des){
    let soma = rec - des

    if(soma >= 0){
        console.log("Saldo Positivo")
    }else if(soma < 0){
        console.log("Saldo Negatito")
    }
}

calc(sumReceita, sumDespesas)