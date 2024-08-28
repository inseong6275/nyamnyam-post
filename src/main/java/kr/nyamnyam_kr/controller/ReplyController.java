package kr.nyamnyam_kr.controller;

import kr.nyamnyam_kr.model.domain.ReplyModel;
import kr.nyamnyam_kr.model.entity.ReplyEntity;
import kr.nyamnyam_kr.model.repository.ReplyRepository;
import kr.nyamnyam_kr.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reply/")
public class ReplyController  {
    private final ReplyService replyService;
    private final ReplyRepository replyRepository;

    @PostMapping("insert")
    public Object insert(@RequestBody ReplyEntity entity) {
        return replyRepository.save(entity.builder()
                        .content(entity.getContent())
                .build());
    }

    @PostMapping("save")
    public ReplyEntity save(ReplyModel replyModel) {
        return replyService.save(replyModel);
    }

    @GetMapping("findAll")
    public List<ReplyEntity> findAll() {
        return replyService.findAll();
    }

    @GetMapping("findById")
    public Optional<ReplyEntity> findById(Long id) {
        return replyService.findById(id);
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        replyService.deleteById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return replyService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return replyService.count();
    }
}
