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


team.forEach((value) => {
    console.log(`Name: ${value.name}`)
    console.log(`Function: ${value.function} \n`)
})