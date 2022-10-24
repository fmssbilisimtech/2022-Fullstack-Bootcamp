//  localStorage.setItem("name", JSON.stringify({name:"Sercan", lastName: "Masar"}));

 

//  sessionStorage.setItem("name", JSON.stringify({name:"Sercan", lastName: "Masar"}));



//  let store = JSON.parse(localStorage.getItem("name"));

//  console.log(store);


//  localStorage.removeItem("name");


fetch('https://jsonplaceholder.typicode.com/albums')
  .then((response) => response.json())
  .then((data) => console.log(data));