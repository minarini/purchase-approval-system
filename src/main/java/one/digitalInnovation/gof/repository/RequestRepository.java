package one.digitalInnovation.gof.repository;

import one.digitalInnovation.gof.model.PurchaseRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<PurchaseRequest, Long> {

}
