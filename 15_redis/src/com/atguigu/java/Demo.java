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
		//选择库
		String select = jedis.select(6);
		System.out.println(select);
		
		//获取redis中所有的key
		Set<String> keys = jedis.keys("*");
		
		//遍历
		for (String key : keys) {
			System.out.println(key);
		}
	}
}
