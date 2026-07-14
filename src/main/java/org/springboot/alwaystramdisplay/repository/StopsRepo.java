package org.springboot.alwaystramdisplay.repository;

import org.springboot.alwaystramdisplay.entity.Stops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopsRepo extends JpaRepository<Stops, Long> {
}
