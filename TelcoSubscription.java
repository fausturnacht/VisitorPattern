public interface TelcoSubscription {
    String accept(UsagePromo usagePromo, String telcoName);
    String accept(UnliCallsTextOffer unliCallsTextOffer, String telcoName);
    String accept(PromoPrice promoPrice, String telcoName);
}
