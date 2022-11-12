import loginReducer from "./loginReducer"
import { combineReducers } from "redux";
import productListReducer from "./productListReducer";

const rootReducer =  combineReducers({
      loginReducer, productListReducer
    })

export default rootReducer;


 
