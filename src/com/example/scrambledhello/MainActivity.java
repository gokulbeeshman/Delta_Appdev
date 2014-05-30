package com.example.scrambledhello;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@SuppressWarnings("static-access")
	public void scrambleHello (View view) {
		TextView scramblerView;
		scramblerView= (TextView)findViewById(R.id.print_message);
		String message=scramblerView.getText().toString();
		int length=message.length();
		length/=2;
		Random r = new Random();
		int i1 = r.nextInt(length);
		char c[]=message.toCharArray();
		char temp;
		for(int i=0;i<length;i++)
		{
			temp=c[i];
			c[i]=c[i+i1];
			c[i+i1]=temp;
		}
		message=message.valueOf(c);
		scramblerView.setText(message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
