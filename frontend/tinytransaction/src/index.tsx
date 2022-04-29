import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {configureStore} from '@reduxjs/toolkit'
import {Transaction} from "./models/transactions";
import {AnyAction} from 'redux'
import {Provider} from "react-redux";


interface InitialState {
    transactions: Transaction[]
}

const initialState: InitialState = {
    transactions: []
}

function transactionReducer(
    state = initialState,
    action: AnyAction
) {
    switch (action.type) {
        case 'addTransaction':
            return {...state, value: state.transactions.push(action.payload)}
        default:
            return state
    }
}

interface Action {
    readonly type: string
    payload: any
}

class TransactionAction implements Action {
    payload: any;
    type = "action";
}

const store = configureStore({
    reducer: {
        transactions: transactionReducer
    }
})

export type RootState = ReturnType<typeof store.getState>
export type AppDispatch = typeof store.dispatch

const root = ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
);
root.render(
    <React.StrictMode>
        <Provider store={store}>
            <App/>
        </Provider>
    </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
