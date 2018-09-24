// 'use strict';
const minimum = require('./solution');

const Test = {
    equals: (actual, expected) => {
        if (expected !== actual) {
            console.log(`expected ${expected}, but got ${actual}`);
        }
    }
}

let array = [1, 2, 3, 6, 8, 9, 10, 11, 12, 13];

for (let i = array.length - 1; i >= 0; i--) {
    let first = array.shift();
    array.push(first);
    Test.equals(minimum(array), i);
}
