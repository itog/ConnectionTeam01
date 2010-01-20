package org.deb.connection;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TopActivity extends Activity implements OnClickListener {
	final String TAG = "DebCon";
	
	Button bluetoothButton;
	Button handwritingButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		bluetoothButton = (Button)findViewById(R.id.bluetooth_button);
		handwritingButton = (Button)findViewById(R.id.handwriting_button);
		bluetoothButton.setOnClickListener(this);
		handwritingButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bluetooth_button:
			//TODO start bluetooth activity
			Log.v(TAG, "Start Bluetooth Activity");
			startActivity(new Intent(this, BluetoothChat.class));
			break;
		case R.id.handwriting_button:
			//TODO start handwriting activity
			Log.v(TAG, "Start Handwriting Activity");
			break;
		}
	}
}
