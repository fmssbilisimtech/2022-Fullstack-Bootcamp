import React, { Component } from 'react'
import { Table } from 'reactstrap';
 class ProductDetail extends Component {

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
      <th>
        Last Name
      </th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">
        {this.props.newCar.id}
      </th>
      <td>
      {this.props.newCar.name}
      </td>
      <td>
      {this.props.newCar.model}
      </td>
      </tr>
  </tbody>
</Table>
    )
  }
}


export default ProductDetail;