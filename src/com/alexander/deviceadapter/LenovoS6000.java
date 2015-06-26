package com.alexander.deviceadapter;

import android.util.Log;

import com.alexander.privatelibrary.BaseDevice;
import com.alexander.privatelibrary.DeviceAdapter;

public class LenovoS6000 extends BaseDevice implements DeviceAdapter {
	
	private static final String TAG = "LenovoS6000";

	@Override
	public void init() {
		Log.e(TAG, "LenovoS6000 init().");
	}

	@Override
	public void release() {
		Log.e(TAG, "LenovoS6000 release().");
	}

	@Override
	public void print() { 
		Log.e(TAG, "LenovoS6000 print().");
	}
}
 