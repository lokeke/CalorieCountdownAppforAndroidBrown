package ese.com.caloriecountdownappforandroidbrown;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FullScreenImageActivity extends AppCompatActivity {


    public TextView app_bar_layout;
    public List<File> fileList = new ArrayList<>();
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        app_bar_layout = findViewById(R.id.app_bar_layout);
        iv_back = findViewById(R.id.iv_back);
        final int position = getIntent().getIntExtra("position", 0);

        File myImageDir = getDir("Images", Context.MODE_PRIVATE);
        File[] allFiles = myImageDir.listFiles();


        for (int i = 0; i < allFiles.length; i++) {
            fileList.add(allFiles[i]);
        }


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this, fileList));
        viewPager.setCurrentItem(position);
        app_bar_layout.setText(fileList.get(position).getName());

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                app_bar_layout.setText(fileList.get(position).getName());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}