package com.johnnycarlos.abc_simple;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private alphabet currentLetter = alphabet.A;
	private enum alphabet { A, B, C }
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		runGame();
		
	}

    private void runGame(){

    	// Load image for letter A
        final ImageView imageView = (ImageView)findViewById(R.id.main_image_id);

        // Set a listener and change to letter B when clicked
        imageView.setOnClickListener(new OnClickListener() {
        
        	public void onClick(View v) {
        		
        		int currentLetterImage = R.drawable.a;
        		
        		switch (currentLetter){
  				    case A:  
  				        currentLetter = alphabet.B;
  				        currentLetterImage = R.drawable.b;
				    	break;
				    case B:  
				        currentLetter = alphabet.A;
				        currentLetterImage = R.drawable.a;
			    		break;
				    case C:
					    break;
				    default:
					    break;        		        		
        		}
        		
            	Log.d("logging", "Inside runGame Listener!");
                Drawable nextImage;      
                nextImage = getResources().getDrawable( currentLetterImage );
                imageView.setImageDrawable(nextImage);
            
        	}
        
        }); // end setOnClickListener
        
    } // end runGame

} // end class