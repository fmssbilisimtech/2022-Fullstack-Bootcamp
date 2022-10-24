
import React, { Component } from 'react'
import Product from './product/Product';
import ProductDetail from './product/ProductDetail';
import {Row, Col} from 'reactstrap'


 class App extends Component {
   constructor(props){
     super(props)
 
    this.state = {products: [{id:1, name:"Reanult", model:2022}
   ,{id:2, name:"Volkswagen", model:2021}
   ,{id:3, name:"Fiat", model:2001}], newCar: {}}
   }
   
   

   handleClick = (id)=>{ 
   this.state.products.forEach(product => {
      if(product.id == id){
        this.setState({newCar : product})
      }
    })
   }  

  render() {
    return (



        <>
        <Product handleClick={this.handleClick} products={this.state.products}/>

        <ProductDetail newCar={this.state.newCar}/>
        </>
    )
  }
}

export default App;