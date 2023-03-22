package com.rivera.propertymanagement.repository;

import com.rivera.propertymanagement.entity.Property;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Omar.Rivera on 15/3/23.
 *   
 * @author Omar.Rivera
 */

public interface PropertyRepository extends CrudRepository<Property, Long> {

}
