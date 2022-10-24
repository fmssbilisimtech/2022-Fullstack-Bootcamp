
class Service {

//// GET PROMISE

get(url){

   return new Promise((resolve , reject) => {
      fetch(url)
      .then(response => response.json())
      .then(data => resolve(data)).catch(err => reject(err))
   });
  }


///// POST PROMISE

post(url, data){

    return new Promise((resolve, reject)=>{
        fetch(url,{
            method: "POST",
            headers : {"Content-type" : "application/json"},
            body: JSON.stringify(data)
        }).then(response => response.json())
        .then(data => resolve(data)).catch(err=> reject(err));
    })

}


///// PUT 

put(url, data){

    return new Promise((resolve, reject)=>{
        fetch(url,{
            method: "PUT",
            headers : {"Content-type" : "application/json"},
            body: JSON.stringify(data)
        }).then(response => response.json())
        .then(data => resolve(data)).catch(err=> reject(err));
    })

}

delete(url){

    return new Promise((resolve, reject)=>{
        fetch(url,{
            method: "DELETE",
            headers : {"Content-type" : "application/json"},
        }).then(response => response.json())
        .then(data => resolve(data)).catch(err=> reject(err));
    })

}



}





const service = new Service();

// service.get("https://jsonplaceholder.typicode.com/photos").then(album => console.log(album));


// service.post("https://jsonplaceholder.typicode.com/photos", {
//     albumId: 1,
//     id: 2,
//     title: "Album post req",
//     url: "https://via.placeholder.com/600/92c952454",
//     thumbnailUrl: "https://via.placeholder.com/150/92c9524545"
// }
// ).then(data => console.log(data));



// service.put("https://jsonplaceholder.typicode.com/photos/1", {
//     albumId: 1,
//     title: "Album post req",
//     url: "https://via.placeholder.com/600/92c95245423432",
//     thumbnailUrl: "https://via.placeholder.com/150/92c9524545"
// }
// ).then(data => console.log(data));



// service.delete("https://jsonplaceholder.typicode.com/photos/10")
// .then(data => console.log(data))
// .catch(err => console.log(err))

