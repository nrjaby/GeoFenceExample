package com.example.nirajkumar.geofenceexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

	public static String TAG = "lstech.aos.debug";
	static public boolean geofencesAlreadyRegistered = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Fragment f = new MapsFragment();

		FragmentManager fragmentManager = getSupportFragmentManager();
		fragmentManager.beginTransaction()
				.replace(android.R.id.content, f, "home").commit();
		fragmentManager.executePendingTransactions();

		startService(new Intent(this, GeolocationService.class));
	}
}
