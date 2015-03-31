package com.example.baidumap;



import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.*;
import com.baidu.mapapi.search.poi.*;

import android.app.Activity;
import android.os.Bundle;

import android.widget.Button;


public  class mapActivity extends Activity
{
	 

	Button mBtnSearch = null;	
	//地图View
	MapView mMapView = null;	
	//城市名称
	String  mCityName = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());  
        setContentView(R.layout.jiemian);
        mMapView = (MapView) findViewById(R.id.bmapView);
        MapPoi.onMapPoiClick(R.layout.jiemian);
      
    }
    		
	

		@Override
		protected void onDestroy()
		{
			super.onDestroy();
		
			mMapView.onDestroy();
			mMapView = null;
		}

		@Override
		protected void onResume()
		{
			super.onResume();
			mMapView.onResume();
		}

		@Override
		protected void onPause()
		{
			super.onPause();
			mMapView.onPause();
		}

	}


