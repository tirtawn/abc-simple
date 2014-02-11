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
    
    int a, b, c, d, e, f, g, h, i, j, k, l, m;
    int n, o, p, q, r, s, t, u, v, w, x, y, z;
    
    private int currentImage;
    private int currentSound;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	
        super.onCreate(savedInstanceState);
		
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);

        loadSoundFiles();
		
        currentSound = a;
        currentImage = R.drawable.splash;
        runGame();  

    } 

    
    private void runGame(){

        final ImageView imageView = (ImageView)findViewById(R.id.main_image_id);

        imageView.setOnClickListener(new OnClickListener() {
        
            public void onClick(View v) {

        	    setFiles();
   
                Drawable image;      
                image = getResources().getDrawable( currentImage );
                imageView.setImageDrawable(image);

                soundPool.play(currentSound, 1, 1, 0, 0, 1);

            }
                	
        }); // end setOnClickListener

    } // end runGame

    private void setFiles(){

        switch (currentImage){
        case R.drawable.splash:  
            currentImage = R.drawable.a;
            currentSound = a;
            break;
        case R.drawable.a:  
            currentImage = R.drawable.b;
            currentSound = b;
            break;
        case R.drawable.b:  
            currentImage = R.drawable.c;
            currentSound = c;
            break;
        case R.drawable.c:  
            currentImage = R.drawable.d;
            currentSound = d;
            break;
        case R.drawable.d:  
            currentImage = R.drawable.e;
            currentSound = e;
            break;
        case R.drawable.e:  
            currentImage = R.drawable.f;
            currentSound = f;
            break;
        case R.drawable.f:  
            currentImage = R.drawable.g;
            currentSound = g;
            break;
        case R.drawable.g:  
            currentImage = R.drawable.h;
            currentSound = h;
            break;
        case R.drawable.h:  
            currentImage = R.drawable.i;
            currentSound = i;
            break;
        case R.drawable.i:
            currentImage = R.drawable.j;
            currentSound = j;
            break;
        case R.drawable.j:
            currentImage = R.drawable.k;
            currentSound = k;
            break;
        case R.drawable.k:
            currentImage = R.drawable.l;
            currentSound = l;
            break;
        case R.drawable.l:
            currentImage = R.drawable.m;
            currentSound = m;
            break;
        case R.drawable.m:
            currentImage = R.drawable.n;
            currentSound = n;
            break;
        case R.drawable.n:
            currentImage = R.drawable.o;
            currentSound = o;
            break;
        case R.drawable.o:
            currentImage = R.drawable.p;
            currentSound = p;
            break;
        case R.drawable.p:
            currentImage = R.drawable.q;
            currentSound = q;
            break;
        case R.drawable.q:
            currentImage = R.drawable.r;
            currentSound = r;
            break;
        case R.drawable.r:
            currentImage = R.drawable.s;
            currentSound = s;
            break;
        case R.drawable.s:
            currentImage = R.drawable.t;
            currentSound = t;
            break;
        case R.drawable.t:
            currentImage = R.drawable.u;
            currentSound = u;
            break;
        case R.drawable.u:
            currentImage = R.drawable.v;
            currentSound = v;
            break;
        case R.drawable.v: 
            currentImage = R.drawable.w;
            currentSound = w;
            break;
        case R.drawable.w:
            currentImage = R.drawable.x;
            currentSound = x;
            break;
        case R.drawable.x:
            currentImage = R.drawable.y;
            currentSound = y;
            break;
        case R.drawable.y:
            currentImage = R.drawable.z;
            currentSound = z;
            break;
        case R.drawable.z:
            currentImage = R.drawable.a;
            currentSound = a;
            break;
        default:
            break;    
            
       } // end switch

    }
    
    //TODO:  Put this in a loop or a hash or something
    private void loadSoundFiles(){
        try{
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor = assetManager.openFd("DoYouKnowWhatSharksDo.ogg");
            a = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            b = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            c = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            d = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            e = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            f = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            g = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            h = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            i = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            j = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            k = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            l = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            m = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            n = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            o = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            p = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            q = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            r = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            s = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            t = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            u = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            v = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            w = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            x = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("YouTasteGooood.ogg");
            y = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("WeEatChu.ogg");
            z = soundPool.load(descriptor, 1);
            
        } 
        catch(IOException e) {
            Log.d("loadSoundFiles Exception:", e.getMessage());
        }
    }

} // end class