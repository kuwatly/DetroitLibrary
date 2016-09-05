package iyad.kuwatly.DPL;

import iyad.kuwatly.DPL.JsonParser;
import iyad.kuwatly.DPL.R;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashScreen extends Activity {
	// flag for Internet connection status
	Boolean isInternetPresent = false;
	
	// Connection detector class
	ConnectionDetector cd;
	
	String now_playing, earned;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		// creating connection detector class instance
		cd = new ConnectionDetector(getApplicationContext());

		// get Internet status
		isInternetPresent = cd.isConnectingToInternet();

		// check for Internet status
		if (isInternetPresent) {
			// Internet Connection is Present
			// make HTTP requests
			//showAlertDialog(iyad.kuwatly.DPL.SplashScreen.this, "Internet Connection",
			//		"You have internet connection", true);
			new PrefetchData().execute();
		} else {
			// Internet connection is not present
			// Ask user to connect to Internet
			//showAlertDialog(iyad.kuwatly.DPL.SplashScreen.this, "No Internet Connection",
			//		"You don't have internet connection.", false);
            Context context = getApplicationContext();
            CharSequence text = "Please connect to Internet to use app features";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
			
			Intent i = new Intent(SplashScreen.this, MainActivity.class);
			startActivity(i);
		}

		/*
		 * Showing splashscreen while making network calls to download necessary
		 * data before launching the app Will use AsyncTask to make http call
		 */
		

	}

	/*
	 * Async Task to make http call
	 */
	private class PrefetchData extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			// before making http calls
			Log.e("JSON", "Pre execute");

		}

		@Override
		protected Void doInBackground(Void... arg0) {
			/*
			 * Will make http call here This call will download required data
			 * before launching the app 
			 * example: 
			 * 1. Downloading and storing SQLite 
			 * 2. Downloading images 
			 * 3. Parsing the xml / json 
			 * 4. Sending device information to server 
			 * 5. etc.,
			 */
			JsonParser jsonParser = new JsonParser();
			String json = jsonParser
					.getJSONFromUrl("http://api.androidhive.info/game/game_stats.json");

			Log.e("Response: ", "> " + json);

			if (json != null) {
				try {
					JSONObject jObj = new JSONObject(json)
							.getJSONObject("game_stat");
					now_playing = jObj.getString("now_playing");
					earned = jObj.getString("earned");

					Log.e("JSON", "> " + now_playing + earned);

				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
			// After completing http call
			// will close this activity and lauch main activity
			Intent i = new Intent(SplashScreen.this, MainActivity.class);
			i.putExtra("now_playing", now_playing);
			i.putExtra("earned", earned);
			startActivity(i);

			// close this activity
			finish();
		}

	}
	


}
