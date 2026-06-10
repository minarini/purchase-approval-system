package one.digitalInnovation.gof.approval;

import one.digitalInnovation.gof.model.PurchaseRequest;

public abstract class Approver {
    protected Approver next;

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract String approve(PurchaseRequest request);
}
