const team = [
    {name: "Lucas", function: "Front-end Developer"},
    {name: "Rodrigo", function: "Front-end Developer"},
    {name: "Filipe", function: "Back-end Developer"},
    {name: "Amanda", function: "Back-end Developer"},
    {name: "Aline", function: "UI/UX"}
]

for(member in team) {
    console.log(`Name: ${team[member].name}`)
    console.log(`Function: ${team[member].function}\n`)
}

