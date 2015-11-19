package com.example.clase10;


import com.example.clase10.R;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		reproducirVideo();
	}
	
	private void reproducirVideo(){		
		
		VideoView video = (VideoView) findViewById(R.id.videoView1);				
		Uri uri = Uri.parse("android.resource://com.example.clase10/"+R.raw.video1);				
		MediaController mc = new MediaController(this);			
		video.setMediaController(mc);		
		video.setVideoURI(uri);		
		video.start();	
		
	}


}
