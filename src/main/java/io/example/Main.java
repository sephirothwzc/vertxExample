package io.example;


import io.vertx.core.Vertx;

/**
 * 启动
 *
 * @author 吴占超
 * @date 2018/9/26 10:56 PM
 */
public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
