import {combineReducers} from "redux";
import transactionReducer from "./reducers";


const reducers = combineReducers({
    transactions: transactionReducer
})

export default reducers