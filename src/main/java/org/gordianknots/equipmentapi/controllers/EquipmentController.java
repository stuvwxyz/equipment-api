package org.gordianknots.equipmentapi.controllers;

import org.gordianknots.equipmentapi.model.Equipment;
import org.gordianknots.equipmentapi.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        return equipmentRepository.findAll();
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.GET)
    public Equipment get(@PathVariable Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/equipment/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        equipmentRepository.delete(equipmentRepository.findById(id).orElse(null));
    }
}
