package de.telran.module2.HomeWork5.transport;

public class Bus implements Comparable<Bus>{
    private  String busNumber;
    private String vehicleNumber;
    private GPSCoordinates gpsCoordinates;

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public GPSCoordinates getGpsCoordinates() {
        return gpsCoordinates;
    }

    public void setGpsCoordinates(GPSCoordinates gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    public Bus(String busNumber, String vehicleNumber, GPSCoordinates gpsCoordinates) {
        this.busNumber = busNumber;
        this.vehicleNumber = vehicleNumber;
        this.gpsCoordinates = gpsCoordinates;




    }

    @Override
    public int compareTo(Bus other) {
        return this.busNumber.compareTo(other.busNumber);
    }
}
