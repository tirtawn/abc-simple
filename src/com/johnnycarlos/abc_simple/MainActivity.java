package com.johnnycarlos.abc_simple;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        ImageView imageView = (ImageView)findViewById(R.id.main_image_id);
	
        Drawable nextImage;      
        nextImage = getResources().getDrawable(R.drawable.b);
        imageView.setImageDrawable(nextImage);
        
        imageView.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Log.d("logging", "Inside Listener!");
            }
        });
        
  
        
		// follow up with peekaboo
		
		// need add another image otherwise i don't know if it is just
		// coming from the layout/activity_main.xml
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void imageClicked(View view) {  
		 Log.d("logging", "Letter A was clicked!");
    } 
	
}
