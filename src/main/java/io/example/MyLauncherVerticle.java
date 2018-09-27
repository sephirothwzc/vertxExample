package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * @author 吴占超
 * @date 2018/9/27 1:40 PM
 */
public class MyLauncherVerticle extends AbstractVerticle {

    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type","application/json")
                    .end("{id:1}");
        }).listen(8098);
    }
}
