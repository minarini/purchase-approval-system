package one.digitalInnovation.gof.controller;

import one.digitalInnovation.gof.model.PurchaseRequest;
import one.digitalInnovation.gof.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("requests")
public class RequestRestController {
    @Autowired
    private RequestService service;

    @GetMapping
    public ResponseEntity<Iterable<PurchaseRequest>> fetchAll() {
        return ResponseEntity.ok(service.fetchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseRequest> fetchById(@PathVariable Long id) {
        return ResponseEntity.ok(service.fetchById(id));
    }

    @PostMapping
    public ResponseEntity<PurchaseRequest> createRequest(@RequestBody PurchaseRequest purchaseRequest) {
        System.out.println("Entrou");
        service.createRequest(purchaseRequest);
        return ResponseEntity.ok(purchaseRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
