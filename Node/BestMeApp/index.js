const questions = [
    "O que aprendi hoje?",
    "O que ainda estou em duvida?",
    "O que posso fazer para melhor o entendimento?",
]

const ask = (index = 0) => {
    process.stdout.write(questions[index] + " |> ")
}

ask()

const answers = []

process.stdin.on("data", data => {
    answers.push(data.toString().trim())
    if(answers.length < questions.length){
        ask(answers.length)
    } else {
        process.exit()
    }
})

process.on('exit', () => {
    console.log(`
🔥Finalizado🔥

✅O que aprendi hoje?:
${answers[0]}

✅O que ainda estou em duvida?:
${answers[1]}

✅O que posso fazer para melhor o entendimento?:
${answers[2]}
`)
})