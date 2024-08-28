package kr.nyamnyam_kr.controller;

import kr.nyamnyam_kr.model.domain.ZoneModel;
import kr.nyamnyam_kr.model.entity.ZoneEntity;
import kr.nyamnyam_kr.model.repository.ZoneRepository;
import kr.nyamnyam_kr.service.ZoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/zone/")
public class ZoneController {
    private final ZoneService zoneService;
    private final ZoneRepository zoneRepository;

    @PostMapping("insert")
    public Object insert(@RequestBody ZoneEntity entity) {
        return zoneRepository.save(entity.builder()
                        .name(entity.getName())
                .build());
    }

    @PostMapping("save")
    public ZoneEntity save(ZoneModel ZoneModel) {
        return zoneService.save(ZoneModel);
    }

    @GetMapping("findAll")
    public List<ZoneEntity> findAll() {
        return zoneService.findAll();
    }

    @GetMapping("findById")
    public Optional<ZoneEntity> findById(Long id) {
        return zoneService.findById(id);
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        zoneService.deleteById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return zoneService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return zoneService.count();
    }
}
