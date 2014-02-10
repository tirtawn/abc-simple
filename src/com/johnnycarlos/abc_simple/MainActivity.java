package com.johnnycarlos.abc_simple;

import java.io.IOException;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private int currentLetter = R.drawable.a;
	
	SoundPool soundPool;
    int soundA = -1;
    int soundB = -1;
    int soundC = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
        
		
		try{
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor = assetManager.openFd("DoYouKnowWhatSharksDo.ogg");
            soundA = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            soundB = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            soundC = soundPool.load(descriptor, 1);
            
        } catch(IOException e) {
            Log.d("Shark", e.getMessage());
            //textView.setText("Could not load sound file from asset, " + e.getMessage());
        }
		
		
		runGame();
		
	}

    private void runGame(){

    	// Load image for letter A
        final ImageView imageView = (ImageView)findViewById(R.id.main_image_id);

        // Set a listener and change to letter B when clicked
        imageView.setOnClickListener(new OnClickListener() {
        
        	public void onClick(View v) {
        		        		
        		switch (currentLetter){
  				    case R.drawable.a:  
  				        currentLetter = R.drawable.b;
  		                if(soundA != -1){
  	                        soundPool.play(soundA, 1, 1, 0, 0, 1);
  	                    }
				    	break;
				    case R.drawable.b:  
				        currentLetter = R.drawable.c;
			    		break;
				    case R.drawable.c:  
                        currentLetter = R.drawable.a;
					    break;
				    default:
					    break;        		        		
        		}
        		
            	Log.d("logging", "Inside runGame Listener!");
                Drawable nextImage;      
                nextImage = getResources().getDrawable( currentLetter );
                imageView.setImageDrawable(nextImage);
            
        	}
        
        }); // end setOnClickListener
        
    } // end runGame

} // end class