package com.meituan.redistest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedistestApplicationTests {

    @Autowired
    JedisPool jedisPool;

    @Test
    public void contextLoads() {

        Jedis jedis = jedisPool.getResource();
        jedis.set("liang","rongrong");

        System.out.println(jedis.get("liang"));
    }

}
