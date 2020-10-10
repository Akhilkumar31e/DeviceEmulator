package com.example.deviceemulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class DeviceInfo extends AppCompatActivity {

    public Device device;
    public HashMap<Integer,Device> hm;

    private TextView Device_Id,deviceName,assetNumber,modelNumber,maufactureDate,deviceStatus,batteryLevel,operatingTime;
    private TextView receivedDate,servicePeriod,serialNumber,hospitalId;;


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        device=new Device();
        hm=device.getHashList();

        String deviceId=getIntent().getExtras().getString("deviceId");

        Toolbar toolbar=findViewById(R.id.toolbar);
        Device currDevice = hm.get(Integer.parseInt(deviceId));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(currDevice.getDeviceName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Device_Id=findViewById(R.id.device_id);
        deviceName=findViewById(R.id.device_name);
        deviceStatus=findViewById(R.id.device_status);
        assetNumber=findViewById(R.id.asset_number);
        modelNumber=findViewById(R.id.model_number);
        maufactureDate=findViewById(R.id.manufacture_date);
        batteryLevel=findViewById(R.id.battery_level);
        operatingTime=findViewById(R.id.operating_time);
        receivedDate=findViewById(R.id.received_date);
        servicePeriod=findViewById(R.id.service_period);
        serialNumber=findViewById(R.id.serial_number);
        hospitalId=findViewById(R.id.hospital_id);

        Device_Id.setText(currDevice.getDeviceId());
        deviceName.setText(currDevice.getDeviceName());
        deviceStatus.setText(currDevice.getDeviceStatus());
        assetNumber.setText(currDevice.getAssetNumber());
        modelNumber.setText(currDevice.getModelNumber());
        maufactureDate.setText(currDevice.getMaufactureDate());
        batteryLevel.setText(currDevice.getBatteryLevel());
        operatingTime.setText(currDevice.getOperatingTime());
        receivedDate.setText(currDevice.getReceivedDate());
        serialNumber.setText(currDevice.getSerialNumber());
        hospitalId.setText(currDevice.getHospitalId());
        servicePeriod.setText(currDevice.getServicePeriod());





    }
}
