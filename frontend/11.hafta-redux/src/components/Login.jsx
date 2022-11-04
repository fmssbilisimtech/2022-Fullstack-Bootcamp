import React, { Component } from 'react'
import { connect } from 'react-redux'
 
class Login extends Component {
    
  render() {

    return (
      <div>login {this.props.checkLogin.boolLogin}</div>
    )
  }
}

const mapStateToProps = state => {
 
  return{
    checkLogin: state.loginReducer
  } 
  
}
 

     
       

export default connect(mapStateToProps)(Login);



