package com.example.demo.src.test;

import com.example.demo.base.BaseException;
import com.example.demo.src.test.model.PostTestReq;
import com.example.demo.base.BaseException;
import com.example.demo.src.test.model.PostTestReq;

// 인터페이스로 만들고 인터페이스로 빈을 주입해 주면 향후 유지보수에 용이함
public interface TestService {

	Long joinTest(PostTestReq postTestReq) throws BaseException;
}
