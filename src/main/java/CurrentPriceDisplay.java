public class CurrentPriceDisplay implements Observer, Display {

    private float tesla;
    private float apple;
    private float microsoft;
    private StockPrices stockPrices;

    public CurrentPriceDisplay(StockPrices stockPrices){
        this.stockPrices = stockPrices;
        stockPrices.registerObserver(this);
    }

    @Override
    public void displayAll() {
        System.out.println("Tesla Stock Price: " + tesla);
        System.out.println("Apple Stock Price: " + apple);
        System.out.println("Microsoft Stock Price: " + microsoft);

    }

    @Override
    public void displayTesla(){
        System.out.println("Tesla Stock price: " + tesla);
    }

    @Override
    public void displayApple(){

        System.out.println("Apple Stock Price: " + apple);
    }

    @Override
    public void displayMicrosoft(){

        System.out.println("Microsoft Stock Price: " + microsoft);
    }

    @Override
    public void update(float tesla, float apple, float microsoft) {
        this.tesla = tesla;
        this.apple = apple;
        this.microsoft = microsoft;
        displayAll();

    }
}
