
import {configureStore} from '@reduxjs/toolkit'
import rootReducer from "../reducer/combineReducer";
const store  = configureStore({
    reducer : rootReducer
})

export default store;