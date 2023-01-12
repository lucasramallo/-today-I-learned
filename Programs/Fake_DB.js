//"Banco de Dados"
let DataBase = {
    cursos: ["Ciência da Computação", "Odontologia", "ADS"]
}

//Faça sua requisição:
// add = nome do curso - string
// delete = index do curso - number
// get = index do curso - number
let request_type = "add"
let curso = "Medicina";


//Controll
if(request_type == "add"){
    function Add(data, db) {
        let add = db.push(data)
        return add;
    }

    Add(curso, DataBase.cursos)

    let cursos = DataBase.cursos;

    console.log(`Você adicionou ${curso} na tabela cursos\nTabela Atualizada: ${cursos}`)

}else if(request_type == "delete"){
    function Delete(id, db) {
        let del = db.splice(id, id)
        return del;
    }

    Delete(curso, DataBase.cursos)

    let cursos = DataBase.cursos;

    console.log(`Você deletou a coluna de index: ${curso}, na tabela cursos\nTabela Atualizada: ${cursos}`)

}else if(request_type == "get") {
    function Get(id, db){
        let get = db.shift(id)
        return get
    }
    let get_curso = Get(curso ,DataBase.cursos)

    let cursos = DataBase.cursos;
    
    console.log(`Você consultou a coluna de index: ${curso}, na tabela cursos\nConsulta: ${get_curso}\n`)
}


