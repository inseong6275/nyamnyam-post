package kr.nyamnyam_kr.controller;

import kr.nyamnyam_kr.model.domain.ReplyModel;
import kr.nyamnyam_kr.model.domain.RestaurantModel;
import kr.nyamnyam_kr.model.entity.ReplyEntity;
import kr.nyamnyam_kr.model.entity.RestaurantEntity;
import kr.nyamnyam_kr.model.repository.RestaurantRepository;
import kr.nyamnyam_kr.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant/")
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantRepository restaurantRepository;

    @PostMapping("/save")
    public RestaurantEntity save(@RequestBody RestaurantEntity entity) {
        return restaurantRepository.save(entity.builder()
                .name(entity.getName())
                .address(entity.getAddress())
                .tel(entity.getTel())
                .operateTime(entity.getOperateTime())
                .entryDate(entity.getEntryDate())
                .modifyDate(entity.getModifyDate())
                .toilet(entity.getToilet())
                .build());
    }

    @GetMapping("/findAll")
    public List<RestaurantEntity> findAll() {
        return restaurantService.findAll();
    }

    @GetMapping("/findById")
    public Optional<RestaurantEntity> findById(Long id) {
        return restaurantService.findById(id);
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        restaurantService.deleteById(id);
    }

    @GetMapping("/existsById")
    public boolean existsById(Long id) {
        return restaurantService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return restaurantService.count();
    }
}
