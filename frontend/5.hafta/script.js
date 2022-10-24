

////////////destructing  spread operator

// let arr = [100,200,300];

// [number1, number2, ...kalanlar] = arr;

// console.log(number1 , number2, kalanlar);


// const numbers = {
//   a:10,
//   b:20,
//   c:30,
//   d:40,
//   e:50
// }

// const {a:n1,b:n2,e:n3} = numbers;

// console.log(n1 , n2, n3)




///////// Selectors on dom

// let value = document.querySelector(".list-group");

// value = document.querySelector(".list-group-item:nth-child(2)");

// value = document.querySelector(".list-group").children;


// value = document.querySelector(".list-group").children[4];


// value = document.querySelector(".list-group").childElementCount;

// list = document.querySelector(".list-group").children;

// value = list[list.length-1];

// value = list[3].textContent = "Horror";


// document.querySelector(".list-group").textContent = "value";

// value = document.querySelector(".list-group").firstElementChild;

// value = document.querySelector(".list-group").lastElementChild;

// value = document.querySelector(".list-group").firstElementChild.nextElementSibling;

// value = document.querySelector(".list-group-item:nth-child(4)").previousElementSibling;


// value = document.querySelector(".list-group-item:nth-child(4)").previousElementSibling.parentElement.parentElement;


// console.log(value);








////////////////////dinamik element ekleme


// elementa = document.createElement("a")
// elementa.href = "https://www.w3schools.com/"
// elementa.textContent = "tiklayin";
// elementa.id = "element-a"
// elementa.classList = "btn btn-danger ms-5"
// document.querySelector(".list-group-item:nth-child(2)").appendChild(elementa);





// document.querySelector(".list-group").textContent = "Filmleri listele" // tum elementleri siler ve textcontenti ekler.



// elementa.classList.add("newButton")

// console.log(elementa);











 
///////////////  element silme

// let lists = document.querySelector(".list-group-item")

//   document.querySelector(".list-group-item:nth-child(4)").previousElementSibling.remove(); 

//   document.querySelector(".list-group-item:nth-child(4)").previousElementSibling.classList.remove("list-group-item")



// document.querySelector(".list-group").removeChild(list[list.length-1])














/////////// elementleri yer degistirme



// let list = document.querySelector(".list-group");

// let newElement = document.createElement("li")
// newElement.classList = "list-group-item bg-danger";
// newElement.textContent = "Kupa"


// let oldElement = list.firstElementChild;

// list.replaceChild(newElement, oldElement)


// console.log(newElement);













/////////// attribute degistirme


// let el = document.querySelector("#title")

// el.placeholder = 'film adi';

// let place = el.getAttribute("placeholder");

// el.setAttribute("placeholder", "Lutfen filmin adini yaziniz");

// el.setAttribute("title", "film ismi kisa olmalidir");

// let bool= el.hasAttribute("title");


// el.removeAttribute("class");

// console.log(place);
// console.log(bool);
// console.log(el);









/////////////////////////////  events

// document.addEventListener("DOMContentLoaded" , function () { 
//     setTimeout(function(){
//         alert("Hos geldiniz");
//     }, 3000);
    
//  })



let btn = document.getElementById("submit-button")

// btn.addEventListener("click", function () {
//     console.log("butona tiklandi");
//   });


//   btn.addEventListener("dblclick", function () {
//     console.log("butona tiklandi");
//   });




//   btn.addEventListener("mouseover", function () {
//     console.log("butona tiklandi");
//     reset();
//   });
//   btn.addEventListener("mouseleave", function () {
//     console.log("butona tiklandi");
//     reset();
//   });

// function reset(){
//     document.getElementById("title").value = "";
// }



///////  mouseover eventi documanda gezinme.

// window.addEventListener("mouseover" , function(e){
//     console.log(e.target.textContent);
// })





////// html uzerinden elemente event ekleme
// function getValue(){
//     console.log("butona tiklandi");
//     reset()
// }

// function reset(){
//     document.getElementById("title").value = "";
// }




////////////////////


// let titleInput = document.getElementById("title")

// window.addEventListener("keyup" , function(e){
//     // console.log(e.which);
//     // console.log(e.key);
// })



// titleInput.addEventListener("keydown" , function(e){
//     console.log(titleInput.value);
//     console.log(e.which);
// })





// titleInput.addEventListener("keypress" , function(){
//     console.log(titleInput.value)
// })


// blur
 let titleInput = document.getElementById("title")
titleInput.addEventListener("copy" , function(){
    document.querySelector(".message").innerHTML = `<div class="text-danger">Hata giris yaptiniz</div>`
})











