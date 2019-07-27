package chainOfResponsability;

public class Request {
    private RequestType type;
    private int amount;

    public Request(RequestType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
