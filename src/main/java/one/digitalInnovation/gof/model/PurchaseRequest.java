package one.digitalInnovation.gof.model;

import one.digitalInnovation.gof.enums.StatusRequestEnum;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
    public class PurchaseRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Double value;
    private String approvedBy;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private StatusRequestEnum status;

    public PurchaseRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public StatusRequestEnum getStatus() {
        return status;
    }

    public void setStatus(StatusRequestEnum status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
