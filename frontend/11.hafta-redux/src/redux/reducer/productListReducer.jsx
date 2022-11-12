import * as actionType from "../actions/actionType";
import intialState from "./intialState";

export default function productListReducer (state = intialState.productList, action){

    switch (action.type) {
        case actionType.PRODUCT_LIST: 
            return action.payload
        default:
         return state
    }
}