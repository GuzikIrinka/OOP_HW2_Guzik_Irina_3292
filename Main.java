import java.util.List;
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());
        Human humann = new Human();
        humann.name = "Вася";
      Market market = new Market();
      market.acceptToMarket(humann);
      market.takeQueue(humann);
      market.takeOrders();
      market.giveOrders();
      market.releaseFromQueue(humann);
      market.releaseFromMarket(humann);

  }
} 