package chainOfResponsability;

public class Main {

    public static void main(String[] args) {
        Request reimbursmentRequest = new Request(RequestType.REIMBURSEMENT, 200);
        Manager manager = new Manager();

        manager.handleRequest(reimbursmentRequest);
        Director director = new Director();
        manager.setSuccesor(director); // creem succesor pentru manager

        VP vp = new VP();
        director.setSuccesor(vp);

        CEO ceo = new CEO();
        vp.setSuccesor(ceo);

        Request conferenceRequest = new Request(RequestType.CONFERENCE, 400);
        manager.handleRequest(conferenceRequest);

        Request purchaseRequest = new Request(RequestType.PURCHASE, 100);
        manager.handleRequest(purchaseRequest);

        Request bigPurchaseRequest = new Request(RequestType.PURCHASE, 7000);
        manager.handleRequest(bigPurchaseRequest);


    }
}
