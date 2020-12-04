public class CurrentPriceDisplay implements Observer, Display {

    private float tesla;
    private float apple;
    private float microsoft;
    private float google;
    private float amazon;
    private float facebook;

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
        System.out.println("Google's Stock Price: " + google);
        System.out.println("Amazon's Stock Price: " + amazon);
        System.out.println("Facebook's Stock Price: " + facebook);

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
    public void displayGoogle(){
        System.out.println("Googles stock price: " + google);
    }

    @Override
    public void displayAmazon(){
        System.out.println("Amazon's stock price: " + amazon);
    }

    @Override
    public void displayFacebook(){
        System.out.println("Facebook's stock price: " + facebook);
    }

    @Override
    public void update(float tesla, float apple, float microsoft, float google, float amazon, float facebook) {
        this.tesla = tesla;
        this.apple = apple;
        this.microsoft = microsoft;
        this.google = google;
        this.amazon = amazon;
        this.facebook = facebook;
        displayAll();

    }
}
