package com.example.deviceemulator;

import java.util.ArrayList;
import java.util.HashMap;

public class Device {
    public String deviceId,deviceName,assetNumber,modelNumber,maufactureDate,deviceStatus,batteryLevel,operatingTime;
    public String receivedDate,servicePeriod,serialNumber,hospitalId;

    public Device() {
    }

    public Device(String deviceId, String deviceName, String assetNumber, String modelNumber, String maufactureDate, String deviceStatus, String batteryLevel, String operatingTime, String receivedDate, String servicePeriod, String serialNumber, String hospitalId) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.assetNumber = assetNumber;
        this.modelNumber = modelNumber;
        this.maufactureDate = maufactureDate;
        this.deviceStatus = deviceStatus;
        this.batteryLevel = batteryLevel;
        this.operatingTime = operatingTime;
        this.receivedDate = receivedDate;
        this.servicePeriod = servicePeriod;
        this.serialNumber = serialNumber;
        this.hospitalId = hospitalId;
    }


    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getMaufactureDate() {
        return maufactureDate;
    }

    public void setMaufactureDate(String maufactureDate) {
        this.maufactureDate = maufactureDate;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getOperatingTime() {
        return operatingTime;
    }

    public void setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(String servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public ArrayList<Device> getDeviceList(){
         Device d1=new Device("100","Bone Cutting Saw","23420","AAAA","20/01/2020","Active","90%","5hr","20/05/2020","2 months","1","10001");

         ArrayList<Device> devices= new ArrayList<Device>();
         devices.add(d1);
        devices.add(d1);

         return devices;

    }
    public HashMap<Integer,Device> getHashList(){
        ArrayList<Device> devices= this.getDeviceList();
        HashMap<Integer,Device> hm=new HashMap<Integer,Device>();
        for( int i=0;i<devices.size();i++){
            hm.put(Integer.parseInt(devices.get(i).getDeviceId()),devices.get(i));
        }

        return hm;
    }
}
