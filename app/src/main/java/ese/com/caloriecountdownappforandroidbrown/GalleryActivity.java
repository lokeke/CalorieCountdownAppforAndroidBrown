package ese.com.caloriecountdownappforandroidbrown;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.theartofdev.edmodo.cropper.CropImage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    public int GALLERY_INTENT = 2222;
    int REQUEST_CAMERAINTENT = 501;

    FloatingActionButton fab_add_image;
    RecyclerView recycler_view_all_images;
    TextView txt_no_data;
    TextView delete_all;

    public List<File> fileList = new ArrayList<>();

    GalleryRecyclerAdapter galleryRecyclerAdapter;
    File myImageDir;
    int GALLERY_CROP_INTENT = 2225;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        fab_add_image = findViewById(R.id.fab_add_image);
        recycler_view_all_images = findViewById(R.id.recycler_view_all_images);
        txt_no_data = findViewById(R.id.txt_no_data);
        delete_all = findViewById(R.id.delete_all);

        myImageDir = getDir("Images", Context.MODE_PRIVATE);
        if (!myImageDir.exists()) {
            myImageDir.mkdirs();
        }
        if (fileList.size() != 0) {
            fileList.clear();
        }

        File[] allFiles = myImageDir.listFiles();

        fab_add_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select();
            }
        });

        for (int i = 0; i < allFiles.length; i++) {
            fileList.add(allFiles[i]);
        }

        recycler_view_all_images.setLayoutManager(new GridLayoutManager(GalleryActivity.this, 3));

        galleryRecyclerAdapter = new GalleryRecyclerAdapter(this, fileList);
        recycler_view_all_images.setAdapter(galleryRecyclerAdapter);

        if (fileList.size() != 0) {
            recycler_view_all_images.setVisibility(View.VISIBLE);
            txt_no_data.setVisibility(View.GONE);
            delete_all.setVisibility(View.VISIBLE);
        } else {
            recycler_view_all_images.setVisibility(View.GONE);
            txt_no_data.setVisibility(View.VISIBLE);
            delete_all.setVisibility(View.GONE);
        }

        delete_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialogToRemoveAll();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void pickImageFromGallery() {
//Intent to pick image
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, GALLERY_INTENT);
    }

    private Uri mImageUri = null;

    private void pickImageFromCamera() {
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE, "New Picture");
        values.put(MediaStore.Images.Media.DESCRIPTION, "From Camera");
        //Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        mImageUri = getContentResolver().insert(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                values
        );
        camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, mImageUri);
        startActivityForResult(camera_intent, REQUEST_CAMERAINTENT);
    }


 /*   @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {

            case 501:
                if (resultCode == RESULT_OK) {
                    Bitmap bitmap = null;
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), mImageUri);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String imageFileName = getImageName();
                    File mypath = new File(myImageDir, imageFileName);

                    FileOutputStream fos = null;
                    try {
                        fos = new FileOutputStream(mypath);
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
                        fos.close();
                    } catch (Exception e) {
                        Log.e("SAVE_IMAGE", e.getMessage(), e);
                    }

                    fileList.add(mypath);
                    refreshData();

                    File file = new File(getRealPathFromURI(mImageUri));
                    file.delete();
                    MediaScannerConnection.scanFile(this, new String[]{String.valueOf(file)}, null, null);

                }


                break;
            case 2222:
                if (data != null) {
                    if (data.getClipData() != null) {
                        int count = data.getClipData().getItemCount(); //evaluate the count before the for loop --- otherwise, the count is evaluated every loop.
                        for (int i = 0; i < count; i++) {
                            Uri finalImageUri = data.getClipData().getItemAt(i).getUri();
                            try {
                                if (finalImageUri != null) {
                                    String imageFileName = getImageName();
                                    File mypaths = createFile(finalImageUri, imageFileName);
                                    fileList.add(mypaths);
                                    refreshData();
                                }
                            } catch (Exception e) {
                                //handle exception
                            }

                        }
                    } else if (data.getData() != null) {
                        Uri finalImageUri = data.getData();
                        try {
                            if (finalImageUri != null) {
                                String imageFileName = getImageName();
                                File mypaths = createFile(finalImageUri, imageFileName);
                                fileList.add(mypaths);
                            }
                        } catch (Exception e) {
                            //handle exception
                        }
                    }
                    refreshData();
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + requestCode);
        }

    }*/

    String from = "camera";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 501:
                if (resultCode == Activity.RESULT_OK) {
                    try {
                        from = "camera";
                        CropImage.activity(mImageUri).start(this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE:
                CropImage.ActivityResult result = CropImage.getActivityResult(data);
                if (resultCode == Activity.RESULT_OK) {
                    Uri uri = result.getUri();
                    SaveImageTask saveImageTask = new SaveImageTask();
                    saveImageTask.execute(uri);
                }
                break;
            case 2222:
                if (data != null) {
                    if (data.getClipData() != null) {
                        int count = data.getClipData().getItemCount(); //evaluate the count before the for loop --- otherwise, the count is evaluated every loop.

                        ArrayList<Uri> uriList = new ArrayList<>();
                        uriList.clear();
                        for (int i = 0; i < count; i++) {
                            Uri finalImageUri = data.getClipData().getItemAt(i).getUri();
                            uriList.add(finalImageUri);
                        }


                        Intent intent = new Intent(this, GalleryCropActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("list", uriList);
                        intent.putExtras(bundle);
                        startActivityForResult(intent, GALLERY_CROP_INTENT);
                        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

                    } else if (data.getData() != null) {
                        from = "gallery";
                        Uri finalImageUri = data.getData();
                        CropImage.activity(finalImageUri).start(this);
                    }
                    refreshData();
                }
                break;

            case 2225 :
                    if (data != null) {
                        List<Uri> imagesList = (ArrayList<Uri>)data.getSerializableExtra("list");
                        SaveMultipleImageTask saveImageTask = new SaveMultipleImageTask();
                        saveImageTask.execute(imagesList);
                    }
                    break;

        }

    }

    private String getRealPathFromURI(Uri contentUri) {
        String[] proj = {MediaStore.Images.Media.DATA};
        CursorLoader loader = new CursorLoader(this, contentUri, proj, null, null, null);
        Cursor cursor = loader.loadInBackground();
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        String result = cursor.getString(column_index);
        cursor.close();
        return result;
    }

    public void showAlertDialog(final int position) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(getResources().getString(R.string.delete_alert_message));
        builder1.setTitle(getResources().getString(R.string.delete_alert_title));
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        removeImage(position);
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }


    public void select() {
        final Dialog dialog = new Dialog(GalleryActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_photo_select);

        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.animationName;
        dialog.setCancelable(true);

        Button iv_gallery = dialog.findViewById(R.id.iv_gallery);
        Button iv_camera = dialog.findViewById(R.id.iv_camera);
        Button iv_cancel = dialog.findViewById(R.id.iv_cancel);
        iv_gallery.setVisibility(View.VISIBLE);
        dialog.show();

        iv_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImageFromCamera();
                dialog.dismiss();
            }
        });

        iv_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImageFromGallery();
                dialog.dismiss();
            }
        });

        iv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

    }


    public void showAlertDialogToRemoveAll() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(getResources().getString(R.string.delete_all_alert_message));
        builder1.setTitle(getResources().getString(R.string.delete_alert_title));
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        removeAllImage();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

    public void removeImage(int position) {

        //Toast.makeText(GalleryActivity.this, "UNDER DEVELOPEMENT", Toast.LENGTH_SHORT).show();

        File file = fileList.get(position);
        if (file.exists()) {
            file.delete();
        }

        fileList.remove(position);
        refreshData();
        MediaScannerConnection.scanFile(GalleryActivity.this, new String[]{String.valueOf(file)}, null, null);
    }

    public void removeAllImage() {
        //Toast.makeText(GalleryActivity.this, "UNDER DEVELOPEMENT", Toast.LENGTH_SHORT).show();
        for(int i = fileList.size() - 1; i >= 0; i--){
            File file = fileList.get(i);
            if (file.exists()) {
                file.delete();
            }
            fileList.remove(i);
            MediaScannerConnection.scanFile(GalleryActivity.this, new String[]{String.valueOf(file)}, null, null);
        }
        refreshData();

    }

    public void viewImageOnFullScreen(int position) {
        Intent intent = new Intent(this, FullScreenImageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }


    public String getImageName() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        String timeStamp = dateFormat.format(new Date());
        //String imageFileName = "picture_" + timeStamp + (fileList.size() + 1) + ".jpg";
        String imageFileName = "Calorie_" + (fileList.size() + 1) + ".jpg";
        return imageFileName;
    }

    public void refreshData() {
        galleryRecyclerAdapter.notifyDataSetChanged();
        if (fileList.size() != 0) {
            recycler_view_all_images.setVisibility(View.VISIBLE);
            txt_no_data.setVisibility(View.GONE);
            delete_all.setVisibility(View.VISIBLE);
        } else {
            recycler_view_all_images.setVisibility(View.GONE);
            txt_no_data.setVisibility(View.VISIBLE);
            delete_all.setVisibility(View.GONE);
        }
    }


    public File createFile(Uri finalImageUri, String imageFileName) {
        File mypaths = null;
        try {
            Bitmap finalbitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), finalImageUri);
            mypaths = new File(myImageDir, imageFileName);

            FileOutputStream foss = null;
            foss = new FileOutputStream(mypaths);
            finalbitmap.compress(Bitmap.CompressFormat.JPEG, 100, foss);
            foss.close();
        } catch (Exception e) {
            Log.e("SAVE_IMAGE", e.getMessage(), e);
        }
        return mypaths;
    }


    ProgressDialog progressDialog;

    private class SaveImageTask extends AsyncTask<Uri, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(GalleryActivity.this);

            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Uri... data) {
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data[0]);
                String imageFileName = getImageName();
                File mypath = new File(myImageDir, imageFileName);

                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(mypath);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                    fos.close();
                } catch (Exception e) {
                    Log.e("SAVE_IMAGE", e.getMessage(), e);
                }

                fileList.add(mypath);

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {

                        refreshData();
                        if (from.equalsIgnoreCase("camera")) {
                            File file = new File(getRealPathFromURI(mImageUri));
                            file.delete();
                            //deleteLatest();
                            MediaScannerConnection.scanFile(GalleryActivity.this, new String[]{String.valueOf(file)}, null, null);
                        }

                    }
                });


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
    }


    private class SaveMultipleImageTask extends AsyncTask<List<Uri>, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(GalleryActivity.this);

            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(List<Uri>... data) {
            Bitmap bitmap = null;
            List<Uri> list = data[0];
            try {
                for (int i = 0; i < list.size(); i++) {
                    Uri uri = list.get(i);


                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                    String imageFileName = getImageName();
                    File mypath = new File(myImageDir, imageFileName);

                    FileOutputStream fos = null;
                    try {
                        fos = new FileOutputStream(mypath);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                        fos.close();
                    } catch (Exception e) {
                        Log.e("SAVE_IMAGE", e.getMessage(), e);
                    }

                    fileList.add(mypath);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            refreshData();
                        }
                    });
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
    }

    private void deleteLatest() {
        File f = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera");

        File[] files = f.listFiles();
        Arrays.sort(files, new Comparator< Object >() {
            public int compare(Object o1, Object o2) {

                if (((File) o1).lastModified() > ((File) o2).lastModified()) {
                    return -1;
                } else if (((File) o1).lastModified() < ((File) o2).lastModified()) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
        files[0].delete();
        MediaScannerConnection.scanFile(GalleryActivity.this, new String[]{String.valueOf(files[0])}, null, null);

    }

}