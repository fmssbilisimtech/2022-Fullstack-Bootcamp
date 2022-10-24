// function param1(){
//     console.log("param1()");
// }

// function param2(){
//     console.log("param2()");
// }


// function param3(){
//     console.log("param3()");
// }

// ///// senkron calisma 
// param2();
// param3();
// param1();









//////////  async function


// async function findDiff (element){
//     return element;

// }

// const el = findDiff("Getir");

// console.log(el);





// async function bringMeACupOfCoffee(coffee){
//     const promise = new Promise((resolve, reject)=>{
//         if(typeof coffee == "string"){
//             setTimeout(()=>{
//                 resolve(coffee);
//             },3000)
          
//         }
//         else{
//             reject(coffee);
//         }
//     })

//     const resolvedData = await promise;



//     return resolvedData;

// }

// bringMeACupOfCoffee("Filtre")
// .then(data => console.log(data))
// .catch(err => console.log(err));







///// GET


// async function getPhotos(url){

//     const promise = await fetch(url);
//     const response = await promise.json();


//     console.log(response);
//     return response;

// }

// getPhotos("https://jsonplaceholder.typicode.com/albums").then(response => console.log(response));







//// POST

async function postPhotos(url , data){

    const promise = await fetch(url, {
        method: "POST",
        headers: {"Content-type" : "application/json"},
        body: JSON.stringify(data)
    });
    const response = await promise.json();


    console.log(response);
    return response;

}

postPhotos("https://jsonplaceholder.typicode.com/albums", {
    userId: 1,
    id: 600,
    title: "quidem molestiae enim"
  }).then(response => console.log(response)).catch(err => new Error(err));








  /////// PUT


//   async function putPhotos(url , data){

//     const promise = await fetch(url, {
//         method: "PUT",
//         headers: {"Content-type" : "application/json"},
//         body: JSON.stringify(data)
//     });
//     const response = await promise.json();


//     console.log(response);
//     return response;

// }

// putPhotos("https://jsonplaceholder.typicode.com/albums/8", {
//     userId: 1,
//     id: 8,
//     title: "put req 8"
//   }).then(response => console.log(response)).catch(err => new Error(err));













  /////// DELETE


//   async function deletePhotos(url){

//     const promise = await fetch(url, {
//         method: "DELETE",
//         headers: {"Content-type" : "application/json"},
       
//     });
//     const response = await promise.json();


//     console.log(response);
//     return response;

// }

// deletePhotos("https://jsonplaceholder.typicode.com/albums/40")
// .then(response => console.log(response)).catch(err => new Error(err));