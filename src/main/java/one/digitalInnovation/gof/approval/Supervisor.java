package one.digitalInnovation.gof.approval;

import one.digitalInnovation.gof.model.PurchaseRequest;
import org.springframework.stereotype.Component;

@Component
public class Supervisor extends Approver{
    @Override
    public String approve(PurchaseRequest request) {
        if (request.getValue() <= 1000) {
            return "Supervisor";
        }
        return next.approve(request);
    }
}
