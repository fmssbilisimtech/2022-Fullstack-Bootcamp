
// const person1 = { //Object Literal
//   name:"Sercan",
//   age:35,
//   showInfo:function(){console.log("Bilgiler Gösteriliyor...");}
// };
// const person2 = {
//   name:"Sercan",
//   age:25,
//   showInfo:function(){console.log("Bilgiler Gösteriliyor...");}
// };

// console.log(person2);















// Yapıcı Fonksiyon - Constructor

// function Employee(name,age,salary){
//   this.name = name;
//   this.age = age;
//   this.salary = salary;
//     this.showInfo = function(){
//         console.log(this)
//     }
//   this.toString = function(){console.log("Bu Employee Objesidir.")}
// }

//  const emp1 = new Employee("Melih",35,4250);


// const emp2 = new Employee("Sercan",25,5000);
// emp1.showInfo(); 

// Employee.prototype.showInfo = function(){console.log("İsim: " + this.name + ", Yaş: " + this.age);}

//   const emp1 = new Employee("Melih",35,4250);
//   const emp2 = new Employee("Sercan",25,5000);
//   console.log(emp1);
//  console.log(emp2);













// const obj = {
//   test1:function(){
//     console.log("Test 1");
//   },
//   test2:function(){
//     console.log("Test 2");
//   }
// }
//   console.log(obj);


//  const emp = Object.create(obj);
// emp.name = "Sercan";
// emp.age = 25;
// console.log(emp);
// emp.test1();
// emp.test2();


















// function Person(){
//   this.salary=4250;
// }
// Person.prototype.test1 = function(){
//   console.log("Test 1");
// }
// Person.prototype.test2 = function(){
//   console.log("Test 2");
// }
// function Employee(name,age){
//   this.name=name;
//   this.age=age;
// }
// Employee.prototype=Object.create(Person.prototype);
// const emp = new Employee("Varol",35);

// emp.test1();
// console.log(emp);
















// Call, Apply, Bind

// const obj1 = {
//   number1:10,
//   number2:20
// };
// const obj2 = {
//   number1:30,
//   number2:40
// };

// function addNumbers(number3,number4){
//   console.log(this)
//   console.log(this.number1+this.number2+number3+number4);
// }

// addNumbers.call(obj1,100,200);
// addNumbers.call(obj2,100,200);
// addNumbers.apply(obj1,[100,200]);
// addNumbers.apply(obj2,[100,200]);

//Bind



// const obj1 = {
//   number1:10,
//   number2:20
// };
// const obj2 = {
//   number1:30,
//   number2:40
// };


// function getTotal(number3,number4){
//   return this.number1+this.number2+number3+number4
// }
// const total1 = getTotal.bind(obj1);
// const total2 = getTotal.bind(obj2);

// console.log(total1(100,200));
// console.log(total2(100,200));













// function Person(name,age){
//   this.name=name;
//   this.age=age;
//   this.temp = function(){ return 'merhaba'}
// }

// let a= new Person('sercan',32)
// console.log(a)


// Person.prototype.test1 = function(){
//   console.log("Test 1");
// }
// Person.prototype.test2 = function(){
//   console.log("Test 2");
// }

// function Employee(name,age){
//   Person.call(this,name,age);
//   this.salary=4250;
// }


// Employee.prototype=Object.create(Person.prototype);
// const emp = new Employee("Sercan",35);

// emp.test1();
// console.log(emp);






// function Employee(name,age,salary){
//   this.name = name;
//   this.age = age;
//   this.salary = salary;
//   // this.showInfo = function(){console.log("İsim: " + this.name + ", Yaş: " + this.age);}
//   this.toString = function(){console.log("Bu Employee Objesidir.")}
// }
// Employee.prototype.showInfo = function(){console.log("İsim: " + this.name + ", Yaş: " + this.age);}

// const emp1 = new Employee("Melih",35,4250);
// const emp2 = new Employee("Sercan",25,5000);

// console.log(emp1);
// emp1.showInfo();
// emp1.toString();

// class Employee {
//   constructor(name,age,salary){ // constructor
//     this.name = name;
//     this.age = age;
//     this.salary = salary;
//   }
//   showInfo(){
//     console.log("İsim: " + this.name + ", Yaş: " + this.age);
//   }
// }
// const emp = new Employee("Sercan",30,4250);
// emp.showInfo();
// console.log(emp);







// class Matematik {
//   static cube(x){
//     console.log(x*x*x);
//   }
// }

// Matematik.cube(3);
// const mat = new Matematik();
// mat.cube(4);












// class Person { // Superclass, Baseclass
//   constructor(name,age){
//     this.name = name;
//     this.age = age;
//   }
//   showInfo(){
//     console.log("İsim: " + this.name + ", Yaş: " + this.age);
//   }
// }
// class Employee extends Person { //Subclass, Childclass
//   constructor(name,age,salary){
//     // this.name = name;
//     // this.age = age;
//     super(name,age);
//     this.salary = salary;
//   }
//   showInfo(){ // Override
//     console.log("İsim: " + this.name + ", Yaş: " + this.age + ", Maaş: " + this.salary);
//   }
// }

// const emp = new Employee("Sercan",35,4250);

// console.log(emp);
// emp.showInfo();
