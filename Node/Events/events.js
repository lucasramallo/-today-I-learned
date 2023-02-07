const { EventEmitter } = require('events')
const event = new EventEmitter()

const name = "Lucas"
const mesage = "Olá!"

event.on('Hello', (Name) => {
    console.log(mesage, Name)
})

event.emit('Hello', name)