package de.telran.module3.homeWork1.url.practice;

@FunctionalInterface
public interface Action {
    void action(int code, HttpCodesConsumer codes);
}
