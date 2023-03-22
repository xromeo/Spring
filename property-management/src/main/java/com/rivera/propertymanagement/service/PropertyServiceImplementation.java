package com.rivera.propertymanagement.service;

import com.rivera.propertymanagement.converter.PropertyConverter;
import com.rivera.propertymanagement.entity.Property;
import com.rivera.propertymanagement.exception.BusinessException;
import com.rivera.propertymanagement.exception.ErrorModel;
import com.rivera.propertymanagement.model.PropertyDto;
import com.rivera.propertymanagement.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Omar.Rivera on 15/3/23.
 *
 * @author Omar.Rivera
 */

@Service
public class PropertyServiceImplementation implements PropertyService {

    @Autowired
    private PropertyConverter propertyConverter;
    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public PropertyDto save(PropertyDto propertyDto) {
        Property property = propertyConverter.dtoToEntity(propertyDto);
        property = propertyRepository.save(property);
        return propertyConverter.entityToDto(property);
    }

    @Override
    public List<PropertyDto> getAll() {
        List<Property> all = (List<Property>) propertyRepository.findAll();
        return all.stream().map(property -> propertyConverter.entityToDto(property)).collect(Collectors.toList());
    }

    @Override
    public PropertyDto update(PropertyDto propertyDto, Long id) {

        PropertyDto propertyDtou = null;
        Optional<Property> optionalProperty = propertyRepository.findById(id);
        if (optionalProperty.isPresent()) {
            Property property = optionalProperty.get();
            property.setAddress(propertyDto.address());
            property.setTitle(propertyDto.title());
            property.setDescription(propertyDto.description());
            property.setOwnerName(propertyDto.ownerName());
            property.setOwnerEmail(propertyDto.ownerEmail());
            property.setPrice(propertyDto.price());
            propertyDtou = propertyConverter.entityToDto(property);
            propertyRepository.save(property);
        } else {
            List<ErrorModel> errorModelList = new ArrayList<>();
            errorModelList.add(new ErrorModel("NOT_FOUND", "Property not found"));

            throw new BusinessException(errorModelList);
        }

        return propertyDtou;
    }
}
