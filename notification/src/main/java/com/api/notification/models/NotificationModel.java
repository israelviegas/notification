package com.api.notification.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_NOTIFICATION")
public class NotificationModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 10)
    private String idReconciliation;

    @Column(nullable = false, length = 10)
    private String status;

    @Column(nullable = false, length = 10)
    private String statusFFone;

    @Column(nullable = false, length = 10)
    private String statusNetwin;

    @Column(nullable = false, length = 30)
    private String location;

    @Column(nullable = false, length = 30)
    private String vendor;

    @Column(nullable = false, length = 10)
    private String idEquipment;

    @Column(nullable = false, length = 10)
    private String equipmentName;

    @Column(nullable = false, length = 10)
    private String idReconciliationReport;

    @Column(nullable = false, length = 10)
    private String createdAt;

    @Column(nullable = false, length = 10)
    private String updatedAt;

    public UUID getId() {
        return id;
    }

    public void setId(String id) {
        this.id = UUID.fromString(id);
    }

    public String getIdReconciliation() {
        return idReconciliation;
    }

    public void setIdReconciliation(String idReconciliation) {
        this.idReconciliation = idReconciliation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusFFone() {
        return statusFFone;
    }

    public void setStatusFFone(String statusFFone) {
        this.statusFFone = statusFFone;
    }

    public String getStatusNetwin() {
        return statusNetwin;
    }

    public void setStatusNetwin(String statusNetwin) {
        this.statusNetwin = statusNetwin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(String idEquipment) {
        this.idEquipment = idEquipment;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getIdReconciliationReport() {
        return idReconciliationReport;
    }

    public void setIdReconciliationReport(String idReconciliationReport) {
        this.idReconciliationReport = idReconciliationReport;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}