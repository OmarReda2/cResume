package com.myapp.cResume.service;

import com.myapp.cResume.dao.LinkRepository;
import com.myapp.cResume.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LinkService {

    LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository){
        this.linkRepository = linkRepository;
    }


    public int updateLinkByUserId(Link link, Long urlId, Long userId){
      return  linkRepository.updateLinkByUserId(link, urlId, userId);
    }
}
