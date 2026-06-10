package one.digitalInnovation.gof.approval;

import one.digitalInnovation.gof.model.PurchaseRequest;
import org.springframework.stereotype.Component;

@Component
public class Presidency extends Approver{

    @Override
    public String approve(PurchaseRequest request) {
        return "Presidency";
    }
}
