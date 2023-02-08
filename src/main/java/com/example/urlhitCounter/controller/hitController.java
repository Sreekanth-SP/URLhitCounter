package com.example.urlhitCounter.controller;
import com.example.urlhitCounter.model.hitModel;
import com.example.urlhitCounter.service.hitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitors-count")
public class hitController {

    @Autowired
    private hitService urlHitService;
    @GetMapping("/user/{user}/count")
    public hitModel getCount(@PathVariable String user)
    {
        return urlHitService.getCount(user);
    }
}