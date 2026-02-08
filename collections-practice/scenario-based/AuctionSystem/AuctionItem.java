package scenario-based.AuctionSystem;

import java.util.TreeMap;

public class AuctionItem {
    private TreeMap<User, Double> bids = new TreeMap<>();

    public void placeBid(User user, double amount) throws InvalidBidException {
        if (!bids.isEmpty()) {
            double highest = bids.lastEntry().getValue();
            if (amount <= highest) {
                throw new InvalidBidException("Bid must be higher than current highest bid");
            }
        }
        bids.put(user, amount);
    }

    public void showHighestBid() {
        if (!bids.isEmpty()) {
            var entry = bids.lastEntry();
            System.out.println("Highest Bid: " + entry.getKey().getName() + " -> " + entry.getValue());
        }
    }
}
