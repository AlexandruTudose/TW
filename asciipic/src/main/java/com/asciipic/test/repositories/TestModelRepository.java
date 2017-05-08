package com.asciipic.test.repositories;

import com.asciipic.test.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestModelRepository extends JpaRepository<TestModel, Long> {
    TestModel save(TestModel entity);
}
