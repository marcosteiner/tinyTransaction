import {Action} from "../actions/actions";
import {ActionType} from "../actions/action-types";

interface State {
    account: number;

}

export default function transactionReducer(state: State, action: Action): State {
    switch(action.type){
        case ActionType.SEND:
            return state;
        default:
            return state;
    }
}