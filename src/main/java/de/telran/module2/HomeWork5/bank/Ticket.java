package de.telran.module2.HomeWork5.bank;

public class Ticket implements Comparable<Ticket>{
  private String fullName;
  private int dataBirth;
  private String operationType;
  private int ticketNum;

    public Ticket(String fullName, int dataBirth, String operationType, int ticketNum) {
        this.fullName = fullName;
        this.dataBirth = dataBirth;
        this.operationType = operationType;
        this.ticketNum = ticketNum;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDataBirth() {
        return dataBirth;
    }

    public String getOperationType() {
        return operationType;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.ticketNum, other.ticketNum);
    }
}
