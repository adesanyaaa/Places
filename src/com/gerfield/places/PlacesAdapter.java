package com.gerfield.places;

import java.util.ArrayList;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PlacesAdapter extends ArrayAdapter<Place> {
	private ArrayList<Place> places;
	private final Activity context;

	public PlacesAdapter(Activity context, ArrayList<Place> places) {
		super(context, R.layout.list_single_item, places);
		this.places = places;
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.list_single_item, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
		txtTitle.setText(places.get(position).getName());
		return rowView;
	}
}
