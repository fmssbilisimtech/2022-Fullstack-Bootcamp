{/* <tr>
<td><img src="" class="img-fluid img-thumbnail" ></td>
<td></td>
<td></td>
<td><a href="#" id = "delete-film" class = "btn btn-danger">Filmi Sil</a></td>
</tr>  */}




const titleInput = document.getElementById("title");
const directorInput = document.getElementById("director");
const urlInput = document.getElementById("url");
const btnSubmit = document.getElementById("submit-btn");
const  filmList = document.getElementById("films")


btnSubmit.addEventListener("click" , addFilm);

function addFilm(){
 
    title = titleInput.value;
    director = directorInput.value;
    url = urlInput.value;

    let newFilm = new NewFilm(title, director, url);

    if(title === "" || url === "" || director === ""){
        setAlert("danger" , "Bu alan bos olamaz!");
    }
    else{

      if(localStorage.getItem("film") == null){
        localStorage.setItem("film", JSON.stringify([newFilm]))
        setAlert("success" , "tebrikler");  
      }

     else{
    
        let getLocal =  JSON.parse(localStorage.getItem("film"));
        getLocal.push(newFilm);
        localStorage.setItem("film", JSON.stringify(getLocal));
    }
       
}
}

       let getFromLocalStore = JSON.parse(localStorage.getItem("film"));
       getFromLocalStore.forEach(element =>{
        filmList.innerHTML += `
        <tr>
     <td><img src="${element.url}" class="img-fluid img-thumbnail" width="150"></td>
     <td>${element.title}</td>
    <td>${element.director}</td>
    <td><a href="#" id = "delete-film" class = "btn btn-danger">Filmi Sil</a></td>
    </tr>  
        `
       })
   





