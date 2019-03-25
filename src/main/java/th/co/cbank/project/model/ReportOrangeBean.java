package th.co.cbank.project.model;

public class ReportOrangeBean {

    private String date;
    private String type;
    private String start;
    private String payStart;
    private String payInt;
    private String balance;
    private double fee;
    private String line;
    private String cashier;

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getPayStart() {
        return payStart;
    }

    public void setPayStart(String payStart) {
        this.payStart = payStart;
    }

    public String getPayInt() {
        return payInt;
    }

    public void setPayInt(String payInt) {
        this.payInt = payInt;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

}
