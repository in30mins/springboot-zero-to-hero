package com.in30mins.service.impl;

import com.in30mins.dto.ManagerDTO;
import com.in30mins.exception.ResourseNotFoundException;
import com.in30mins.mapper.ManagerMapper;
import com.in30mins.model.Manager;
import com.in30mins.repository.ManagerRepository;
import com.in30mins.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    ManagerRepository managerRepository;

    @Override
    public ManagerDTO createManger(ManagerDTO managerDTO) {
        Manager manager = ManagerMapper.mapToManager(managerDTO);
        Manager man = managerRepository.save(manager);
        return ManagerMapper.mapToManagerDTO(man);
    }

    @Override
    public List<ManagerDTO> getAllManagersList() {
        List<Manager> man = managerRepository.findAll();
        return man.stream()
                .map((data)->ManagerMapper.mapToManagerDTO(data))
                .collect(Collectors.toList());
    }

    @Override
    public ManagerDTO findByManagerId(Integer id) {
        Manager man = managerRepository
                .findById(id)
                .orElseThrow(()->new ResourseNotFoundException("Not Found : "+id));
        return ManagerMapper.mapToManagerDTO(man);
    }

    @Override
    public ManagerDTO editByManagerId(Integer id, ManagerDTO managerDTO) {
        Manager man = managerRepository
                .findById(id)
                .orElseThrow(()->new ResourseNotFoundException("Not Found : "+id));
        man.setName(managerDTO.getName());
        man.setEmail(managerDTO.getEmail());
        Manager man1 = managerRepository.save(man);
        return ManagerMapper.mapToManagerDTO(man1);
    }

    @Override
    public void deleteByManagerId(Integer id) {
        Manager man = managerRepository
                .findById(id)
                .orElseThrow(()->new ResourseNotFoundException("Not Found : "+id));
        managerRepository.delete(man);

    }
}
