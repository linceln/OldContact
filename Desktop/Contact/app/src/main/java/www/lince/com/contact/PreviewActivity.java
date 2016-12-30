package www.lince.com.contact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        String uri = getIntent().getStringExtra("uri");
        ImageView iv = (ImageView) findViewById(R.id.iv);
        Glide.with(this)
                .load(uri)
                .placeholder(R.mipmap.head)
                .into(iv);
    }
}
