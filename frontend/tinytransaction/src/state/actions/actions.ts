import {Transaction} from "../../models/transactions";
import {ActionType} from "./action-types";

export interface SendAction {
    type: ActionType.SEND
    payload: Transaction
}

export type Action = SendAction