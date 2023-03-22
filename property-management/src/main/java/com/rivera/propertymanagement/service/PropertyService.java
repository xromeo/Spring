package com.rivera.propertymanagement.service;

import com.rivera.propertymanagement.model.PropertyDto;

import java.util.List;

/**
 * Created by omar on 15/3/23.
 *
 * @author omar
 */

public interface PropertyService {
    PropertyDto save(PropertyDto propertyDto);

    List<PropertyDto> getAll();

    PropertyDto update(PropertyDto propertyDto, Long propertyId);

}
