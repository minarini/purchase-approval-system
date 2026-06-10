package one.digitalInnovation.gof.approval;

import one.digitalInnovation.gof.model.PurchaseRequest;
import org.springframework.stereotype.Component;

@Component
public class Director extends Approver{
    @Override
    public String approve(PurchaseRequest request) {
        if (request.getValue() <= 50_000) {
            return "Director";
        }
        return next.approve(request);
    }
}
