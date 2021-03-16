
console.log(' ------------- OBJECTS ------------------ ');

/**
 * @description - This function creates an object
 * @param {number} a - represents age
 * @param {string} b - name
 * @returns {object} - represents a person
 */
function createObject(a, b) {

   const person = {
     firstName: "John",
     lastName: "Smith",
     age: "45",
     address: {
        streetNumber: "3500",
        city: "Columbus"
     }
   };

   return person;
}

console.log(createObject());

console.log(' ------------- FUNCTIONS ------------------ ');

// function sum(a, b) {
//    return a + b;
// }

// console.log(sum(1,2));

// console.log(sum(1,2));

//let x = sum(2,3);
//console.log(x);


//functional expression
// x = function sum(a,b) {
//    return a + b;
// }

// console.log(x(2,3));

// let sum = function (a, b) {
//    return a + b;
// }

// console.log (sum(5,5));

// let sum = (a, b) => {
//    return a + b;
// }

// // console.log (sum(5,5));

// let product =  (a,b) => {
//    return a * b;
// }

// function onClick(fn, a, b) {
//    console.log(fn(a,b));
// }

// onClick(sum, 3, 3);
// onClick(product, 5, 5);

console.log(' ------------- ARRAYS ------------------ ');

let names = ['Laxmi', 'Em', 'Blase', 'Charlie', 'BugEater Kevin', 'Kevin', 'Keith', 'Kim'];

names.forEach((item, index, names) => {

   if (index == 0) {
      names[0] = names[1];
      names[1] = names [0];
      //console.log(names[0]);
      //console.log(names[1]);
   }
});

const newArray = names.map((item, index, array) => {
   if (item == 'Kevin') {
      return 'Tech Elevator is Kevin\'s 2nd Choice but he is wrong';
   }
   else {
      return item;
   }
});

//console.log(newArray);

const filteredArray = names.filter( (item) => {
   // if (item.startsWith('K')) {
   //    return true;
   // }
   return item.startsWith('K')
});

console.log(filteredArray);

const numbers = [0, 1,0, 0, 0, 0, 0];

const result = numbers.reduce((sum, value) => {
  return sum += value;
}, 10);

console.log(result);