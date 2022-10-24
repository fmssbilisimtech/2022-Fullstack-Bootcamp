

////selected dom elements
const btn = document.getElementById("start-button");


//// event listeners
btn.addEventListener("click", startAjax)



///// start ajax request

function startAjax(){


/////  GET 

// const xhr = new XMLHttpRequest();

// xhr.open("GET", "https://jsonplaceholder.typicode.com/todos");

// xhr.onreadystatechange = function(){
//   if (this.status == 200 && this.readyState == 4) {
//       console.log("Basarili istek gonderdiniz!!!") /// hata mesaji gostermelik verildi!!
//   }  
// }
// xhr.onload = function(){
//     console.log(this.response);
// }
// xhr.send();

// }











///// POST


// const xhr = new XMLHttpRequest();

// xhr.open("POST", "https://jsonplaceholder.typicode.com/posts");

// xhr.onload = function(){
//     if (this.status) {
//         console.log("Tebrikler basarili kayit")
//         console.log(this.response);
//       }  
//       else{
//           throw new Error("Post isteginiz hatali");
//       }
    
// }

// xhr.setRequestHeader("Content-type", "application/json")

// const unProcessedData = {
//     userId: 1,
//     id: 500,
//     title: "POST REQ",
//     body: "This is a post request"
//   }

//   xhr.send(JSON.stringify(unProcessedData));
}
















////// PUT


// const xhr = new XMLHttpRequest();

// xhr.open("PUT", "https://jsonplaceholder.typicode.com/posts/1");

// xhr.onload = function(){
//     if (this.status) {
//         console.log("Tebrikler basarili kayit")
//         console.log(this.response);
//       }  
//       else{
//           throw new Error("Put isteginiz hatali");
//       }
    
// }

// xhr.setRequestHeader("Content-type", "application/json")

// const unProcessedData = {
//     userId: 1,
//     title: "PUT REQ",
//     body: "This is a put request"
//   }

//   xhr.send(JSON.stringify(unProcessedData));
























/// DELETE


// const xhr = new XMLHttpRequest();

// xhr.open("DELETE", "https://jsonplaceholder.typicode.com/posts/2");

// xhr.onload = function(){
//     if (this.status) {
//         console.log("Tebrikler basarili kayit")
//         console.log(this.response);
//       }  
//       else{
//           throw new Error("Put isteginiz hatali");
//       }
    
// }

// xhr.setRequestHeader("Content-type", "application/json")



//   xhr.send();


//  }



