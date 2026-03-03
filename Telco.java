public class Telco implements TelcoSubscription{
    private String telcoName;
    private int promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText){

        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }


    @Override
    public accept() {
        
    }

    // getters and setters for the Telco fields
    public String getTelcoName() {
        return this.telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public int getPromoPrice() {
        return this.promoPrice;
    }

    public void setPromoPrice(int promoPrice) {
        this.promoPrice = promoPrice;
    }

    public int getDateAllowance() {
        return this.dateAllowance;
    }

    public void setDateAllowance(int dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public boolean getUnliCallText() {
        return this.unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}
