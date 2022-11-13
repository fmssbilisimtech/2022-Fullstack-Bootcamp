


      // Ekrandan  değer okunması


       
      //  let a = prompt("Birinci sayıyı giriniz:")

      //  let b = prompt("İkinci sayıyı giriniz:");

      // var total = a + b;
      //  console.log(total);


      //  console.log("////////////////////////////////")

      //  let intValA = parseInt(a);
      //  let intValB = parseInt(b);

      //  var total = intValA + intValB;

      //  console.log("total : " + total);



  //  let response = confirm("evet mi hayir mi")

  //  console.log(response);




  ///////////// alert fonksiyonu ekrana uyari vermek icin kullanilir.


  
// alert("Fmss bootcamp")



// let value = confirm("eminmisin?")

// console.log(value);













/////////////////////////////////////////

// Operatörler
// const a = 10;
// const b = 4;
// let s;

// s = a + b;
// s = a - b;
// s = a * b;
// s = a / b;
// s = a % b;

// s = Math.PI;
// s = Math.round(a / b);
// s = Math.ceil(a / b);
// s = Math.floor(a / b);
// s = Math.sqrt(16);
// s = Math.pow(4, 3);
// s = Math.random();
// s = Math.floor(Math.random() * 20 + 1);

// console.log(s);


























//////////////////////////////////////


// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilişim";
// const salary = "5500";

// value = firstName + lastName;
// console.log(value);

// value = firstName + " " + lastName;
// console.log(value);



// console.time()
// value = firstName.concat(lastName)
// console.log(value);
// console.timeEnd();













///////////////////////////////////


// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilisim";
// const salary = "19000";

// value = firstName;
// value += " " + lastName; //value = value + " " + lastName;
// value = firstName.length;
// value = firstName.toLocaleUpperCase();
// value = firstName[0];
// value = firstName[firstName.length - 1];
// value = department.indexOf("B");
// console.log(value);

















//////////////////////////////////////////


// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilişim";
// const salary = "19000";

// value = lastName.indexOf("K");
// value = lastName.includes("e");
// value = firstName.concat(" ", lastName, " Javasript").toLowerCase();
// console.time()
// value = "İsim: " + firstName + "\nSoyisim: " + lastName +  "\nDepartman: " +  department + "\nMaaş: " + salary;
//      console.log(value);
// console.timeEnd()

















///////////////////////////////////

//// Template Literal ////

// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilişim";
// const salary = "19000";

// value = `İsim: ${firstName}\nSoyisim: ${lastName}\nDepartman: ${department}\nMaaş: ${salary}`;
// console.log(value);



// let value;
// const userName = "Aydin";
// const department = "Bilişim";
// const salary = "25000";
// value =
//     "<ul>" +
//     "<li>" + userName + "</li>" +
//     "<li>" + department + "</li>" +
//     "<li>" + salary + "</li>" +
//     "</ul>";
// value = `
// <ul>
// <li>${userName}</li>
// <li>${department}</li>
// <li>${salary}</li>
// </ul>
// `;
// document.body.innerHTML = value;























///////////////////////////////////////


// let value;
// const numbers = [45, 78, 34, 79, 23, 5];
// const langs = ["Fr", "Sm", "Cs", "Tr"];

// value = numbers.length;
// value = numbers[3];
// value = numbers[numbers.length - 1];
// numbers.push(200);

// value = numbers;

// value = numbers.indexOf(23);
// value = numbers.includes(6);

//  value = numbers.pop();
// // numbers.shift();

// console.log(value, numbers);





/////////////////////////////////


// let array1 = ["code", "source", {name: "website"}];
// let popped = array1.pop()
// console.log(array1);
// console.log(popped);


// array1.push(50);
// console.log(array1);




// array1.shift();
// console.log(array1);



// array1.unshift("select");
// console.log(array1);









//////////////////////////////////
// let value;
// const numbers = [45, 78, 34, 79, 23, 5];
// const langs = ["aa", "cc", "Cs", "Tr", "Ab"];

// // value = numbers.sort();
// // console.log(value);


// value = langs.sort();
// console.log(value);
















////////////////////////////////////////  Objects


// let value;
// const user = {
//     name: "Sercan Masar",
//     age: 23,
//     email: "sercan@gmail.com",
//     langs: ["Türkçe", "İngilizce", "Çince"],
//     address: {
//         city: "İstanbul",
//         street: "Dereboyu",
//     },
//     work: function () {
//         console.log("Çalışıyor");
//     },
// };



