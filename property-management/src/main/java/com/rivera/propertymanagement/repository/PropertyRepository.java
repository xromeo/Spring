package com.rivera.propertymanagement.repository;

import com.rivera.propertymanagement.entity.Property;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Omar.Rivera on 15/3/23.
 *   
 * @author Omar.Rivera
 */

public interface PropertyRepository extends CrudRepository<Property, Long> {

    @Query("SELECT p FROM Property p WHERE p.user.id = :userId")
    List<Property> findAllByUserId(@Param("userId") Long userId);
}
