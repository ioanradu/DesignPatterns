package chainOfResponsability;

public abstract class Handler {
    public Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void handleRequest(Request request);
}
