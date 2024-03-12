package de.telran.module_3.homeWork1.url;

import de.telran.module_3.homeWork1.url.practice.HttpCodesConsumer;

public class SimpleHTTPStatus {
    public static void main(String[] args) {
        HttpCodesConsumer.findValueByCode(101);
        HttpCodesConsumer.findValueByCode(202);
        HttpCodesConsumer.findValueByCode(303);
        HttpCodesConsumer.findValueByCode(404);
        HttpCodesConsumer.findValueByCode(505);

    }
}

