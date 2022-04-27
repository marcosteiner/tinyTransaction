export class Transaction {
    constructor(
        public readonly id: number,
        public readonly sender: string,
        public readonly receiver: string) {
    }
}