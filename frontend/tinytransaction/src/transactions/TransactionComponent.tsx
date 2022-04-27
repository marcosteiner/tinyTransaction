import Box from '@mui/material/Box';
import Divider from '@mui/material/Divider';
import List from '@mui/material/List/List';
import ListItem from '@mui/material/ListItem';
import ListItemText from '@mui/material/ListItemText';
import Typography from '@mui/material/Typography';
import React from 'react';
import {Transaction} from "../models/transactions";

export default function TransactionComponent() {
    return (
        <div>
            <TransactionList/>
        </div>
    )
}

function TransactionList() {
    let transactions = [
        new Transaction(1, "123", "124"),
        new Transaction(1, "123", "124"),
        new Transaction(1, "123", "124"),
        new Transaction(1, "123", "124"),
        new Transaction(1, "123", "124")
    ]

    const transactionList = transactions.map((transaction) =>
        <List sx={{width: '100%', maxWidth: 360, bgcolor: 'background.paper'}}>
            <ListItem alignItems="flex-start">
                <ListItemText
                    primary={transaction.id}
                    secondary={
                        <Box sx={{display: 'flex', flexDirection: 'column'}}>
                            <Typography
                                sx={{display: 'inline'}}
                                component="span"
                                variant="body2"
                                color="text.primary"
                            >
                                From: {transaction.sender}
                            </Typography>
                            <Typography
                                sx={{display: 'inline'}}
                                component="span"
                                variant="body2"
                                color="text.primary"
                            >
                                From: {transaction.receiver}
                            </Typography>
                        </Box>
                    }
                />
            </ListItem>
            <Divider variant="inset" component="li"/>
        </List>
    )

    return (
        <React.Fragment>
            {transactionList}
        </React.Fragment>
    )
}