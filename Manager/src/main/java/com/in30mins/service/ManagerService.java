package com.in30mins.service;

import com.in30mins.dto.ManagerDTO;

import java.util.List;

public interface ManagerService {
    ManagerDTO createManger(ManagerDTO managerDTO);

    List<ManagerDTO> getAllManagersList();

    ManagerDTO findByManagerId(Integer id);

    ManagerDTO editByManagerId(Integer id, ManagerDTO managerDTO);

    void deleteByManagerId(Integer id);
}
