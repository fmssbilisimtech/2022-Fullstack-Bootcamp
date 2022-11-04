import { CHECK_LOGIN } from "../actions/actionType";

const INITIAL_STATE = {
    boolLogin : false
}

const loginReducer = (state = INITIAL_STATE ,action) =>{
switch (action.type) {
    case CHECK_LOGIN:
        return{
            boolLogin : state.boolLogin
        }
    default:
        return state;
}
}

export default loginReducer;