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
    
    private int a, b, c, d, e, f, g, h, i, j, k, l, m;
    private int n, o, p, q, r, s, t, u, v, w, x, y, z;
    
    private int currentImage;
    private int currentSound;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	
        super.onCreate(savedInstanceState);
		
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);

        loadSoundFiles();
		
        currentImage = R.drawable.splash;  // splash screen
        
        currentSound = a;
        
        runGame();  

    } 

    /**
     * This is the main game method.  It loads the first graphic, registers a click listener
     * that displays the next letter and plays the corresponding sound file.
     */
    private void runGame(){

        final ImageView imageView = (ImageView)findViewById(R.id.main_image_id);

        imageView.setOnClickListener(new OnClickListener() {
        
            public void onClick(View v) {

                setImageAndSoundFiles(); 
                
                // Draw the current letter
                Drawable image = getResources().getDrawable( currentImage );
                imageView.setImageDrawable(image);

                // Play the current sound
                soundPool.play(currentSound, 1, 1, 0, 0, 1);
            }
                	
        }); // end setOnClickListener

    } // end runGame
    
    /**
     * This method sets the sound and graphic files.
     * It looks at the global variables currentImage and currentSound, and
     * sets them to the next letter in the alphabet.
     */
    private void setImageAndSoundFiles(){

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
    /**
     * This method loads all the sound files into global integers(a,b,c, etc) that represent
     * their location in the soundPool.
     */
    private void loadSoundFiles(){
        try{
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor = assetManager.openFd("a.ogg");
            a = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("b.ogg");
            b = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("c.ogg");
            c = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("d.ogg");
            d = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("e.ogg");
            e = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("f.ogg");
            f = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("g.ogg");
            g = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("h.ogg");
            h = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("i.ogg");
            i = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("j.ogg");
            j = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("k.ogg");
            k = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("l.ogg");
            l = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("m.ogg");
            m = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("n.ogg");
            n = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("o.ogg");
            o = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("p.ogg");
            p = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("q.ogg");
            q = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("r.ogg");
            r = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("s.ogg");
            s = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("t.ogg");
            t = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("u.ogg");
            u = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("v.ogg");
            v = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("w.ogg");
            w = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("x.ogg");
            x = soundPool.load(descriptor, 1);

            descriptor = assetManager.openFd("y.ogg");
            y = soundPool.load(descriptor, 1);
            
            descriptor = assetManager.openFd("z.ogg");
            z = soundPool.load(descriptor, 1);
            
        } 
        catch(IOException e) {
           Log.d("loadSoundFiles Exception:", e.toString());
        }
    }

} // end class