package com.asciipic.services.journalize.crawl;

import com.asciipic.models.JournalizeCrawl;
import com.asciipic.repositories.JournalizeCrawlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeCrawlServiceImpl implements JournalizeCrawlService {
    @Autowired
    private JournalizeCrawlRepository repository;

    @Override
    public JournalizeCrawl save(JournalizeCrawl entity) {
        return this.repository.save(entity);
    }
}
