package com.atguigu.java;

import java.util.Set;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;

public class Demo {

	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.80.203", 6379);
		
		String ping = jedis.ping();
		System.out.println(ping);
		//ѡ���
		String select = jedis.select(6);
		System.out.println(select);
		
		//��ȡredis�����е�key
		Set<String> keys = jedis.keys("*");
		
		//����
		for (String key : keys) {
			System.out.println(key);
		}
	}
}
