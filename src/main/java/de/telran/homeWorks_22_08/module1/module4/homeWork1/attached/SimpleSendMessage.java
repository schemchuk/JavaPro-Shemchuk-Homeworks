package de.telran.homeWorks_22_08.module1.module4.homeWork1.attached;

public class SimpleSendMessage {
    public static void main(String[] args) {

    }
}

interface   SendMessage{

}

class PrepareData {
  public   <T> String prepareData(T canal) {
      return "Данные для канала " + canal.toString();
  }
}