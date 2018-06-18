package com.johnnycarlos.abc_simple;

import java.io.IOException;
import com.johnnycarlos.abc_simple.R;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends Activity implements 
    GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener,
    MediaPlayer.OnPreparedListener {

    private static final String DEBUG_TAG = "Gestures";
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    
    private GestureDetectorCompat mDetector; 
    
    private SoundImage soundImage;

    private SoundPool soundPool;
    
    private ImageView imageView;
    
    private SoundImage[] soundImages;
    
    private int index = -1; 
    
    MediaPlayer mediaPlayer = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        loadBackgroundMusic();
        
        loadSoundImages();
        
        imageView = (ImageView)findViewById(R.id.main_image_id);
        
        mDetector = new GestureDetectorCompat(this,this);

        mDetector.setOnDoubleTapListener(this);
        
    }

    @Override
    protected void onResume() {
        super.onResume();        
        mediaPlayer.start();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onDestroy() {
        super.onStop();
        mediaPlayer.release();
        mediaPlayer = null;
    }
   
    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mediaPlayer.start();   
    }
    
    private void loadBackgroundMusic(){

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        
        try {
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://com.johnnycarlos.abc_simple/" +
                                                       R.raw.background_music));
        } catch (IOException e) {
            Log.d("MediaPlayer Exception:", e.toString());
        }
        
        mediaPlayer.setLooping(false);
        mediaPlayer.setVolume((float).3, (float).3);
        mediaPlayer.prepareAsync();
    }


    /**
     * This method loads all the sound files into global integers(a,b,c, etc) that represent
     * their location in the soundPool.
     */
    private void loadSoundImages(){
        try{
            
            soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
            
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor;
            
            descriptor = assetManager.openFd("a.ogg");
            SoundImage a = new SoundImage( soundPool.load(descriptor, 1), R.drawable.a);


            descriptor = assetManager.openFd("b.ogg");
            SoundImage b = new SoundImage( soundPool.load(descriptor, 1), R.drawable.b);

            descriptor = assetManager.openFd("c.ogg");
            SoundImage c = new SoundImage( soundPool.load(descriptor, 1), R.drawable.c);

            
            descriptor = assetManager.openFd("d.ogg");
            SoundImage d = new SoundImage( soundPool.load(descriptor, 1), R.drawable.d);


            descriptor = assetManager.openFd("e.ogg");
            SoundImage e = new SoundImage( soundPool.load(descriptor, 1), R.drawable.e);

            
            descriptor = assetManager.openFd("f.ogg");
            SoundImage f = new SoundImage( soundPool.load(descriptor, 1), R.drawable.f);


            descriptor = assetManager.openFd("g.ogg");
            SoundImage g = new SoundImage( soundPool.load(descriptor, 1), R.drawable.g);

            
            descriptor = assetManager.openFd("h.ogg");
            SoundImage h = new SoundImage( soundPool.load(descriptor, 1), R.drawable.h);


            descriptor = assetManager.openFd("i.ogg");
            SoundImage i = new SoundImage( soundPool.load(descriptor, 1), R.drawable.i);

            
            descriptor = assetManager.openFd("j.ogg");
            SoundImage j = new SoundImage( soundPool.load(descriptor, 1), R.drawable.j);


            descriptor = assetManager.openFd("k.ogg");
            SoundImage k = new SoundImage( soundPool.load(descriptor, 1), R.drawable.k);

            
            descriptor = assetManager.openFd("l.ogg");
            SoundImage l = new SoundImage( soundPool.load(descriptor, 1), R.drawable.l);


            descriptor = assetManager.openFd("m.ogg");
            SoundImage m = new SoundImage( soundPool.load(descriptor, 1), R.drawable.m);

            
            descriptor = assetManager.openFd("n.ogg");
            SoundImage n = new SoundImage( soundPool.load(descriptor, 1), R.drawable.n);


            descriptor = assetManager.openFd("o.ogg");
            SoundImage o = new SoundImage( soundPool.load(descriptor, 1), R.drawable.o);

            
            descriptor = assetManager.openFd("p.ogg");
            SoundImage p = new SoundImage( soundPool.load(descriptor, 1), R.drawable.p);


            descriptor = assetManager.openFd("q.ogg");
            SoundImage q = new SoundImage( soundPool.load(descriptor, 1), R.drawable.q);

            
            descriptor = assetManager.openFd("r.ogg");
            SoundImage r = new SoundImage( soundPool.load(descriptor, 1), R.drawable.r);


            descriptor = assetManager.openFd("s.ogg");
            SoundImage s = new SoundImage( soundPool.load(descriptor, 1), R.drawable.s);

            
            descriptor = assetManager.openFd("t.ogg");
            SoundImage t = new SoundImage( soundPool.load(descriptor, 1), R.drawable.t);


            descriptor = assetManager.openFd("u.ogg");
            SoundImage u = new SoundImage( soundPool.load(descriptor, 1), R.drawable.u);

            
            descriptor = assetManager.openFd("v.ogg");
            SoundImage v = new SoundImage( soundPool.load(descriptor, 1), R.drawable.v);


            descriptor = assetManager.openFd("w.ogg");
            SoundImage w = new SoundImage( soundPool.load(descriptor, 1), R.drawable.w);

            
            descriptor = assetManager.openFd("x.ogg");
            SoundImage x = new SoundImage( soundPool.load(descriptor, 1), R.drawable.x);


            descriptor = assetManager.openFd("y.ogg");
            SoundImage y = new SoundImage( soundPool.load(descriptor, 1), R.drawable.y);

            
            descriptor = assetManager.openFd("z.ogg");
            SoundImage z = new SoundImage( soundPool.load(descriptor, 1), R.drawable.z);

            soundImages = new SoundImage[]{ a, b, c, d, e, f, g, h, i, j, k, l, m,
                                            n, o, p, q, r, s, t, u, v, w, x, y, z };
        } 
        catch(Exception e) {
           Log.d("loadSoundFiles Exception:", e.toString());
        }
    }
    
    
    @Override 
    public boolean onTouchEvent(MotionEvent event){ 
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) { 
        Log.d(DEBUG_TAG,"onDown: " + event.toString()); 
        return true;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, 
    float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + e1.toString()+e2.toString());
        if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE &&
                Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            //From Right to Left
            playNextLetter();
            return true;
        }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE &&
                Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            //From Left to Right
            playPreviousLetter();
            return true;
        }
  
        if(e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE &&
               Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
            //From Bottom to Top
            playNextLetter();
            return true;
        }  else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE &&
               Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
            //From Top to Bottom
            playPreviousLetter();
            return true;
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent event) {
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
             float distanceY) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {     
        return true;
    }
 

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        
        playPreviousLetter();
                
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {      
        return true;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        
        playNextLetter();
        
        return true;
    }
    
    public void playPreviousLetter(){
        
        index--;
        if( index < 0){
            index = 25;
        }
        soundImage = soundImages[index];
        
        // Draw the current letter
        Drawable image = getResources().getDrawable( soundImage.imageNumber );
        imageView.setImageDrawable(image);

        // Play the current sound
        soundPool.play(soundImage.poolNumber, 1, 1, 0, 0, 1);
    }
    
    public void playNextLetter(){
        
        index++;
        if( index == 26){
            index = 0;
        }
        soundImage = soundImages[index];
        
        // Draw the current letter
        Drawable image = getResources().getDrawable( soundImage.imageNumber );
        imageView.setImageDrawable(image);

        // Play the current sound
        soundPool.play(soundImage.poolNumber, 1, 1, 0, 0, 1);
 
    }
    
} // end class

