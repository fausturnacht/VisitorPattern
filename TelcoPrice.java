public class TelcoPrice implements PromoPrice {
    private HashMap<String, Integer> telcoPromoPrice = new HashMap<>();

    static{
        telcoPromoPrice.put("Smart", 500);
        telcoPromoPrice.put("Globe", 450);
        telcoPromoPrice.put("Ditto", 400);
    }

    @Override
    public String showPromoPrice(String telcoName, int promoPrice) {
        return "The promo price for " + telcoName + " is: " + telcoPromoPrice.get(telcoName);
    }
}