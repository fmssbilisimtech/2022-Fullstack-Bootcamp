

///////////////////////  var   const   let


// var number = 11.5;
// var name = "Sercan";
// var age = 22;

// console.log(number, name, age);






// const password = "Fmss2022!"

// password = "XmssSSxx";

// console.log(password);







// let password = "Fmss2015?";

// password = "XmssSSxx";

// console.log(password);










/////////////////////////////////  numbers


// var firstNumber = 20;
// var secondNumber = 20;
// console.log(firstNumber + secondNumber);





















/////////////////////////////// Stringler

// var userName = "Sercan";
// console.log(userName);
// console.log(typeof userName);






















////////////////////////////// Boolean

// var a = true;
// let b = false;

// console.log(a , b);


















///////////////////////////// null



//  var a = null;


// var a;

// console.log(a);
// console.log(typeof a);














////////////////////Object


// var user = { name: "Sercan Masar", age: 32 };
// console.log(user);
// console.log(typeof user);
// console.log(user.name);
// console.log(user.age);




















///////////////////////////// Array: Diziler




// var myUserArray = ["Abdurrahman", "Sercan", 10];
// console.log(myUserArray);
// console.log(typeof myUserArray);
// console.log(myUserArray[0]);





//  let numberArray = [44, 55, 67, 89, 344, 324, 56 ,213 ,78]
// console.log(numberArray);

























//////////////////   functions

// name();

// function name() {  
//   console.log(9 + 8) 
// }


// console.log(function name(params) {} );




// var alertMyMessage = function () {
//     alert("Welcome to Fmss")
// };

// alertMyMessage();
// console.log(alertMyMessage);
// console.log(typeof alertMyMessage);



















/////////////////////////////  tuhaf atama

// var a



// a 



// = 40






// console.log(a);




///// let ile tuhaf atama 


// var a = 50;

// var a = 60;



// console.log(a);
















/////////////////////////////////   string turune number atamasi

// var number = 11;
// var name = "Sercan";

// console.log(number, name);




// console.log("///////////////////////");

// number = "aaaaa";
// name = 33;
// console.log( number , name);

// console.log( typeof name);
// console.log( typeof number);





















/////////////////////// block icerisindeki durum 




// var a;

// age();
// {
//     var a = 40;
// }

// console.log(a);









// var a;  

// {
//     var a = 40;
// }

// console.log(a);














/////////////////////////




// var a = 10;
// var b = a;
// console.log(a, b); 
// a = 20;
// console.log(a, b);


















///////////////////////////////////



// var a = [1, 2, 3];
// var b = a;
// a.push(4);
// console.log(b);















///////////////////////////// Type casting



// String'e dönüştürme


// var value;

// var value = String(123);

// console.log(typeof value , value);



/////////// float

// var value = 3.14;

// console.log( typeof value, value);








/////////////////// string to boolean


// value = String(false);
// console.log(typeof value , value);
// value = false;
// console.log(typeof value, value);




// value = String(function () {
//     console.log(value);
// });
// console.log(typeof value, value);




// value = String([1, 2, 3, 4]);
// console.log(typeof value, value);



// value = (10).toString();
// console.log(typeof value, value);















///////////////////////////// Number'a dönüştürme
// var value;
// value = Number("123");
// console.log(value);
// console.log(typeof value);









// value = Number("Hello World!");
// console.log(value);
// console.log(typeof value);






// value = Number(function () {
//     console.log("this is number?");
// });
// console.log(value);
// console.log(typeof value);















// value =[1, 2, 3];
// console.log(value);
// console.log(typeof value);













// value = parseFloat("3.14");
// console.log(value);
// console.log(typeof value);















// value = parseInt("3.6");
// console.log(value);
// console.log(typeof value);



















/////////////////////// Automatically type casting


// value = 3 + "3" + "5";  
// console.log(typeof value, value);



// value = 33 + Number("5");
// console.log(value);
// console.log(typeof value);
















///////////////////////////////////




      //  var char1 = 'c';
      //  console.log("c : " + char1);

      //  var char2 = '\u221d';
      //  console.log("char2 : " + char2);

      //  var char3 = '\u03b2';
      //  console.log("char3 : " + char3);


      //   nextLine = '\n';
      //  console.log(nextLine)





       // Wrong naming


        // let x!;
        // let ?i = 10
        // let new;
        // let {oneCharacter};
       
        // console.log({oneCharacter});
        // let shorty-pant;
        // let white\black;
//         let _ = 5; 
// console.log(_);

        // let let = 10;

        // let const = 20;

        // var let = 10; 
        // console.log(let);

        // var function = 10;



















////////////////////////////////////////////////////




      //  Many on one line but that's not a good practice!


      //  let price = 10.27, tax = 0.18, total = price * tax;
      //  console.log("total price : " + total);














      //  You can do such a weird definition, but don't even think about it!
      //  let yyyy

      //          =
      //          44


    //    // Exponentials

      //  let d1 = 1.6e-19;
      //  console.log("d1 : " + d1);

















/////////////////////////// burada kaldim
            // İçerisine değer atanmamış hiç bir değişken kullanılamaz yani içerisinde değer varmış gibi işlem yapılamaz javada error veriyor.
       
       
    //  let a;
    //  let x = a * 2;

    //   console.log(x); 







      // Ekrandan  değer okunması


       
    //    let a = prompt("Birinci sayıyı giriniz:")

    //    let b = prompt("İkinci sayıyı giriniz:");

    //   var total = a + b;
    //    console.log(total);


    //    console.log("////////////////////////////////")

    //    let intValA = parseInt(a);
    //    let intValB = parseInt(b);

    //    var total = intValA + intValB;

    //    console.log("total : " + total);



//    let response = confirm("evet mi hayir mi")

//    console.log(response);



















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
// const salary = "19000";

// value = firstName + lastName;
// console.log(value);

// value = firstName + " " + lastName;
// console.log(value);












///////////////////////////////////


// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilişim";
// const salary = "19000";

// value = firstName;
// value += " " + lastName; //value = value + " " + lastName;
// value = firstName.length;
// value = firstName.toLocaleUpperCase();
// value = firstName[0];
// value = firstName[firstName.length - 1];
// value = department.indexOf("i");
// console.log(value);

















//////////////////////////////////////////


// let value;
// const firstName = "Ali";
// const lastName = "Kaan";
// const department = "Bilişim";
// const salary = "19000";

// value = lastName.indexOf("u");
// value = lastName.includes("e");
// value = firstName.concat(" ", lastName, " Javasript").toLowerCase();
// value =
//     "İsim: " +
//     firstName +
//     "\nSoyisim: " +
//     lastName +
//     "\nDepartman: " +
//     department +
//     "\nMaaş: " +
//     salary;

//     console.log(value);























///////////////////////////////////

//// Template Literal ////


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

// numbers.pop();
// numbers.shift();

// value = numbers;
// console.log(value);
// value = numbers.sort();

// value = numbers.sort(function (x, y) {
//     return x - y; // Küçükten Büyüğe Sıralama
// });

// value = numbers.sort(function (x, y) {
//     return y - x; // Büyükten Küçüğe Sıralama
// });

// console.log(value);
// console.log(typeof value);


























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
// const langs = ["Ingilizce", "Fransizca", "Filipinlerce"];

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








//  const letters = ["a", "c" , "g" , "f" , "J", "j" , "A"]

// let sortedLetters = letters.sort();

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

