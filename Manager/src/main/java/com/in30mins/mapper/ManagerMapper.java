package com.in30mins.mapper;

import com.in30mins.dto.ManagerDTO;
import com.in30mins.model.Manager;

public class ManagerMapper {
    public static Manager mapToManager(ManagerDTO managerDTO){
        return new Manager(
                managerDTO.getId(),
                managerDTO.getName(),
                managerDTO.getEmail()
        );
    }
    public static ManagerDTO mapToManagerDTO(Manager manager){
        return new ManagerDTO(
                manager.getId(),
                manager.getName(),
                manager.getEmail()
        );
    }
}
