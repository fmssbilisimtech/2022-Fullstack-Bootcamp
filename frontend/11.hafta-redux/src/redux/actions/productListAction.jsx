import * as actionType from "./actionType"
import axios from "axios"

export const getProduct = (products)=>({
    type : actionType.PRODUCT_LIST,
    payload : products
})

export function getProductService () {
    return function(dispatch){
        debugger;
         return axios.get("https://jsonplaceholder.typicode.com/albums")
         .then(res => res.data)
         .then(res => dispatch(getProduct(res))) 
    }
}