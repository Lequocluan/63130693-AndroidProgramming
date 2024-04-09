package luan.lq.usingrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItemp= cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItemp);
        return holderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
            //lấy đói tượng để hiển thị
        LandScape landScapeHienThi = listData.get(position);
        //trích thông tin
        String caption = landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        //đặt vào các trường thông tin của holder
        holder.tvCaption.setText(caption);

        //đặt ảnh

            String packageName = holder.itemView.getContext().getPackageName();
            int imgID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
        holder.ivLandScape.setImageResource(imgID);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandScape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);
        }
    }
}
