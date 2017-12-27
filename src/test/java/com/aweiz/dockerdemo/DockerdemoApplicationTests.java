package com.aweiz.dockerdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(MyController.class)
public class DockerdemoApplicationTests {
	static Random r = new Random();
	@Autowired
	private MockMvc mvc;
	//
	public static void main(String[] areg) {
		ExecutorService es = Executors.newFixedThreadPool(50);
		RestTemplate rt = new RestTemplate();


		Runnable r =()->{
			HttpHeaders headers = new HttpHeaders();
			String h = getRandomHeader();
			headers.add("myHeader",h);
			HttpEntity entity = new HttpEntity(headers);
			String s = rt.exchange("http://localhost:8080/hi",HttpMethod.GET, entity, String.class).getBody();
			System.out.println(h+"..."+s);
		};
		IntStream.range(0,20).forEach(value -> es.submit(r));
		es.shutdown();
	}

	//@Test
//	public void test1() throws Exception {
//		ExecutorService es = Executors.newFixedThreadPool(50);
//
//		Runnable r =()->{
//			try {
//				String h = getRandomHeader();
//				mvc.perform(get("/hi").header("myHeader",h)
//                        .contentType(MediaType.APPLICATION_JSON))
//                        .andExpect(status().isOk());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		};
//		IntStream.range(0,20).forEach(value -> es.submit(r));
//	}

	private static String getRandomHeader() {
		int b = r.nextInt();
		return b+"";
	}
}
