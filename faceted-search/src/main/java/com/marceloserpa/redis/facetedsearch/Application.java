package com.marceloserpa.redis.facetedsearch;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;

public class Application {

  public static void main(String[] args) {
    RedisClient redisClient = RedisClient.create("redis://Redis2019!@localhost:6379/0");
    StatefulRedisConnection<String, String> connection = redisClient.connect();

    System.out.println("Connected to Redis");
    connection.sync().set("key", "Hello World 2");

    System.out.println(connection.sync().get("key"));
    
    TicketRepositoryFake ticketRepositoryFake = new TicketRepositoryFake();
    ticketRepositoryFake.getFakes().stream().forEach(ticket -> {
    	connection.sync().sadd("tickets:type:" + ticket.getType(), ticket.getSku());
    	connection.sync().sadd("tickets:disabledAccess:" + ticket.getDisabledAccess(), ticket.getSku());
    	connection.sync().sadd("tickets:city:" + ticket.getCity(), ticket.getSku());
    });
    
    
    System.out.println(connection.sync().scard("tickets:type:premium"));
    
    System.out.println(connection.sync().sinter("tickets:type:premium", "tickets:city:NYC"));
    
    connection.close();
    redisClient.shutdown();
  }
}
