package com.shidcode.springbootwp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Software-Engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineer(){
        return softwareEngineerService.getSoftwareEngineer();
    }
    @GetMapping("{id}")
    public SoftwareEngineer getEngineerbyId(
            @PathVariable Integer id
    ){
        return softwareEngineerService.getSoftwareEngineerbyId(id);
    }
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);

    }
}
