package io.hel.impl;

import io.hel.SayHello;

/**
 * helei
 * 2022/2/22 10:20
 * description:
 */
@SuppressWarnings("all")
public class SayHelloWithChinese implements SayHello {
    @Override
    public String sayHello() {
        return "say hello with chinese!";
    }
}
