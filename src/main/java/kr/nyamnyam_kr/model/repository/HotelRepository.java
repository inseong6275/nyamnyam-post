package kr.nyamnyam_kr.model.repository;

import kr.nyamnyam_kr.model.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
