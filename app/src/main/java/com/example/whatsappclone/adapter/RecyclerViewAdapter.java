package com.example.whatsappclone.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.whatsappclone.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private Context context;
    private int data;
    private int VIEW_FLAG;

    public RecyclerViewAdapter(Context context, int data, int VIEW_FLAG) {
        this.context = context;
        this.data = data;
        this.VIEW_FLAG = VIEW_FLAG;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        switch (VIEW_FLAG) {
            case 1:
                view.findViewById(R.id.call_type).setVisibility(View.GONE);
                break;
            case 2:
                view.findViewById(R.id.time).setVisibility(View.GONE);
                view.findViewById(R.id.new_msg_badge).setVisibility(View.GONE);
                view.findViewById(R.id.msg_read_status).setVisibility(View.GONE);
                view.findViewById(R.id.call_type).setVisibility(View.GONE);
                break;
            case 3:
                view.findViewById(R.id.time).setVisibility(View.GONE);
                view.findViewById(R.id.new_msg_badge).setVisibility(View.GONE);
                break;
        }
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView profileImage;
        private TextView profileName;
        private TextView time;
        private TextView lastMsgDesc;
        private ImageView msgReadStatus;
        private ImageView newMessageBadge;
        private ImageView callType;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile_image);
            profileName = itemView.findViewById(R.id.profile_name);
            time = itemView.findViewById(R.id.time);
            lastMsgDesc = itemView.findViewById(R.id.last_msg_desc);
            msgReadStatus = itemView.findViewById(R.id.msg_read_status);
            newMessageBadge = itemView.findViewById(R.id.new_msg_badge);
            callType = itemView.findViewById(R.id.call_type);
        }

        public void enableChatView() {
            itemView.findViewById(R.id.call_type).setVisibility(View.GONE);
        }

        public void enableStatusView() {
            itemView.findViewById(R.id.time).setVisibility(View.GONE);
            itemView.findViewById(R.id.new_msg_badge).setVisibility(View.GONE);
            itemView.findViewById(R.id.msg_read_status).setVisibility(View.GONE);
            itemView.findViewById(R.id.call_type).setVisibility(View.GONE);
        }

        public void enableCallView() {
            itemView.findViewById(R.id.time).setVisibility(View.GONE);
            itemView.findViewById(R.id.new_msg_badge).setVisibility(View.GONE);
        }
    }
}
