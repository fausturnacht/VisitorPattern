public class Telco implements TelcoSubscription{
    private String telcoName;

    public Telco(String telcoName){
        this.telcoName = telcoName;
    }


    @Override
    public String accept(UsagePromo usagePromo, String telcoName) {
        return usagePromo.showAllowance(telcoName, usagePromo);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, String telcoName) {
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallsTextOffer);
    }

    @Override
    public String accept(PromoPrice promoPrice, String telcoName) {
        return promoPrice.showPromoPrice(telcoName, promoPrice);
    }

    // getters and setters for the Telco fields
    public String getTelcoName() {
        return this.telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }
}
