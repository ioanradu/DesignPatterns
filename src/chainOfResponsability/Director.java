package chainOfResponsability;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences, approved!");
        } else {
            succesor.handleRequest(request);
        }
    }
}
