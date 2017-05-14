package com.asciipic.repositories;

import com.asciipic.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
}
