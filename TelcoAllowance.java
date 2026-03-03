import java.util.HashMap;

public class TelcoAllowance implements UsagePromo{
    private static HashMap<String, Integer> telcoDataAllowance = new HashMap<>();

    static{
        telcoDataAllowance.put("Smart", 15);
        telcoDataAllowance.put("Globe", 10);
        telcoDataAllowance.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, UsagePromo usagePromo) {
        return telcoDataAllowance.get(telcoName) + "GB";
    }
}
