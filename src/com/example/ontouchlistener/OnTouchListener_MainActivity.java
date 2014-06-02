package com.example.ontouchlistener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;



public class OnTouchListener_MainActivity extends Activity implements OnTouchListener {

	TextView txtViewTocame;
	TextView textVie;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_on_touch_listener__main);
		
		
		txtViewTocame = (TextView) findViewById(R.id.txtViewTocame);
		txtViewTocame.setOnTouchListener(this);
		
		textVie= (TextView) findViewById(R.id.text);		
		textVie.setOnTouchListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.on_touch_listener__main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		textVie.setText("texto: x:"+txtViewTocame.getX()+" y:"+txtViewTocame.getY()+" Evento: x:"+event.getX()+" y: "+event.getY());
		// TODO Auto-generated method stub

		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			txtViewTocame.setText("Deja de tocarme!!");
		}
		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			txtViewTocame.setX(event.getX());
			txtViewTocame.setY(event.getY());
			txtViewTocame.setText("Dejame Quieto!!!");
			textVie.setText("texto: x:"+txtViewTocame.getX()+" y:"+txtViewTocame.getY()+" Evento: x:"+event.getX()+" y: "+event.getY());
			
		}
		if (event.getAction() == MotionEvent.ACTION_UP) {
			txtViewTocame.setText("Uff porfin me hiciste caso");
		}
		return true;
	}

}
