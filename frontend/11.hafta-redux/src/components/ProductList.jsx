import React, { Component } from 'react'
import { connect } from 'react-redux';
import { getProductService } from '../redux/actions/productListAction';
import {Table} from 'reactstrap'
 class ProductList extends Component {
     componentDidMount(){
         this.props.productListHandle();
         console.log(this.props.productList)
     }
    
  render() {
    return (
      <>
        <Table
  bordered
  borderless
  dark
  hover
  responsive
  striped
>
  <thead>
    <tr>
      <th>
        #
      </th>
      <th>
        First Name
      </th>
    </tr>
  </thead>
  <tbody>
      {this.props.productList.map(product => (
          <tr key={product.id}> 
        <th scope="row">
            {product.id}
          </th>
          <td>
            {product.title}
          </td>
        </tr>
      ))}
  </tbody>
</Table>
      </>
    )
  }
}

const  mapStateToProps = state =>{
    return {
        productList : state.productListReducer
    }
}

function mapDispatchToProps(dispatch) {
    return {

        productListHandle : () => { dispatch(getProductService()) }

    }
}


export default connect(mapStateToProps, mapDispatchToProps)(ProductList);
