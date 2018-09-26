package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * Verticle 组件
 *
 * @author 吴占超
 * @date 2018/9/26 10:59 PM
 */
public class MyFirstVerticle extends AbstractVerticle {

    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World");
        }).listen(8099);
    }

}
