package de.telran.homeWorks_22_08.module1.module6.homeWork2.hotel;

public class SimpleHotel {
    public static void main(String[] args) {

        ThreadInteraction interaction = new ThreadInteraction();
        Request request = new Request(interaction);
        Response response = new Response(interaction);
    }
}
//. Вы въезжаете в отель и подходите к стойке администратора. За стойкой никого нет, но на ней стоит звоночек, используя который Вы можете позвать администратора. Т.к. наплыв гостей очень редко бывает большим, чтобы организовывалась очередь, администратор обычно "уходит по своим делам", обслужив Вас и ждет следующего звонка.
//Напишите программу, которая автоматизирует данный процесс обслуживания.
//Гость и Администратор - отдельные потоки приложения.
//Используйте wait / notify механизм многопоточности