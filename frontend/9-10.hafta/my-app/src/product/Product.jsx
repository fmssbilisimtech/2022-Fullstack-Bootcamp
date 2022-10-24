import React, { Component } from 'react'
import { Table } from 'reactstrap'
export default class Product extends Component {
  constructor(props){
    super(props)
  }
  render() {
    return (
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
    {this.props.products.map(product=> (
      <tr key={product.id} onClick={()=> this.props.handleClick(product.id)}>
      <th scope="row">
        {product.id}
      </th>
      <td>
        {product.name}
      </td>
    </tr>
    ))}
    
  </tbody>
</Table>
    )
  }
}
