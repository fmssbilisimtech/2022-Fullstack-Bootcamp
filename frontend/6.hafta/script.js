
////// Arrow function

// let calculateNumber = function(a,b=5){
//     return a + b;
// }

// let calculateNumber = (a,b) =>{
//    return a + b;
// }

// let calculateNumber = (a,b = 5) => a+b; 

// let calculateNumber = a => a+5;   // eger tek bir parametre alacak ise parantez gerekmiyor.

// let result = calculateNumber(4);
// console.log(result);











////////// for in / for of


// let array = new Array(10);

// for(let i = 0 ; i < array.length ; i++){
//     array[i] = Math.floor(Math.random()*50+1);
// }

// console.log(array);


// for of value bilgisini getirir.

// for (let arr of array) {
//     console.log(arr);
// }


// for in   index bilgisini getirir.


// for (let arr in array) {

//     console.log(arr, array[arr]);
// }














//////////   objects 




//  let employee = {name:"sercan" , surname : "masar" , age:22};

// for (const emp in employee) {
    
//     console.log(emp, employee[emp])
// }





// let person = new Object([
//     adi = {name  : "Sercan"},
//     yas = {age :22},
//     diller = {langs :  ["TR", "EN","ES"]}
// ]);

// console.log(person);

// for (const human in person) {
//      console.log(human, person[human]);
//     if(human == 2){
//         //console.log(person[human]);
//     }
// }








// let myArray = {name:"Sercan", name1:"Mehdi",name2: "Onur",name3: "Emre"}; /// objectler de key value ozelligi vardir.

// console.log(myArray);

// let arr = [];
// for (const key in myArray) {
 
//    arr.push(myArray[key]);

// }
// console.log(arr); 


// myArray.forEach(element => {
//     console.log(element);
// });














// const courses = {
//     java: "90%",

//     javascript: "55%",

//     nodejs: "22%",

//     php: "15%"
// };


// const keys = Object.keys(courses);
// const values = Object.values(courses);
// const entiries = Object.entries(courses)

// console.log(keys);
// console.log(values);
// console.log(entiries);
// console.log("entries: ", entiries[0][0]);

// keys.forEach((key, index) => {
//     console.log(`${index} :::  ${key}: ${courses[key]}`);
// });



////// objectlerde key degeri sadece secim yapilirken koseli parantez 
//////   ve "" icerisinde secim yapilirken kullanilabilir nokta ile secim yapilamazlar.
 
// let value = {  
//     1 : "some",
//     2 : "home"
// }


// console.log(value["1"]);

// console.log(value.1);

//  function MyObj(first, second, next){
//     this.first = first;
//     this.second = second;
//     this.next = next;
//     console.log(this)
// }

// let value = new MyObj(20, 40, 60);  /// class yazmadan constructur olusturup object olarak kullanabiliyorum.
// // console.log(typeof new MyObj(20, 40, 60));





/////// Maps

// let langs = ["En", "Tr", "Fr", "Cs", "Fb"];
// let  fruit = {name: "Muz", price: "33tl", quantity:44 }
// let cars = [{model : {"Opel" : "Astra"}} , 22 ]

// let person = new Map();

// console.log(person);


// person.set("diller",langs)
// person.set("meyve",fruit);
// person.set("arabalar",cars)

// console.log(person.get("diller"))

// console.log(person.has("meyve"));    /// key degeri verilir



// let myCar = person.get("arabalar");

// myCar.forEach((element, index) => {
//     console.log( index, element);

// });








// const cities = new Map();
// cities.set("İstanbul",34);
// cities.set("İzmir",35);
// cities.set("Giresun",28);

//For Each
// cities.forEach(function(value,key){
//   console.log(key,value);
// })

//For Of


// console.log(cities);
// for(let key of cities){ // Destructing
//   console.log(key);
// }









///////////// Sets

//  const mySet = new Set();
// mySet.add(50)
// mySet.add(50);
// mySet.add(3.14);
// mySet.add("Mehmet");
// mySet.add(false);
// mySet.add([1,2,3]);
// mySet.add({a:1,b:2});
// console.log(mySet);












