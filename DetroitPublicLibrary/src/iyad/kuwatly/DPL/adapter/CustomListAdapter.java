package iyad.kuwatly.DPL.adapter;



import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import iyad.kuwatly.DPL.model.LocationItem;
import iyad.kuwatly.DPL.R;

import java.util.ArrayList;
import java.util.Date;
public class CustomListAdapter extends ArrayAdapter{
    private static class ViewHolder {
        ImageView imageView;
        TextView name;
        TextView address;
        TextView phone;
        TextView hours;
        ImageButton buttonCall;
        ImageButton buttonMap;
    }
    private final Context context;
    private ArrayList<LocationItem> customValues;



    public CustomListAdapter(Context context,ArrayList<LocationItem> values) {
        super(context, R.layout.list_row_layout, values);
        this.context = context;
        this.customValues = values;


    }
    @Override
    public int getCount() {
        return customValues.size();
    }

    @Override
    public LocationItem getItem(int position) {
        return customValues.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        LocationItem child = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_row_layout, null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.thumbImage);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            //viewHolder.address = (TextView) convertView.findViewById(R.id.date);
            //viewHolder.phone = (TextView) convertView.findViewById(R.id.time);
            viewHolder.hours = (TextView) convertView.findViewById(R.id.hours);
            viewHolder.buttonCall = (ImageButton) convertView
                    .findViewById(R.id.btnCall);
            viewHolder.buttonMap = (ImageButton) convertView
                    .findViewById(R.id.btnMap);


           // convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.imageView.setImageResource(child.imageID);
        viewHolder.name.setText(child.name);

        viewHolder.hours.setText(child.hours);
        viewHolder.buttonCall.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            	//context.startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:"+ child.phone));
        	context.startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel: (313) 481-1300")));
        }
        });
                
        viewHolder.buttonMap.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
              	//Intent intentMap = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=" + (child.st_number + " " + child.st_name)));
        		Intent intentMap = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=5201 Woodward Ave."));
              	context.startActivity(intentMap);
        }
        });
        //viewHolder.time.setText(time);
        // Return the completed view to render on screen
        return convertView;

    }


    
}