// console.log(user);
// console.log(typeof user);

// value = user.email;
// value = user.address.city;

// value = user.work();

// user.work()
// value = user["name"]  /// bu sekildede secim yapilabilir.
 

// console.log(value);
// console.log(typeof value);















 
////////////////////////////////////////  Arrays 




// let value;
// const numbers = [45, 78, 34, 79, 100, 5];
// const langs = ["Ingilizce", "Fransizca", "Filipince"];

// value = numbers.length;
// value = numbers[3];
// value = numbers[numbers.length - 1];
// numbers.push(200);

// value = numbers;

// value = numbers.indexOf(23);
// value = numbers.includes(6);

// numbers.pop();
// numbers.shift();

// value = numbers;
// console.log(value);


















///////////////////////////////////////////








 const letters = ["a", "c" , "g" , "f" , "J", "j" , "A"]

let sortedLetters = letters.sort();

// console.log(sortedLetters)


// letters.forEach((letter)=> {
//  console.log( letter , letter.charCodeAt(0)) 
// })




// const numberArr = [54, 67, 32, 100, 10.5]

// let sortedNumberArr = numberArr.sort();

// console.log(sortedNumberArr);











///////////////////////////////////


// value = numbers.sort(function (x, y) {
//     return y -x; // Küçükten Büyüğe Sıralama
// });

// value = langs.sort(function (x, y) {
//     return y - x; // Büyükten Küçüğe Sıralama
// });

// console.log(value);










////////////////////////////////////////


// let employees = [
  
//   {name: "Mert Ozarslan", age: 27},
//   {name: "Abdurrahman Sam", age: 28},
//   {name: "Sercan Masar", age: 22}
// ]

// let compareArray = employees.sort((a , b)=>{

//   if (a.age < b.age) {
//     return -1
//   }

//   else if(a.age === b.age ){
//  return 0
//   }

//   else{
//     return 1
//   }

// })

// console.log(compareArray)





// let employees = [
//   {name: "Sercan Masar", age: 22},
//   {name: "Mert Ozarslan", age: 27},
//   {name: "Abdurrahman Sam", age: 28}
// ]

// let sortedEmployeeByAge =  employees.sort((a,b)=>{
// a.age - b.age
// })


// console.log(sortedEmployeeByAge);



// Karşılaştırma Operatörleri

// == Eşittir
// === Hem Türü Hem Değeri Eşit
// != Eşit Değildir
// !== Hem Türü Hem Değeri Eşit Değildir
// > Büyüktür
// < Küçüktür
// >= Büyük Eşit
// <= Küçük Eşit
 


// console.log(2 == 2);
// console.log("js" == "java");

// console.log(2 === "2");
// console.log(2 === "2");

// console.log(4>2);

// console.log(2!=2);


// And operatörü

// console.log((2 == 2) && ("Sercan"=="Görkem"));

// Or operatörü

// console.log((2 == 2) || ("Sercan"=="Görkem"));

// Koşullar

// if

// const error = false;
// if (!error){
//   console.log("Hata Oluştu");
// }

// if (error){
//   console.log("Hata Oluştu");
// }
// else{
//   console.log("Hata Oluşmadı");
// }


// const process = "3";

// if (process === "1"){
//   console.log("İşlem 1");
//  }
// else if (process === "2"){
//   console.log("İşlem 2");
// }
// else if (process === "3"){
//   console.log("İşlem 3");
// }
// else if (process === "4"){
//   console.log("İşlem 4");
// }
// else {
//   console.log("Geçersiz İşlem");
// }

// Switch Case

// const process = 3 ;

// switch (process){
//   case 1:
//     console.log("İşlem 1");
//     break;
//   case 2:
//     console.log("İşlem 2");
//     break;
//   case 3:
//     console.log("İşlem 3");
//     break;
//   default:
//     console.log("Geçersiz İşlem");
// }

// Fonksiyonlar

// function merhaba(){
//   console.log("Merhaba");
// }

// merhaba();
// merhaba();
// merhaba();
// merhaba();


// function user(age, name = "ali" ){
//   console.log(`İsim: ${name} \nYaş: ${age}`); 
// }

