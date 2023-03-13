const express = require('express');
const app = express();

app.set("view engine", "ejs");

app.get("/", (req, res) => {
    res.render("index");
});

app.get("/sobre", (req, res) => {
    res.render("about");
});

const port = 8080;                                                                                                                     
app.listen(port);

console.log(`✅Running! In port ${port}🔥`);