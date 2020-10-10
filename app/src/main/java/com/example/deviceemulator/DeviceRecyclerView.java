package com.example.deviceemulator;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DeviceRecyclerView extends RecyclerView.Adapter<DeviceRecyclerView.DeviceViewHolder> {

    private Context mContext;
    private List<Device>  devices;

    public DeviceRecyclerView(Context mContext, List<Device> devices) {
        this.mContext = mContext;
        this.devices = devices;
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.device_item,parent,false);
        return new DeviceViewHolder((v));
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {

        final Device device = devices.get(position);

        holder.id.setText(device.getDeviceId());
        holder.name.setText(device.getDeviceName());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mContext,DeviceInfo.class);
                intent.putExtra("deviceId",device.getDeviceId());
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    public  class DeviceViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public TextView id;
        public TextView name;
        public Button view;
        public DeviceViewHolder(View itemView) {
            super(itemView);
            mView=itemView;
            id = itemView.findViewById(R.id.device_id);
            name = itemView.findViewById(R.id.device_name);
            view = itemView.findViewById(R.id.view_button);
        }
    }
}
