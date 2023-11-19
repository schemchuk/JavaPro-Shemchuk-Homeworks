package de.telran.module1.homeWork2.transports;

public class Bicikle {
   private boolean frame = true;
  private  int whels;
     private int seats;

    // устанавливаю сеттеры

    public void setFrame(boolean frame) {
        this.frame = frame;
    }

    public void setWhels(int whels) {
        this.whels = whels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    //устанавливаю геттеры


    public boolean isFrame() {
        return frame;
    }

    public int getWhels() {
        return whels;
    }

    public int getSeats() {
        return seats;
    }

    //Преобразую тустринг
    @Override
    public String toString() {
        return "Bicikle{" +
                "frame='" + frame + '\'' +
                ", whels=" + whels +
                ", seats=" + seats +
                '}';
    }
}
