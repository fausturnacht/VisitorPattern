import javax.print.attribute.standard.MediaSize.Other;

public class TelcoPromo {
    public static void main(String[] args) {

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new TelcoUnliCallsTextOffer();
        PromoPrice price = new TelcoPrice();
        OtherNetworkOffer network = new TelcoOtherNetworkOffer();

        // exercise every supported telco name as well as an unsupported one
        String[] telcoNames = {"Smart", "Globe", "Ditto"};

        for (String name : telcoNames) {

            Telco telco = new Telco(name);
            System.out.println("===== " + name + " =====");

            // data allowance visitor
            System.out.println("Data allowance: " +
                telco.accept(promo, telco.getTelcoName()));

            // unlimited calls/text visitor
            System.out.println("Unlimited calls/text: " +
                telco.accept(unli, telco.getTelcoName()));

            // promo price visitor
            System.out.println("Promo price: " +
                telco.accept(price, telco.getTelcoName()));

            // other network offer visitor
            System.out.println("Other networks: " +
                telco.accept(network, telco.getTelcoName()));

            System.out.println("\n");
        }
    }
}