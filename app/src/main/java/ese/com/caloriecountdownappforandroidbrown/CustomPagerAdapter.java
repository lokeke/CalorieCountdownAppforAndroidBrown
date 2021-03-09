package ese.com.caloriecountdownappforandroidbrown;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<File> fileList;
    private LayoutInflater inflater;

    // constructor
    public CustomPagerAdapter(Context activity,
                                  List<File> imagePaths) {
        this.mContext = activity;
        this.fileList = imagePaths;
    }

    @Override
    public int getCount() {
        return this.fileList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //TouchImageView imgDisplay;
        TouchImageViewWithDoubleTap imgDisplay;
        ImageView imgDisplaySimple;
        inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.layout_fullscreen_image, container,
                false);

        //imgDisplay = (TouchImageView) viewLayout.findViewById(R.id.imgDisplay);
        imgDisplay = (TouchImageViewWithDoubleTap) viewLayout.findViewById(R.id.imgDisplay);
        imgDisplaySimple = (ImageView) viewLayout.findViewById(R.id.imgDisplaySimple);

        String filePath = fileList.get(position).getPath();
        Bitmap bitmap = BitmapFactory.decodeFile(filePath);
        imgDisplay.setImageBitmap(bitmap);
        imgDisplaySimple.setImageBitmap(bitmap);

        ((ViewPager) container).addView(viewLayout);

        imgDisplaySimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "UNDER DEVELOPEMENT", Toast.LENGTH_SHORT).show();
            }
        });

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}