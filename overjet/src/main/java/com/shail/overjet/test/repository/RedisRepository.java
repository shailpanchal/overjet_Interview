package com.shail.overjet.test.repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepository {

	private final RedisTemplate<String, List<String>> redisTemplate;

	public RedisRepository(RedisTemplate<String, List<String>> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public void put(String key, List<String> value) {
		Objects.requireNonNull(key);
		redisTemplate.opsForValue().set(key, value);
	}

	public Optional<List<String>> get(String key) {
		Objects.requireNonNull(key);
		return Optional.ofNullable(redisTemplate.opsForValue().get(key));
	}
}
