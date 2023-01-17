/* 
    ∞ Buscando e contando dados em Arrays ∞
    Baseado no Array de Livros por Categoria abaixo, faça os seguintes desafios
        • Contar o número de categorias e o número de livros em cada categoria
        • Contar o número de autores
        • //TODO Mostrar livros do autor Auguto Cury
        • //TODO Transformar a função acima em uma função que irá receber o nome do autor e devolver os livros desse autor.
*/

const booksByCategory = [
    {
        category: "Riqueza",
        books: [
            {
                title: "Os segredos da mente milionária",
                author: "T. Harv Eker",
            },
            {
                title: "O homem mais rico da Babilônia",
                author: "George S. Clason",
            },
            {
                title: "Pai rico, pai pobre",
                author: "Robert T. Kiyosaki e Sharon L. Lechter",
            },
        ],
    },
    {
        category: "Inteligência Emocional", 
        books: [
            {
                title: "Você é Insubstituível",
                author: "Augusto Cury",
            },
            {
                title: "Ansiedade – Como enfrentar o mal do século",
                author: "Augusto Cury",
            },
            {
                title: "Os 7 hábitos das pessoas altamente eficazes",
                author: "Stephen R. Covey",
            },
        ],
    },
];

const array = booksByCategory;

// function Categories (array) {

//     console.log(`Number of Categories: ${array.length}`);

//     let numberOfCategory = 1;
//     for(categories of array){
//         let books = categories.books;
//         console.log(`The Category ${numberOfCategory} has: ${books.length} Books`);
//         numberOfCategory++;
//     };
//     return Categories;
// }

// function numberOfAuthors (array) {

//     console.log("\nAuthosrs:")

//     for(categories of array){
//         let books = categories.books;
//         for(book of books){
//             let authors = book.author
//             console.log(authors)
//         } 
//     };
//     return Categories;
// }


function showAuthorBook(array, authorName) {
    console.log("\nAuthosrs:")

    for(categories of array){
        let books = categories.books;
        for(book of books){
            let authors = book.author
            console.log(books)

        } 
    };
}

// Categories(array);
// numberOfAuthors(array);
showAuthorBook(array, "Augusto Cury");