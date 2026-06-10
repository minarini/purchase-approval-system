package one.digitalInnovation.gof.service;

import one.digitalInnovation.gof.model.PurchaseRequest;

public interface RequestService {
    Iterable<PurchaseRequest> fetchAll();

    PurchaseRequest fetchById(Long id);

    void createRequest(PurchaseRequest purchaseRequest);

    void delete(Long id);

}
