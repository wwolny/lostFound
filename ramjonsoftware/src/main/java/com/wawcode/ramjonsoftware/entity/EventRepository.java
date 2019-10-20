package com.wawcode.ramjonsoftware.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventRepository extends JpaRepository<LostEvent, Long> {

//    @Query("SELECT u FROM LostEvent u INNER JOIN SinglePin p ON p.lostEvent = u.id "
//            + "where ?1 <= min(p.latitude) and max(p.latitude) <= ?2 "
//            + "and ?3 <= min(p.longitude) and max(p.longitude) <= ?4 " + "GROUP BY u.id")
//    List<LostEvent> findInRectangle(Double lowerBound, Double upperBound, Double leftBound, Double rightBound);
}