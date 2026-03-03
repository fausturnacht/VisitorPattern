public class TelcoPromo {
    public static void main(String[] args) {

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();
        PromoPrice price = new TelcoPrice();

        TelcoSubscription telco = new Telco("Smart");
        
        // System.out.println("Smart Data Usage Offer and price: " 
        // + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        // System.out.println("Globe Data Usage Offer and price" 
        // + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        // System.out.println("Ditto Data Usage Offer and price" 
        // + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        // System.out.println("\nSmart unlimited calls and text package: " 
        // + unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        // System.out.println("Globe unlimited calls and text package: " 
        // + unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        // System.out.println("Ditto unlimited calls and text package: " 
        // + unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}