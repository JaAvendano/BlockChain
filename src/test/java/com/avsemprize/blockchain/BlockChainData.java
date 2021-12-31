package com.avsemprize.blockchain;

import com.blockchain.exchange.rest.api.UnauthenticatedApi;
import com.blockchain.exchange.rest.model.OrderBook;



public class BlockChainData {
    private UnauthenticatedApi unauthenticatedApi;

    public BlockChainData(){
        this.unauthenticatedApi = new UnauthenticatedApi();
    }
    public OrderBook getSymbolQuote(String symbol){
        return this.unauthenticatedApi.getL2OrderBook(symbol);
    }
}