// const mySet = new Set(100);
// const mySet = new Set("sercan");
// const mySet = new Set([100, 200, 300, 400]);

// console.log(mySet);



// const mySet = new Set([100,3.14,"Ahmet Kerem"]);
// console.log(mySet.has(100));
// console.log(mySet.has(2));
// console.log(mySet);

// // For Of
// for(let val of mySet){
//   console.log(val);
// }

// // For Each

// mySet.forEach(function(val){
//   console.log(val);
// })






// const myMap = new Map([
//     ["apples", 500],
//     ["bananas", 300],
//     ["oranges", 200]
//   ]);


// const myMap = new Map("Sercan");
// console.log(myMap);














///////// metodlar



// Filter


// const numbers = [60,70,25,3,80,10,24];
// const filteredNumbers = numbers.filter(n => n > 50);
// console.log(numbers);
// console.log(filteredNumbers);

// const students = [
//   {name:'Oguz', passed: false},
//   {name:'Sinan', passed: true},
//   {name:'Gokalp', passed: true},
//   {name:'Miray', passed: false},
//   {name:'Aybuke', passed: false},
// ];

// const studentsPassed=students.filter(student=> student.passed );
// const studentsNotPassed=students.filter(student=>!student.passed);

// console.log("Geçenler:",studentsPassed);
// console.log("Geçemeyenler:",studentsNotPassed);

// studentsPassed.forEach(function(student){
//   console.log(student.name,"Geçti");
// })
// studentsNotPassed.forEach(function(student){
//   console.log(student.name,"Geçemedi");
// })




// const numbers = [60,70,25,3,80,10,24];
// const newNumbers = numbers.map(number => number+10);
// console.log(numbers);
// console.log(newNumbers);










// Map Metodu


const students = [
  {name:'Oguz', passed: false},
  {name:'Sinan', passed: true},
  {name:'Gokalp', passed: true},
  {name:'Miray', passed: false},
  {name:'Aybuke', passed: false},
];

const passedStudents = students.map(student=>{
return {name:student.name, passed: !student.passed?student.passed=true:student.passed}
}).filter(student=>student.name.includes("r"));
console.log(passedStudents);

// !student.passed?student.passed=true:student.passed

// if(student.passed==false){
//   return student.passed=true;
// } else {
//   return student.passed
// }













// Reduce Metodu


// let numbers =[100, 200, 300, 400, 500];

// let num = numbers.reduce(getNum, 0);

// function getNum(prev , curr){
//     result = prev + curr;
//     return result;
// }

// console.log(num);





 
// const arr = testArray.subarray(0,3) //// baslangic indexini verip kac adet almasini istiyorsak verebiliriz.
// console.log(testArray.buffer)

// testArray.BYTES_PER_ELEMENT



// function sum(previousValue, currentValue) {
//   return previousValue + currentValue;
// }
 
// console.log(testArray.reduce(sum));




// const testArray = new Uint8Array([10, 11, 12, 13]);

//  let numbers =[100, 200, 300, 400, 500];

// const result = numbers.reduce((value,number)=>{
//   if(number>50){
//     value++;
//   }
//   return value;
// },0);
// console.log(numbers);
// console.log(result);




// const students2 = [
//   {name:'kerem', point: 60},
//   {name:'sercan', point: 30},
//   {name:'mustafa', point: 100},
//   {name:'simge', point: 80},
//   {name:'nedim', point: 40},
// ];


// const passedStudents2 = students2.reduce((value,student)=>{
//   student.point>50?value++:value;
//   if(student.point>50){
//     value++;
//   }
//   return value;
// },0);
// console.log(passedStudents2);






// Find Metodu
// let numbers =[100, 200, 300, 400, 500];

// const findNumber = numbers.find(number => number>50);
// console.log(numbers);
// console.log(findNumber);










  
/////////splice


let numbers = [60,70,25,35,80,10,24];

// numbers.splice(3,2)  // birinci sayidan basla 3 tane git  2 atla ve devam et.
// console.log(numbers);




// Find İndex
const index = numbers.findIndex(number=>number==10);
console.log(index);
numbers[index]=50;
console.log(numbers);


numbers.reverse();
console.log(numbers);






