package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * 依赖于Launcher 启动
 *
 * @author 吴占超
 * @date 2018/9/26 11:17 PM
 */
public class MainVerticle extends AbstractVerticle {

    public void start() {
        vertx.deployVerticle(MyLauncherVerticle.class.getName());
    }
}
