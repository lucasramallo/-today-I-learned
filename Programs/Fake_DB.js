
//"Banco de Dados"
let DataBase = {
    cursos: [],
    ies: []
}

//Data
let curso = "Ciência da Computação"
let instituição = "UFCG"

//controler
function Update(data, db) {
    let update = db.push(data)
    return update
}

Update(curso, DataBase.cursos)
Update(instituição, DataBase.ies)

let cursos = DataBase.cursos
let ies = DataBase.ies

console.log(cursos)
console.log(ies)

