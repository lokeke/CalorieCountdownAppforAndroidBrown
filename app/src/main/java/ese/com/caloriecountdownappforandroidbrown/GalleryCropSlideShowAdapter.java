package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryCropSlideShowAdapter extends PagerAdapter {
    private Context context;
    private String dataCheck;
    private ArrayList<Uri> images;
    private LayoutInflater inflater;

    public GalleryCropSlideShowAdapter(Context context, ArrayList<Uri> images) {
        this.context = context;
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public int getCount() {
        return this.images.size();
    }

    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.item_crop_gallery, view, false);

        ImageView ivImage = imageLayout.findViewById(R.id.iv_image);
        Glide.with(context).load(images.get(position)).into(ivImage);
        view.addView(imageLayout);
        return imageLayout;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    public Parcelable saveState() {
        return null;
    }
}