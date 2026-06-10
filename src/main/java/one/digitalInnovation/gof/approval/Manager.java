package one.digitalInnovation.gof.approval;

import one.digitalInnovation.gof.model.PurchaseRequest;
import org.springframework.stereotype.Component;

@Component
public class Manager extends Approver{
    @Override
    public String approve(PurchaseRequest request) {
        if (request.getValue() <= 10_000) {
            return "Manager";
        }
        return next.approve(request);
    }
}
