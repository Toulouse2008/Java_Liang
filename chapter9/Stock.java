public class Stock{
  // Class data fields
  String stockSymbol;
  String stockName;
  double previousClosingPrice;
  double currentPrice;

  // Main method
  public static void main(String[] args){
    Stock orcl = new Stock("Oracle Corporation", "ORCL");
    orcl.setCurrentPrice(34.35);
    orcl.setPreviousClosingPrice(34.5);
    System.out.println(orcl.getChangePercent());
  }

  // Constructor
  Stock(String newStockName, String newStockSymbol){
    this.stockName = newStockName;
    this.stockSymbol = newStockSymbol;
  }

  // Set stock price
  void setCurrentPrice(double newCurrentPrice){
    this.currentPrice = newCurrentPrice;
  }
  void setPreviousClosingPrice(double newPreviousClosingPrice){
    this.previousClosingPrice = newPreviousClosingPrice;
  }
  double getChangePercent(){
    return 100 * (currentPrice - previousClosingPrice) /previousClosingPrice;
  }
}
