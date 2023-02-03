package com.api.notification.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NotificationDto {

    @NotBlank
    @Size(max = 10)
    private String idReconciliation;

    @NotBlank
    @Size(max = 10)
    private String status;

    @NotBlank
    @Size(max = 10)
    private String statusFFone;

    @NotBlank
    @Size(max = 10)
    private String statusNetwin;

    @NotBlank
    @Size(max = 30)
    private String location;

    @NotBlank
    @Size(max = 30)
    private String vendor;

    @NotBlank
    @Size(max = 10)
    private String idEquipment;

    @NotBlank
    @Size(max = 10)
    private String equipmentName;

    @NotBlank
    @Size(max = 10)
    private String idReconciliationReport;

    @NotBlank
    @Size(max = 10)
    private String createdAt;

    @NotBlank
    @Size(max = 10)
    private String updatedAt;

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