// user(30);
// user("Sercan",34);
//
// function user(name = "Bilgi Yok", age = "Bilgi Yok"){
//   console.log(`İsim: ${name} \nYaş: ${age}`);
// }

// user("Onur",36);
// user();

// function square(x){
//   return x*x;
// }
// let a = square(2)+1;
// console.log(a);

// const square = function (x){
//   return x*x;
// }
// let a = square(2);
// console.log(a);

// const database = {
//   host: "localhost",
//   add: function(){
//     console.log("Eklendi");
//   },
//   get: function(){
//     console.log("Veri Alındı");
//   },
//   update: function(id) {
//     console.log(`ID: ${id} güncellendi`)
//   },
//   delete: function(id){
//     console.log(`ID: ${id} silindi`)
//   }
// }
// //
// console.log(database.host);
// database.add();
// database.delete(10);

// Döngüler
// While Döngüsü

// let i=0;
// while(i<10){
// //  console.log("Deneme")
// //  i++; // i=i+1;
// //  i+=2 // i=i+2;
// }

// let i = 0;

// while (i < 10){
//   if (i == 3 || i == 5){
//     i++;
//     continue
//   }
//   console.log(i);
//   i++;
// }

// Do While Döngüsü

// let i = 0;
// do {
//   console.log(i);
//   i++;
// }while(i<10);

// const langs = ["Python", "C++", "Javascript"];

// let i = 0;

// // do{
// //   console.log(langs[i]);
// //   i++;
// // }while(i < langs.length);
// while(i < langs.length){
//   console.log(langs[i]);
//   i++;
// }


// For dönüsü

// const langs = ["Python", "C++", "Javascript"];

// for(let i=0; i < langs.length; i++){
//   console.log(langs[i]);
// }
// langs.forEach(function(lang,i){
//   console.log(lang,i);
// });

// const users = [
//   {name:"Ali",age:36},
//   {name:"Ahmet",age:31},
//   {name:"Simge",age:18}
// ];

// const names = users.map(function(user){
//   return user.name;  // names = ["Ali","Eser","Simge"]
// });



// names.map(function(a){
//   console.log(a);
// });


// Window Objesi
// console.log(window);

// const cevap = confirm("Emin misiniz?");
// console.log(cevap);

// const cevap = prompt("2+2=?");
// if(cevap == "4"){
//   console.log("Doğru");
// }
// else{
//   console.log("Yanlış");
// }

// console.log(window.location.port);

// a = window.location.port;
//
// console.log(a);

// if (confirm("Sayfa Yenilensin mi?")){
// //   window.location.reload();
// // }
// // else{
// //   console.log("Yenilenmedi");
// // }


// // let pencereGenisligi = window.innerWidth;
// // let pencereYuksekligi = window.outerHeight;

// // console.log(pencereGenisligi,pencereYuksekligi);

// // pencereGenisligi = window.innerWidth;
// // pencereYuksekligi = window.innerHeight;

// // console.log(pencereGenisligi,pencereYuksekligi);

// // window.scroll(0,300);
// // let yKonum = window.scrollY;
// // console.log(yKonum);

// // Spread Operator
// let sayilar = new Array(20);
// let sayilar2 = new Array(20);
// let numbers = new Array(25);

// for(let i=0; i<sayilar.length;i++){
//   sayilar[i]=Math.floor(Math.random()*100+1);
//   sayilar2[i]=Math.floor(Math.random()*100+1);
//   numbers[i]= Math.floor(Math.random()*100+1);
// }

// sayilar3 = [...sayilar, ...sayilar2]
// number4= [...numbers, ...sayilar];
// console.log(sayilar);
// console.log(sayilar2);
// console.log(numbers);
// console.log(number4);

// //Scope Kavramı

// // Global Scope
// var value1 = 10;
// let value2 = 20;
// const value3 = 30;

// // Functional Scope
// function Func(){
//   var value1 = 40;
//   let value2 = 50;
//   const value3 = 60;
//   console.log("Function Scope: " + value1,value2,value3);
// }

// console.log(value1);
// console.log(value2);
// console.log(value3);
// Func();

// // Block Scope (Döngüler - for, while -- Koşullar - if -- yada herhangi {} blokları)

// if (true){
//   var value1 = 70;
//   let value2 = 80;
//   const value3 = 90;
//   console.log("Block Scope: " + value1,value2,value3);
// }


// Func();
// console.log("Global Scope: " + value1,value2,value3);
