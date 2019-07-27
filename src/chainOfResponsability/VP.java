package chainOfResponsability;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE) {
            if (request.getAmount() < 2000) {
                System.out.println("VP approves!");
            } else {
                succesor.handleRequest(request);
            }
        }
    }
}
