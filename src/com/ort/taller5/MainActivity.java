package com.ort.taller5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tv_main_nombre;
	private EditText et_main_nombre;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//final es para que no se pueda modificar
		//como esta declarado afuera del evento del boton va con final
		//pero es mejor declarar como variable global de la clase asi no usamos el final
		tv_main_nombre = (TextView) findViewById(R.id.tv_main_nombre);
		et_main_nombre= (EditText) findViewById(R.id.et_main_nombre);
		Button btn_main_nombre = (Button) findViewById(R.id.button_main_settings);
		btn_main_nombre.setOnClickListener(new OnClickListener()
		    {
		      public void onClick(View v)
		      {
		         tv_main_nombre.setText(et_main_nombre.getText());
		      }
		    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
