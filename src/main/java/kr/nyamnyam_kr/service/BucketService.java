package kr.nyamnyam_kr.service;

import kr.nyamnyam_kr.model.domain.BucketModel;

import java.util.List;
import java.util.Optional;

public interface BucketService {
    BucketModel save(BucketModel bucketModel);

    List<BucketModel> findAll();

    Optional<BucketModel> findById(Long id);

    void deleteById(Long id);

    boolean existsById(Long id);

    long count();
}
