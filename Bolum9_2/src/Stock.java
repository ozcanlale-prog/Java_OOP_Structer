

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
    }

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    Stock(String newSymbol, String newName, double newPreiousClosingPrice, double CurrentPrice){
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreiousClosingPrice;
        currentPrice = CurrentPrice;
    }

    double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}