package com.zuber.SecondMiniPro.repositoty;

import com.zuber.SecondMiniPro.entity.CourseEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {


}
