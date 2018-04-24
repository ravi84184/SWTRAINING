package com.nikpatel.digitalgrow.PickImageGallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nikpatel.digitalgrow.R;

public class GalleryMainActivity extends AppCompatActivity {

    private static final String TAG = "GalleryMainActivity";
    private static final int OPEN_GALLERY_REQUEST = 1;

    Toolbar toolbar;
    Button btnGallery;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnGallery = (Button) findViewById(R.id.btnOpen);
        imageView = (ImageView) findViewById(R.id.imgView);

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Select Image"),OPEN_GALLERY_REQUEST);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == OPEN_GALLERY_REQUEST && resultCode==RESULT_OK && data != null && data.getData() != null){

            Uri uri = data.getData();

            try {
                Bitmap bitmap =  MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                Log.e(TAG, "onActivityResult: "+bitmap );
                imageView.setImageBitmap(bitmap);
            }catch (Exception e){
                Log.e(TAG, "onActivityResult: Exception:- " + e.getMessage() );
            }


        }
    }
}
