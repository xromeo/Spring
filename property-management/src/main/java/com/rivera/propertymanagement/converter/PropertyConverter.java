package com.rivera.propertymanagement.converter;

import com.rivera.propertymanagement.entity.Property;
import com.rivera.propertymanagement.model.PropertyDto;
import org.springframework.stereotype.Component;

/**
 * Created by Omar.Rivera on 15/3/23.
 *
 * @author Omar.Rivera
 */
@Component
public class PropertyConverter {

    public Property dtoToEntity(PropertyDto propertyDto){
        Property pe = new Property();
        pe.setAddress(propertyDto.address());
        pe.setTitle(propertyDto.title());
        pe.setDescription(propertyDto.description());
        pe.setOwnerName(propertyDto.ownerName());
        pe.setOwnerEmail(propertyDto.ownerEmail());
        pe.setPrice(propertyDto.price());
        return pe;
    }

    public PropertyDto entityToDto(Property property){
        PropertyDto pe = new PropertyDto(
                property.getId(),
                property.getTitle(),
                property.getDescription(),
                property.getOwnerName(),
                property.getOwnerEmail(),
                property.getPrice(),
                property.getAddress()
        );

        return pe;
    }

}
