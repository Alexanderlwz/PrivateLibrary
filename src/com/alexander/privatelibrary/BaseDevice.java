package com.alexander.privatelibrary;

import android.util.Log;

public class BaseDevice implements DeviceAdapter {

	private static final String TAG = "BaseDevice";

	@Override
	public void init() {
		Log.e(TAG, "Base Device init().");
	}

	@Override
	public void release() {
		Log.e(TAG, "Base Device release().");
	}

	@Override
	public void print() {
		Log.e(TAG, "Base Device print().");
	}
}
