package com.in30mins.controller;

import com.in30mins.dto.ManagerDTO;
import com.in30mins.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class ManagerController {
    ManagerService managerService;

    @PostMapping("/create")
    public ResponseEntity<ManagerDTO> createManager(@RequestBody ManagerDTO managerDTO){
        return new ResponseEntity<>(managerService.createManger(managerDTO), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ManagerDTO>> getAll(){
        List<ManagerDTO> list = managerService.getAllManagersList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ManagerDTO> getById(@PathVariable Integer id){
        ManagerDTO manDto = managerService.findByManagerId(id);
        return ResponseEntity.ok(manDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ManagerDTO> editById(@RequestBody ManagerDTO managerDTO,
                                               @PathVariable Integer id){
        ManagerDTO managerDTO1 = managerService.editByManagerId(id,managerDTO);
        return ResponseEntity.ok(managerDTO1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        managerService.deleteByManagerId(id);
        return ResponseEntity.ok(id+" : Successfully Deleted ....");
    }
}
