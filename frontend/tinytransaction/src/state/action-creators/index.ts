import {ActionType} from "../actions/action-types";
import {Dispatch} from "redux";
import {SendAction} from "../actions/actions";
import {Transaction} from "../../models/transactions";

function sendMoney(amount: number) {
    return (dispatch: Dispatch<SendAction>, transaction: Transaction) => {
        dispatch({
            type: ActionType.SEND,
            payload: transaction
        })
    }
}