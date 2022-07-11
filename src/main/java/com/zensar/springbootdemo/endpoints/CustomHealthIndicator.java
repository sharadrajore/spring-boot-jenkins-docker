package com.zensar.springbootdemo.endpoints;

import java.util.Random;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		
		System.out.println("inside doHealthCheck ");

		Random random = new Random();

		int randomNumber = random.nextInt(100);

		if (randomNumber % 2 == 0) {
			builder.up();
		} else {
			builder.down();
		}

	}

}
