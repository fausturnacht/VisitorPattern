import java.util.HashMap;

public class TelcoUnliCallsTextOffer implements UnliCallsTextOffer{
    private static HashMap<String, Boolean> telcoUnliCallText = new HashMap<>();
    
    static{
        telcoUnliCallText.put("Smart", false);
        telcoUnliCallText.put("Globe", true);
        telcoUnliCallText.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, UnliCallsTextOffer unliCallsTextOffer) {
        return (telcoUnliCallText.get(telcoName) ? "Unlimited calls and texts." : "Limited calls and texts.");
    }  
}