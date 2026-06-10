package one.digitalInnovation.gof.service.impl;

import one.digitalInnovation.gof.approval.Director;
import one.digitalInnovation.gof.approval.Manager;
import one.digitalInnovation.gof.approval.Presidency;
import one.digitalInnovation.gof.approval.Supervisor;
import one.digitalInnovation.gof.enums.StatusRequestEnum;
import one.digitalInnovation.gof.model.*;
import one.digitalInnovation.gof.repository.RequestRepository;
import one.digitalInnovation.gof.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository repository;

    @Autowired
    private Supervisor supervisor;

    @Autowired
    private Manager manager;

    @Autowired
    private Director director;

    @Autowired
    private Presidency presidency;

    @Override
    public Iterable<PurchaseRequest> fetchAll() {
        return repository.findAll();
    }

    @Override
    public PurchaseRequest fetchById(Long id) {
        Optional<PurchaseRequest> request = repository.findById(id);
        return request.get();
    }

    @Override
    public void createRequest(PurchaseRequest request) {
        processApproval(request);
        request.setCreatedAt(LocalDateTime.now());
        repository.save(request);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void processApproval(PurchaseRequest request) {
        supervisor.setNext(manager);
        manager.setNext(director);
        director.setNext(presidency);

        String approver = supervisor.approve(request);
        request.setApprovedBy(approver);
        request.setStatus(StatusRequestEnum.APPROVED);
    }
}
