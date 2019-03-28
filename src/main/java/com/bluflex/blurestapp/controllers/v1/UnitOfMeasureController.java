package com.bluflex.blurestapp.controllers.v1;

import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.services.UnitOfMeasureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(UnitOfMeasureController.BASE_URL)
public class UnitOfMeasureController {
    public static final String BASE_URL = "/api/v1/unitOfMeasure";

    private UnitOfMeasureService unitOfMeasureService;

    public UnitOfMeasureController(UnitOfMeasureService unitOfMeasureService) {
        this.unitOfMeasureService = unitOfMeasureService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Set<UnitOfMeasureDTO> getAllUnitOfMeasure(){
        return this.unitOfMeasureService.getAllUnitOfMeasure();
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public UnitOfMeasureDTO getUnitOfMeasureByName(@PathVariable String name){
        return this.unitOfMeasureService.getByName(name);
    }


}
