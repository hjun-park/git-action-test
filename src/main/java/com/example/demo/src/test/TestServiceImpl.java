package com.example.demo.src.test;

import com.example.demo.base.BaseException;
import com.example.demo.src.test.model.PostTestReq;
import com.example.demo.src.test.model.TestDTO;
import com.example.demo.utils.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

	private final TestRepository testRepository;
	private final JwtService jwtService;

	@Override
	public Long joinTest(PostTestReq postTestReq) throws BaseException {

		String name = postTestReq.getName();
		int number = postTestReq.getNumber();

		log.info("test2");


		// 생성자 방식
		// TestDTO testDTO = new TestDTO(name, number);

		// 빌더 방식
		TestDTO testDTO = TestDTO.builder()
			.name(name)
			.number(number)
			.build();

		TestDTO savedTest = testRepository.save(testDTO);



		return savedTest.getId();
	}


	// TODO: JWT 검증은 interceptor 계층에서 검증 ?( 추후 git 코드 참고 )
}
