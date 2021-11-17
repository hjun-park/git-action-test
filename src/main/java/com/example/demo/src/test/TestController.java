package com.example.demo.src.test;

import com.example.demo.base.BaseException;
import com.example.demo.base.BaseResponse;
import com.example.demo.src.test.model.PostTestReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Validated
@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {

	private final TestService testService;

	@GetMapping("/test-read")
	public BaseResponse<String> myTest() {
		log.info("OK");
		return new BaseResponse<>("OK");
	}

	// BaseResponse로 감싸면 알아서 JSON으로 변환해서 응답해줍니다.
	@PostMapping("/test")
	public BaseResponse<Long> joinTest(@Valid @RequestBody PostTestReq postTestReq) {
		// try로 감싸서 예외처리가 반환되면 예외처리로 json 응답해주기
		// 성공 시에는 Long 값을 JSON 형태로 반환
		try {
			Long testId = testService.joinTest(postTestReq);
			log.info("test1");
			return new BaseResponse<>(testId);
		} catch (BaseException e) {
			return new BaseResponse<>(e.getStatus());
		}
	}
}
