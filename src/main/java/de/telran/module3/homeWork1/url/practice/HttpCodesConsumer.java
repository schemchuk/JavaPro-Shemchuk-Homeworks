package de.telran.module3.homeWork1.url.practice;
import java.util.function.Consumer;

public enum HttpCodesConsumer {
    INFORMATIONAL(100, 199, HttpCodesConsumer::printInfo),
    SUCCESS(200, 299, HttpCodesConsumer::printSuccess),
    REDIRECTION(300, 399, HttpCodesConsumer::printRedirection),
    CLIENT_ERROR(400, 499, HttpCodesConsumer::printClientError),
    SERVER_ERROR(500, 599, HttpCodesConsumer::printServerError);

    int minCode;
    int maxCode;
    Consumer<HttpCodesConsumer> valConsumer;

    HttpCodesConsumer(int minCode, int maxCode, Consumer<HttpCodesConsumer> consumer) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.valConsumer = consumer;
    }

    public static void findValueByCode(int code) {
        for (HttpCodesConsumer v : HttpCodesConsumer.values()) {
            if (code >= v.minCode && code <= v.maxCode) {
                v.valConsumer.accept(v);
                break;
            }
        }
    }

    private static void printInfo(HttpCodesConsumer code) {
        System.out.println(code.minCode + " принадлежит " + code.name() + " группе в перечислении HttpCodes.INFORMATIONAL");
    }

    private static void printSuccess(HttpCodesConsumer code) {
        System.out.println(code.minCode + " принадлежит " + code.name() + " группе в перечислении HttpCodes.SUCCESS");
    }

    private static void printRedirection(HttpCodesConsumer code) {
        System.out.println(code.minCode + " принадлежит " + code.name() + " группе в перечислении HttpCodes.REDIRECTION");
    }

    private static void printClientError(HttpCodesConsumer code) {
        System.out.println(code.minCode + " принадлежит " + code.name() + " группе в перечислении HttpCodes.CLIENT_ERROR");
    }

    private static void printServerError(HttpCodesConsumer code) {
        System.out.println(code.minCode + " принадлежит " + code.name() + " группе в перечислении HttpCodes.SERVER_ERROR");
    }
}





