package com.asciipic.repositories;

import com.asciipic.models.Journalize;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface JournalizeRepository extends JpaRepository<Journalize, Long> {
}