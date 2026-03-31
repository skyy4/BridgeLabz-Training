
public class AuctionApp {
    public static void main(String[] args) {
        AuctionItem item = new AuctionItem();

        try {
            item.placeBid(new User("Alice"), 500);
            item.placeBid(new User("Bob"), 700);
            item.placeBid(new User("Charlie"), 650);
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        item.showHighestBid();
    }
}
