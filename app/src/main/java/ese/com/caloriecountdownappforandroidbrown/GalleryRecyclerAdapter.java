package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.BitmapRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class GalleryRecyclerAdapter extends RecyclerView.Adapter<GalleryRecyclerAdapter.MyViewHolder> {


    Context context;

    List<File> fileList = new ArrayList<>();

    public GalleryRecyclerAdapter(Context context, List<File> uriList) {
        this.context = context;
        this.fileList = uriList;
    }

    @NonNull
    @Override
    public GalleryRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallery_item, parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryRecyclerAdapter.MyViewHolder holder, final int position) {
        Glide.with(context)
                .load(fileList.get(position)) // Uri of the picture
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(holder.image);
       // holder.image.setImageBitmap(bitmapList.get(position));

        holder.iv_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GalleryActivity) context).showAlertDialog(position);
            }
        });

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GalleryActivity) context).viewImageOnFullScreen(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        ImageView iv_cross;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            iv_cross = itemView.findViewById(R.id.iv_cross);
        }
    }

}
