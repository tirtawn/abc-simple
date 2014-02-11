package com.johnnycarlos.abc_simple;

import java.io.IOException;

import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
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
    
    int a = -1;
    int b = -1;
    int c = -1;
	private int currentImage = R.drawable.splash;
    private int currentSound;
	SoundPool soundPool;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
	    super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

		soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
		
		loadSoundFiles();
				
        currentSound = a;
        
		runGame();
		
	}

	
    private void runGame(){

        final ImageView imageView = (ImageView)findViewById(R.id.main_image_id);

        imageView.setOnClickListener(new OnClickListener() {
        
        	public void onClick(View v) {

        	    setFiles();
        	    
                if(currentSound != -1){
                    soundPool.play(currentSound, 1, 1, 0, 0, 1);
                }
                           	
                Drawable image;      
                image = getResources().getDrawable( currentImage );
                imageView.setImageDrawable(image);
                
        	}
                	
        }); // end setOnClickListener

    } // end runGame

    private void setFiles(){

        switch (currentImage){
        case R.drawable.splash:  
            currentImage = R.drawable.a;
            currentSound  = a;
            break;
        case R.drawable.a:  
            currentImage = R.drawable.b;
            currentSound  = b;
            break;
        case R.drawable.b:  
            currentImage = R.drawable.c;
            currentSound  = c;
            break;
        case R.drawable.c:  
            currentImage = R.drawable.a;
            currentSound  = a;
            break;
        default:
            break;    
            
       } // end switch

    }
    
    private void loadSoundFiles(){
        try{
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor = assetManager.openFd("DoYouKnowWhatSharksDo.ogg");
            a = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            b = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            c = soundPool.load(descriptor, 1);
            
        } catch(IOException e) {
            Log.d("Sound Pool", e.getMessage());
        }

    }

} // end class