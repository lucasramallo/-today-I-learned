const time = 3000;

const auth = () => {console.log("✅Autheticaded!🔥")};

let timer = setTimeout(auth, time);
clearTimeout(timer); // cancela o timeout