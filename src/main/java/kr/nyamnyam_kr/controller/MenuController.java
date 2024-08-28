package kr.nyamnyam_kr.controller;

import kr.nyamnyam_kr.model.domain.MenuModel;
import kr.nyamnyam_kr.model.entity.MenuEntity;
import kr.nyamnyam_kr.model.repository.MenuRepository;
import kr.nyamnyam_kr.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu/")
public class MenuController {

    private final MenuService menuService;
    private final MenuRepository menuRepository;

    @PostMapping("insert")
    public Object insert(@RequestBody MenuEntity entity) {

        return menuRepository.save(entity.builder()
                        .price(entity.getPrice())
                        .menuName(entity.getMenuName())
                .build());
    }

    @PostMapping("save")
    public MenuEntity save(MenuModel menuModel) {
        return menuService.save(menuModel);
    }

    @GetMapping("findAll")
    public List<MenuEntity> findAll() {
        return menuService.findAll();
    }

    @GetMapping("findById")
    public Optional<MenuEntity> findById(Long id) {
        return menuService.findById(id);
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        menuService.deleteById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return menuService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return menuService.count();
    }
}
