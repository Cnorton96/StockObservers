import java.util.ArrayList;
import java.util.List;

public class StockPrices {

    private List<Observer> observersList;
    private float tesla;
    private float apple;
    private float microsoft;


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

    public void notifyObservers(){
        for(Observer observer : observersList){
            observer.update(tesla, apple, microsoft);
        }
    }

    public void priceChange(){
        notifyObservers();
    }

    //going to go back and change this later which will utilize an api to collect the data off the web.
    public void setPrice(float tesla, float apple, float microsoft){
        this.tesla = tesla;
        this.apple = apple;
        this.microsoft = microsoft;
        priceChange();
    }

    public float getTesla() {
        return tesla;
    }

    public float getApple() {
        return apple;
    }

    public float getMicrosoft() {
        return microsoft;
    }


}
