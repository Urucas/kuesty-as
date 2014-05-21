package com.Kuesty.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Kuesty.R;
import com.actionbarsherlock.app.SherlockFragment;

public class LeftMenuFragment extends SherlockFragment{

	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.fragment_leftmenu, container, false);
		
		return view;
	
	}
	
}
