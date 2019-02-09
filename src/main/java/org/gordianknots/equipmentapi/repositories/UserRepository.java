package org.gordianknots.equipmentapi.repositories;

import org.gordianknots.equipmentapi.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Equipment, String> {
//    List<Equipment> findAllByUserId(String id);
}
