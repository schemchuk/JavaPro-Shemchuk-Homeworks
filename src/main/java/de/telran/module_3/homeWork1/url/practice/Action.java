package de.telran.module_3.homeWork1.url.practice;

@FunctionalInterface
public interface Action {
    void action(int code, HttpCodesConsumer codes);
}
