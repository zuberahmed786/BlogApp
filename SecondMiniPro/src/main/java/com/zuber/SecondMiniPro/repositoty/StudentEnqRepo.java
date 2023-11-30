package com.zuber.SecondMiniPro.repositoty;

import com.zuber.SecondMiniPro.entity.StudentEnqEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity,Integer> {


}
