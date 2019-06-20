package th.co.cbank.project.model.mapping;

public class PrintSlipPayment {

    private String item;
    private Double amount;
    private Double subAmount;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getSubAmount() {
        return subAmount;
    }

    public void setSubAmount(Double subAmount) {
        this.subAmount = subAmount;
    }

}
