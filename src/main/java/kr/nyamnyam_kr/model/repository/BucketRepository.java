package kr.nyamnyam_kr.model.repository;

import kr.nyamnyam_kr.model.entity.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<BucketEntity, Long> {
}
