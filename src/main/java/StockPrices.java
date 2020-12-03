import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class StockPrices {

    private List<Observer> observersList;
    private float tesla;
    private float apple;
    private float microsoft;

    private String teslaSymbol = "TSLA";
    private String appleSymbol = "AAPL";
    private String microsoftSymbol = "MSFT";



    public StockPrices(){
        observersList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observersList.add(observer);
    }

    public void removeObserver(Observer observer){
        int i = observersList.indexOf(observer);
        if(i >= 0){
            observersList.remove(i);
        }
    }

    //Need to go back and add logic to this to send out different notify messages depending on the change.
    public void notifyObservers(){
        for(Observer observer : observersList){
            observer.update(tesla, apple, microsoft);
        }
    }

    public void priceChange(){
        notifyObservers();
    }

    public void setPrice(float tesla, float apple, float microsoft) throws IOException {
        this.tesla = getTesla();
        this.apple = getApple();
        this.microsoft = getMicrosoft();
        priceChange();
    }


    public float getTesla() throws IOException {
        Stock stock = YahooFinance.get(teslaSymbol);
        BigDecimal price = stock.getQuote(true).getPrice();
        tesla = price.floatValue();
        return tesla;
    }

    public float getApple() throws IOException {
        Stock stock = YahooFinance.get(appleSymbol);
        BigDecimal price = stock.getQuote(true).getPrice();
        apple = price.floatValue();
        return apple;
    }

    public float getMicrosoft() throws IOException {
        Stock stock = YahooFinance.get(microsoftSymbol);
        BigDecimal price = stock.getQuote(true).getPrice();
        microsoft = price.floatValue();
        return microsoft;
    }




}
