package com.example.demo.src.test;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Slf4j
@Repository
public class TestRepositoryCustomImpl implements  TestRepositoryCustom {

	private final JPAQueryFactory queryFactory;

	public TestRepositoryCustomImpl(EntityManager em) {
		this.queryFactory = new JPAQueryFactory(em);
	}

}
