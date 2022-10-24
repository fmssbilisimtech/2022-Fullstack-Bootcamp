function setAlert(type , decription){
    document.querySelector(".message").innerHTML = `
    <div class="alert alert-${type}" role="alert">
  ${decription}
</div>
    `
}