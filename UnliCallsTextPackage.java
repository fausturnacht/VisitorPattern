import java.util.HashMap;

public class UnliCallsTextPackage implements UnliCallsTextOffer{
    private HashMap<String, Boolean> telcoUnliCallText = new HashMap<>();
    
    static{
        telcoUnliCallText.put("Smart", false);
        telcoUnliCallText.put("Globe", true);
        telcoUnliCallText.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " has " + (telcoUnliCallText.get(telcoName) ? "unlimited calls and texts." : "limited calls and texts.");
    }  
}