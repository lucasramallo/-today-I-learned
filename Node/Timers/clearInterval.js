const time = 100
const checking = () => console.log('checking!')

let interval = setInterval(checking, time);

setTimeout(() => {clearInterval(interval)}, 10000)