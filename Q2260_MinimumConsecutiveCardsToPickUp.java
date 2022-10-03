import java.util.HashMap;

public class Q2260_MinimumConsecutiveCardsToPickUp {

    public int minimumCardPickup(int[] cards) {
        // Number, Position
        HashMap<Integer, Integer> map = new HashMap<>();
        int best = -1;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                int prevPos = map.get(cards[i]);
                int diff = i - prevPos;
                if (best == -1 || best > diff) {
                    best = diff + 1; // +1 to include the first card being picked up
                }
            }
            map.put(cards[i], i);
        }
        return best;
    }

}
