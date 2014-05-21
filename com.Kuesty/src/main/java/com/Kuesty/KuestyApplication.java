package com.Kuesty;

import com.Kuesty.controller.DataController;
import android.app.Application;
import android.content.Context;
import android.content.Intent;

public class KuestyApplication extends Application {

	private static KuestyApplication _instance;
	private static DataController _datacontroller;
	
	public KuestyApplication() {
		super();
		_instance = this;
	}

	public static KuestyApplication getInstance() {
		return _instance;
	}
	
	public static DataController getDataController() {
		if(_datacontroller == null) {
			_datacontroller = new DataController();
		}
		return _datacontroller;
	}

	public static void logout(Context context) {
	}
}
