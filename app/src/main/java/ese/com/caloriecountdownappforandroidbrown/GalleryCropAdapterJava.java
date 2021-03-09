package ese.com.caloriecountdownappforandroidbrown;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GalleryCropAdapterJava extends RecyclerView.Adapter<GalleryCropAdapterJava.MyViewHolder>{
    private ArrayList<Uri> galleryImageList;
    private AppCompatActivity mContext;
    private int oldPosition;
    private OnClickImageListener onClickImageListener;
    private int selectedPosition;

    public interface OnClickImageListener {
        void onClickImage(int i);
    }

    public GalleryCropAdapterJava(AppCompatActivity mContext, ArrayList<Uri> galleryImageList, int selectedPosition, OnClickImageListener onClickImageListener) {
        this.galleryImageList = galleryImageList;
        this.mContext = mContext;
        this.selectedPosition = selectedPosition;
        this.onClickImageListener = onClickImageListener;
    }

    @NonNull
    @Override
    public GalleryCropAdapterJava.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_crop_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryCropAdapterJava.MyViewHolder holder, int position) {
        Glide.with(mContext)
                .load(galleryImageList.get(position))
                .into(holder.ivImage);
        if (position == this.selectedPosition) {
            holder.ivImage.setPadding(6, 6, 6, 6);
            holder.ivImage.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorPrimary));
            return;
        }
        holder.ivImage.setPadding(0, 0, 0, 0);
    }

    @Override
    public int getItemCount() {
        return galleryImageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_image)
        ImageView ivImage;

        MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }

        @OnClick(R.id.iv_image)
        public void onClick(){
            onClickImageListener.onClickImage(getLayoutPosition());
        }
    }

    public int setCurrentItem(int selectedPos) {
        oldPosition = this.selectedPosition;
        selectedPosition = selectedPos;
        notifyItemChanged(selectedPosition);
        notifyItemChanged(oldPosition);
        return selectedPosition;
    }

}