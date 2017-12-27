package com.aweiz.dockerdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class DockerdemoApplicationTests {
	static Random r = new Random();
//
//	public static void main(String[] areg) {
//		ExecutorService es = Executors.newFixedThreadPool(50);
//		RestTemplate rt = new RestTemplate();
//
//
//		Runnable r =()->{
//			HttpHeaders headers = new HttpHeaders();
//			String h = getRandomHeader();
//			headers.add("myHeader",h);
//			HttpEntity entity = new HttpEntity(headers);
//			String s = rt.exchange("http://localhost:8080/hi",HttpMethod.GET, entity, String.class).getBody();
//			System.out.println(h+"..."+s);
//		};
//		IntStream.range(0,20).forEach(value -> es.submit(r));
//		es.shutdown();
//	}
//
//	public static String getRandomHeader() {
//		int b = r.nextInt();
//		return b+"";
//	}
}
