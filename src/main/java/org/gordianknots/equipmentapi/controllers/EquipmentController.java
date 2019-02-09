package org.gordianknots.equipmentapi.controllers;

import org.gordianknots.equipmentapi.model.Equipment;
import org.gordianknots.equipmentapi.repositories.EquipmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EquipmentController {
    @Autowired
    private EquipmentRepository equipmentRepository;

    @RequestMapping(value = "/equipment", method = RequestMethod.GET)
    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAllByOrderByEquipmentId();
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.GET)
    public Equipment get(@PathVariable Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/equipment", method = RequestMethod.POST)
    public Equipment create(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.PUT)
    public Equipment update(@PathVariable Long id, @RequestBody Equipment equipment) {
        Equipment existingEquipment = equipmentRepository.findById(id).orElse(null);
        if (existingEquipment != null) {
            BeanUtils.copyProperties(equipment, existingEquipment);
            existingEquipment = equipmentRepository.save(existingEquipment);
        }
        return existingEquipment;
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        equipmentRepository.delete(equipmentRepository.findById(id).orElse(null));
    }
}
