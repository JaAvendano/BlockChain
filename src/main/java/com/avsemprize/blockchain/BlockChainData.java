package com.avsemprize.blockchain;

import com.blockchain.exchange.rest.api.UnauthenticatedApi;
import com.blockchain.exchange.rest.model.OrderBook;
import com.blockchain.exchange.rest.model.PriceEvent;
import com.blockchain.exchange.rest.model.SymbolStatus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class BlockChainData {

    public static void main(String[] args) {
        BlockChainData data = new BlockChainData();
        System.out.println("data: " + data.unauthenticatedApi.getSymbols());
    }
    private UnauthenticatedApi unauthenticatedApi;

    public BlockChainData(){
        this.unauthenticatedApi = new UnauthenticatedApi();
    }

    public OrderBook getSymbolQuote(String symbol){
        return this.unauthenticatedApi.getL2OrderBook(symbol);
    }

    public OrderBook getDetailedSymbolQuote(String symbol){
        return this.unauthenticatedApi.getL3OrderBook(symbol);
    }

    public SymbolStatus getSymbolStatus(String symbol){
        return  this.unauthenticatedApi.getSymbolByName(symbol);
    }

    public Map<String, SymbolStatus> getAllSymbols(){
        return this.unauthenticatedApi.getSymbols();
    }

    public PriceEvent getTickerBySymbol(String symbol){
        return this.unauthenticatedApi.getTickerBySymbol(symbol);
    }

    public List<PriceEvent> getAllTickerSymbols(){
        return Arrays.asList(this.unauthenticatedApi.getTickers());
    }

}
