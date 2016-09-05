package iyad.kuwatly.DPL;

import java.util.ArrayList;

import iyad.kuwatly.DPL.R;
import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import iyad.kuwatly.DPL.adapter.CustomListAdapter;
import iyad.kuwatly.DPL.model.LocationItem;

public class LocationsFragment extends ListFragment {
	
	public LocationsFragment(){}
	private ArrayList<LocationItem> locationsList = null;
	String[] numbers_text = new String[] { "one", "two", "three", "four",  
		    "five", "six", "seven", "eight", "nine", "ten", "eleven",  
		    "twelve", "thirteen", "fourteen", "fifteen" };  
		  String[] numbers_digits = new String[] { "1", "2", "3", "4", "5", "6", "7",  
		    "8", "9", "10", "11", "12", "13", "14", "15" };

	CustomListAdapter adapter;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		locationsList = new ArrayList<LocationItem>();
		LocationItem i = new LocationItem();
		i.name = "Main";
		i.st_number = "5201";
		i.st_name ="Woodward Ave";
		i.hours="T, W: 12 p.m. - 8 p.m. Th, F, Sa: 10 a.m. - 6 p.m. Su, M: CLOSED";
		i.phone="(313) 481-1300";
		i.imageID = R.drawable.mainlib;
		
		locationsList.add(i);

		i = new LocationItem();
		i.name = "Bowen";
		i.st_number = "3648";
		i.st_name ="Vernor";
		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
		i.phone="(313) 481-1540";
		i.imageID = R.drawable.bowen;
		locationsList.add(i);

		i = new LocationItem();
		i.name = "Campbell";
		i.st_number = "8733";
		i.st_name ="Vernor";
		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
		i.phone="(313) 481-1550";
		i.imageID = R.drawable.campbell;
		locationsList.add(i);
		
		i = new LocationItem();
		i.name = "Chandler Park";
		i.st_number = "12800";
		i.st_name ="Harper";
		i.hours="W, F: 10 a.m. - 6 p.m. Th: 12 p.m. - 8 p.m. M, T, Sa, Su: CLOSED";
		i.phone="(313) 481-1560";
		i.imageID = R.drawable.chandlerpark;
		locationsList.add(i);
		
//		i = new LocationItem();
//		i.name = "Chaney";
//		i.st_number = "16101";
//		i.st_name ="Grand River";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1570";
//		i.imageID = R.drawable.chaney;
//		locationsList.set(4, i);
//		
//		i = new LocationItem();
//		i.name = "Chase";
//		i.st_number = "17731";
//		i.st_name ="7 Mile Rd.";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1580";
//		i.imageID = R.drawable.chase;
//		locationsList.set(5, i);
//		
//		i = new LocationItem();
//		i.name = "Conely";
//		i.st_number = "4600";
//		i.st_name ="Martin";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSE";
//		i.phone="(313) 481-1590";
//		i.imageID = R.drawable.conely;
//		locationsList.set(6, i);
//		
//		i = new LocationItem();
//		i.name = "Douglass";
//		i.st_number = "3666";
//		i.st_name ="Grand River";
//		i.hours="TEMPORARILY CLOSED";
//		i.phone="(313) 481-1700";
//		i.imageID = R.drawable.douglass;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Duffield";
//		i.st_number = "2507";
//		i.st_name ="Grand Blvd.";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1710";
//		i.imageID = R.drawable.duffield;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Edison";
//		i.st_number = "18400";
//		i.st_name ="Joy Rd.";
//		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1720";
//		i.imageID = R.drawable.edison;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Elmwood Park";
//		i.st_number = "550";
//		i.st_name ="Chene";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1732";
//		i.imageID = R.drawable.elmwoodpark;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Franklin";
//		i.st_number = "13651";
//		i.st_name ="McNichols";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1740";
//		i.imageID = R.drawable.franklin;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Hubbard";
//		i.st_number = "12929";
//		i.st_name ="McNichols";
//		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1750";
//		i.imageID = R.drawable.hubbard;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Jefferson";
//		i.st_number = "12350";
//		i.st_name ="Outer Dr.";
//		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1760";
//		i.imageID = R.drawable.jefferson;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Knapp";
//		i.st_number = "13330";
//		i.st_name ="Conant";
//		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1770";
//		i.imageID = R.drawable.knapp;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Lincoln";
//		i.st_number = "1221";
//		i.st_name ="7 Mile Rd.";
//		i.hours="M: 12 p.m. - 8 p.m. T: 10 a.m. - 6 p.m. W, Th, F, Sa, Su: CLOSED";
//		i.phone="(313) 481-1780";
//		i.imageID = R.drawable.lincoln;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Monteith";
//		i.st_number = "14100";
//		i.st_name ="Kercheval";
//		i.hours="M: 12 p.m. - 8 p.m. T: 10 a.m. - 6 p.m. W, Th, F, Sa, Su: CLOSED";
//		i.phone="(313) 481-1800";
//		i.imageID = R.drawable.monteith;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "National Automotive History Collection";
//		i.st_number = "121";
//		i.st_name ="Gratiot";
//		i.hours="M, T, W, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1300";
//		i.imageID = R.drawable.nahc;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Parkman";
//		i.st_number = "1766";
//		i.st_name ="Oakman Blvd.";
//		i.hours="M, W: 12 p.m. - 8 p.m. T, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1810";
//		i.imageID = R.drawable.parkman;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Redford";
//		i.st_number = "21200 ";
//		i.st_name ="Grand River";
//		i.hours="TEMPORARILY CLOSED";
//		i.phone="(313) 481-1820";
//		i.imageID = R.drawable.redford;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Sherwood Forest";
//		i.st_number = "7117";
//		i.st_name =" 7 Mile Rd.";
//		i.hours="M, W, F: 10 a.m. - 6 p.m. T, Th: 12 p.m. - 8 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1840";
//		i.imageID = R.drawable.sherwoodforest;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Skillman";
//		i.st_number = "121";
//		i.st_name ="Gratiot";
//		i.hours="M, T, W, Th, F: 10 a.m. - 6 p.m. Sa, Su: CLOSED";
//		i.phone="(313) 481-1850";
//		i.imageID = R.drawable.skillman;
//		locationsList.add(i);
//		
//		i = new LocationItem();
//		i.name = "Wilder";
//		i.st_number = "7140";
//		i.st_name ="7 Mile Rd.";
//		i.hours="W: 12 p.m. - 8 p.m. Th, F:  10 a.m. - 6 p.m. M, T, Sa, Su: CLOSED";
//		i.phone="(313) 481-1870";
//		i.imageID = R.drawable.wilder;
//		locationsList.add(i);
		
        adapter = new CustomListAdapter(inflater.getContext(),locationsList);
        //View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        setListAdapter(adapter);  
		return super.onCreateView(inflater, container, savedInstanceState);  
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //Log.e("ListingsClick",position + " " + id);
        //Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
        //intent.putExtra("event", adapter.getItem(position));
        //startActivity(intent);
    	//new Toast(getActivity(), numbers_digits[(int) id]);
    }


}