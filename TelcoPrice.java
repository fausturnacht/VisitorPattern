import java.util.HashMap;

public class TelcoPrice implements PromoPrice {
    private static HashMap<String, Integer> telcoPromoPrice = new HashMap<>();

    static{
        telcoPromoPrice.put("Smart", 500);
        telcoPromoPrice.put("Globe", 450);
        telcoPromoPrice.put("Ditto", 400);
    }

    @Override
    public String showPromoPrice(String telcoName, PromoPrice promoPrice) {
        return "\u20B1" +telcoPromoPrice.get(telcoName);
    }
}