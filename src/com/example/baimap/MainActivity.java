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
 * ��ʾMapView�Ļ����÷�
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
	        //��ʹ��SDK�����֮ǰ��ʼ��context��Ϣ������ApplicationContext  
	        //ע��÷���Ҫ��setContentView����֮ǰʵ��  
	        SDKInitializer.initialize(getApplicationContext());  
	        setContentView(R.layout.activity_main);  
	        //��ȡ��ͼ�ؼ�����  
	        mMapView = (MapView) findViewById(R.id.bmapView);  
	    } 

	@Override
	protected void onPause() {
		super.onPause();
		// activity ��ͣʱͬʱ��ͣ��ͼ�ؼ�
		mMapView.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		// activity �ָ�ʱͬʱ�ָ���ͼ�ؼ�
		mMapView.onResume();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// activity ����ʱͬʱ���ٵ�ͼ�ؼ�
		mMapView.onDestroy();
	}

}
