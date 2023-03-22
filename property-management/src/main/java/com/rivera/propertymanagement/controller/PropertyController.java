package com.rivera.propertymanagement.controller;

import com.rivera.propertymanagement.model.PropertyDto;
import com.rivera.propertymanagement.service.PropertyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Omar.Rivera on 14/3/23.
 *
 * @author Omar.Rivera
 */

@RestController
@RequestMapping("/api/v1")
public class PropertyController {

    @Value("${custom.property}")
    private String dummy;

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello ";
    }

    @Operation(description = "This method is used for user registration", summary = "register")
    @PostMapping(path = "/properties", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<PropertyDto> save(@Parameter(name = "propertyDto",
            example = "User info"
            , required = true

    ) @Valid @RequestBody PropertyDto propertyDto) {
        System.out.println("propertyDto = " + propertyDto);
        propertyDto = propertyService.save(propertyDto);

        return new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
    }

    @GetMapping("/properties")
    ResponseEntity<List<PropertyDto>> getAll() {
        List<PropertyDto> propertyDtoList = propertyService.getAll();

        return new ResponseEntity<>(propertyDtoList, HttpStatus.OK);
    }

    @PutMapping("/properties/{id}")
    ResponseEntity<PropertyDto> update(@Valid @RequestBody PropertyDto propertyDto, @PathVariable(name = "id") Long id) {
        PropertyDto dto = propertyService.update(propertyDto, id);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
