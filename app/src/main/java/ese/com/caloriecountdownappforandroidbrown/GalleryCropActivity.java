package ese.com.caloriecountdownappforandroidbrown;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;

import com.theartofdev.edmodo.cropper.CropImage;

import java.util.ArrayList;
import java.util.List;

public class GalleryCropActivity extends AppCompatActivity {

    private GalleryCropAdapterJava galleryCropAdapter;
    private ArrayList<Uri> galleryImageList = new ArrayList<Uri>();

    ImageView iv_back;
    ImageView iv_crop;
    RecyclerView rv_images;
    ImageView iv_done;
    ViewPager pager;

    private int selectedPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_crop);

        iv_back = findViewById(R.id.iv_back);
        iv_crop = findViewById(R.id.iv_crop);
        iv_done = findViewById(R.id.iv_done);
        rv_images = findViewById(R.id.rv_images);
        pager = findViewById(R.id.pager);

        galleryImageList = (ArrayList<Uri>) getIntent().getExtras().get("list");

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_right_out, R.anim.slide_right_in);
            }
        });

        iv_crop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CropImage.activity(galleryImageList.get(selectedPosition)).start(GalleryCropActivity.this);

            }
        });

        iv_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("list", galleryImageList);
                setResult(787, intent);
                finish();
                overridePendingTransition(R.anim.slide_right_out, R.anim.slide_right_in);
            }
        });

    }


    @Override
    public void onResume() {
        super.onResume();
        setViewPager();
        setRecyclerViewAdapter();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    GalleryCropSlideShowAdapter galleryCropSlideShowAdapter;

    private void setViewPager() {
        galleryCropSlideShowAdapter = new GalleryCropSlideShowAdapter(this, galleryImageList);
        pager.setAdapter(galleryCropSlideShowAdapter);

        pager.setCurrentItem(selectedPosition);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                selectedPosition = position;
                galleryCropAdapter.setCurrentItem(selectedPosition);
            }

            @Override
            public void onPageSelected(int position) {
                rv_images.smoothScrollToPosition(selectedPosition);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void setRecyclerViewAdapter() {


        galleryCropAdapter = new GalleryCropAdapterJava(this, galleryImageList, selectedPosition, new GalleryCropAdapterJava.OnClickImageListener() {
            @Override
            public void onClickImage(int position) {
                selectedPosition = position;
                pager.setCurrentItem(selectedPosition);
            }
        });

        rv_images.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_images.setLayoutManager(llm);
        rv_images.setAdapter(galleryCropAdapter);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE:
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == -1) {
                Uri resultUri = result.getUri();
                //galleryImageList.remove(this.selectedPosition);
                galleryImageList.set(this.selectedPosition, resultUri);
            }
            break;
        }

    }
}