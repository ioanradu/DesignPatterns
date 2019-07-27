package chainOfResponsability;

public class Manager extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.REIMBURSEMENT) {
            // Manager's area of approval
            if (request.getAmount() > 100) {
                System.out.println("Manage can approve but rejects it");
            } else {
                System.out.println("Manage can approve and signs it request");
            }
        } else {
            // not my area of approval but I know someone higher then me
            succesor.handleRequest(request);
        }
    }
}
