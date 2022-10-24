
class Service {

async getRequest (url){

    const response = await fetch(url);

    const data = await response.json();

    return data;
}


async postRequest(url, data){

    const response = await fetch(url, {
        method:"POST",
        headers: {"Content-type" : "application/json"},
        body: JSON.stringify(data)
    })

    const result = await response.json();

    return result;
}


async putRequest(url, data){
    const response = await fetch(url, {
        method:"PUT",
        headers: {"Content-type" : "application/json"},
        body: JSON.stringify(data)
    })

    const result = await response.json();

    return result;
}


async deleteRequest(url){
    const response = await fetch(url, {
        method:"DELETE",
        headers: {"Content-type" : "application/json"},
    
    })

    const result = await response.json();

    return result;
}




}


    const service = new Service();

// service.getRequest("http://localhost:3000/employees")
// .then(response => callback(response));

// function callback(data){
//     data.forEach(element => {
//         document.getElementById("body").innerHTML += `<ul>
//     <li>${element.id}</li>
//     <li>${element.name}</li>
//     <li>${element.lang}</li>
// </ul>` 
//     });
   
// }

// service.postRequest("http://localhost:3000/employees", {
    
//         id: 17,
//         name: "Amin",
//         lang: "PHP"
//       }).then(result => console.log(result)).catch(err => console.log(err))


document.getElementById("btn").addEventListener("click", function(){

    ///////PUT
    // service.putRequest("http://localhost:3000/employees/8", {
    
    //     id: 8,
    //     name: "Amin",
    //     lang: "Wordpress"
    //   }).then(response => console.log(response)).catch(err => console.log(err))


     ///////DELETE 
   service.deleteRequest("http://localhost:3000/employees/8").then(respose => console.log(respose)).catch(err => console.log(err))


})


