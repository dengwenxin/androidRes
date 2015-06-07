package com.example.baimap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;

/**
 * 演示MapView的基本用法
 */
public class MainActivity extends Activity {
	@SuppressWarnings("unused")
	private static final String LTAG = MainActivity.class.getSimpleName();
	//private MapView mMapView;
	private BaiduMap mBaiduMap;
	 MapView mMapView = null;  
	    @Override  
	    
	    protected void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);   
	        //在使用SDK各组件之前初始化context信息，传入ApplicationContext  
	        //注意该方法要再setContentView方法之前实现  
	        SDKInitializer.initialize(getApplicationContext());  
	        setContentView(R.layout.activity_main);  
	        //获取地图控件引用  
	        mMapView = (MapView) findViewById(R.id.bmapView);  
	    } 

	@Override
	protected void onPause() {
		super.onPause();
		// activity 暂停时同时暂停地图控件
		mMapView.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		// activity 恢复时同时恢复地图控件
		mMapView.onResume();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// activity 销毁时同时销毁地图控件
		mMapView.onDestroy();
	}

}
