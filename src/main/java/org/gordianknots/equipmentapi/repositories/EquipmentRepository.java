package org.gordianknots.equipmentapi.repositories;

import org.gordianknots.equipmentapi.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
