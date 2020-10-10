package com.example.deviceemulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressCircle;
    private DeviceRecyclerView deviceRecyclerView;
    public Device device;
    public ArrayList<Device> devices;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitle("Device Emulator");

        recyclerView=findViewById(R.id.device_recycler_view);
        progressCircle=findViewById(R.id.progress_circle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        device=new Device();
        devices=device.getDeviceList();

        deviceRecyclerView =new DeviceRecyclerView(this,devices);
        recyclerView.setAdapter(deviceRecyclerView);
        progressCircle.setVisibility(View.INVISIBLE);


    }


}
