package com.example.demo.src.test;

import com.example.demo.src.test.model.TestDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestDTO, Long>, TestRepositoryCustom {

//	JPA -> 좀 복잡한 쿼리 필요하다
//	queryDSL


}
