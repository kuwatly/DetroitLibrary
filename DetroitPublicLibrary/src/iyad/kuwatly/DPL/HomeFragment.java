package iyad.kuwatly.DPL;

import jim.h.common.android.zxinglib.integrator.IntentIntegrator;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment implements OnClickListener  {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnSearch;
        btnSearch = (Button) rootView.findViewById(R.id.btnSearchClick);
        btnSearch.setOnClickListener(this);
        return rootView;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		if(v.getId()==R.id.btnSearchClick){
			Intent i = new Intent(getActivity(), ResultActivity.class);
			startActivity(i);
		}
		
	}
}
