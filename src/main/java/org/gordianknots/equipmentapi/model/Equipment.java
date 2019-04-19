package org.gordianknots.equipmentapi.model;

import org.springframework.data.annotation.ReadOnlyProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ReadOnlyProperty
    private Long equipmentId;
    private String equipmentName;
    private String equipmentAvailable;
    private String equipmentCost;
    private String equipmentDescription;
    private String equipmentOwner;
    private String equipmentOwnerPhone;
    private String equipmentOwnerEmail;

    public Long getequipmentId() {
        return equipmentId;
    }

    public void setequipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getequipmentName() {
        return equipmentName;
    }

    public void setequipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getequipmentAvailable() {
        return equipmentAvailable;
    }

    public void setequipmentAvailable(String equipmentAvailable) {
        this.equipmentAvailable = equipmentAvailable;
    }

    public String getequipmentCost() {
        return equipmentCost;
    }

    public void setequipmentCost(String equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public String getequipmentDescription() {
        return equipmentDescription;
    }

    public void setequipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public String getequipmentOwner() {
        return equipmentOwner;
    }

    public void setequipmentOwner(String equipmentOwner) {
        this.equipmentOwner = equipmentOwner;
    }

    public String getequipmentOwnerPhone() {
        return equipmentOwnerPhone;
    }

    public void setequipmentOwnerPhone(String equipmentOwnerPhone) {
        this.equipmentOwnerPhone = equipmentOwnerPhone;
    }

    public String getequipmentOwnerEmail() {
        return equipmentOwnerEmail;
    }

    public void setequipmentOwnerEmail(String equipmentOwnerEmail) {
        this.equipmentOwnerEmail = equipmentOwnerEmail;
    }
}
