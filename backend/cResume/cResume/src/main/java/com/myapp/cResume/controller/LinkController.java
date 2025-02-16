package com.myapp.cResume.controller;

import com.myapp.cResume.entity.Link;
import com.myapp.cResume.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/links")
@CrossOrigin("http://localhost:4200")
public class LinkController {


    private LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService){
        this.linkService = linkService;
    }

    @PutMapping("/updateLinkByUserId")
    public int updateLink(@RequestBody Link link,
                           @RequestParam Long urlId,
                           @RequestParam Long userId) {
        return linkService.updateLinkByUserId(link, urlId, userId);
    }

}
