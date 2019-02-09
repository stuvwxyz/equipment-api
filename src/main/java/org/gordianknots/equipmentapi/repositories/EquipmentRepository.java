package org.gordianknots.equipmentapi.repositories;

import org.gordianknots.equipmentapi.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    public List<Equipment> findAllByOrderByEquipmentId();
}
