import java.util.HashMap;

public class TelcoAllowance implements UsagePromo{
    private HashMap<String, Integer> telcoDataAllowance = new HashMap<>();

    static{
        telcoDataAllowance.put("Smart", 15);
        telcoDataAllowance.put("Globe", 10);
        telcoDataAllowance.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, int dataAllowance) {
        return telcoName + " has " + telcoDataAllowance.get(telcoName) + "GB of data allowance.";
    }
}
