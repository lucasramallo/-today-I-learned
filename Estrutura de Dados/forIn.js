const team = [
    {
        name: "Lucas", 
        function: "Front-end Developer",
        stacks: ["Type Script", "React", "Next", "Tailwind", "Styled Components"]
    },
    {
        name: "Rodrigo", 
        function: "Front-end Developer",
        stacks: ["Type Script", "React", "Next", "Tailwind", "Styled Components"]
    },
    {
        name: "Filipe", 
        function: "Back-end Developer",
        stacks: ["Type Script", "Node", "Nest", "Elixir", "Fastfy", "Postgress", "Prisma"]
    },
    {
        name: "Amanda", 
        function: "Back-end Developer",
        stacks: ["Type Script", "Node", "Nest", "Postgress", "MySql", "Graphql", "Prisma"]
    },
    {
        name: "Aline", 
        function: "UI/UX",
        stacks: ["Adobe XD", "Figma", "Blender", "Cinema 4D"]
    }
]

for(member in team) {
    console.log(`Name: ${team[member].name}`)
    console.log(`Function: ${team[member].function}`)
    console.log(`Stack: ${team[member].stacks} \n`)
}

