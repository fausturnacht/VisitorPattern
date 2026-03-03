import java.util.HashMap;

public class TelcoOtherNetworkOffer implements OtherNetworkOffer {
    private static HashMap<String, String> telcoOtherNetworkOffer = new HashMap<>();

    static{
        telcoOtherNetworkOffer.put("Smart", "Users are charged per use regardless of network.");
        telcoOtherNetworkOffer.put("Globe", "Free calls and texts ONLY within the network.");
        telcoOtherNetworkOffer.put("Ditto", "Free calls and texts to all networks within the country.");
    }

    @Override
    public String showOtherNetworkOffer(String telcoName, OtherNetworkOffer otherNetworkOffer) {
        return telcoOtherNetworkOffer.get(telcoName);
    }
    
}
