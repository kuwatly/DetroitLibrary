package iyad.kuwatly.DPL;

import iyad.kuwatly.DPL.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class FeaturedFragment extends Fragment {
	
	public FeaturedFragment(){}
	private View mContentView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {

	    mContentView = inflater.inflate(R.layout.fragment_about, container, false);
	     
	    return mContentView;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
	    super.onActivityCreated(savedInstanceState);

	    WebView webview = (WebView)mContentView.findViewById(R.id.fragmentWebview);
	    webview.loadUrl("file:///android_asset/featured.html");
	}
}

