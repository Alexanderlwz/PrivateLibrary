package com.alexander.privatelibrary;

import android.util.Log;

import com.alexander.deviceadapter.AsusK010;
import com.alexander.deviceadapter.LenovoA7600;
import com.alexander.deviceadapter.LenovoS6000;
import com.alexander.deviceadapter.MalataQ18;

public class DeviceFactory {
	
	private static final String TAG = "DeviceFactory";
	
	private static final String LenovoS6000 = "Lenovo S6000";
	private static final String LenovoA7600 = "Lenovo A7600";
	private static final String AsusK010 = "Asus K010";
	private static final String MalataQ18 = "Malata Q18";
	
	private static BaseDevice baseDevice = null;

	private static int randomNumber = 0;
	
	public static BaseDevice getDevice() {
		Log.e(TAG, "BaseDevice getDevice().");
		if (baseDevice != null) {
			Log.e(TAG, "return device.");
			return baseDevice;
		}
		Log.e(TAG, "generate a new device.");
		return _getRandomDevice();
	}
	
	private static BaseDevice _getRandomDevice(){
		randomNumber  += ((int) Math.random()) % 5;
		Log.e(TAG, "_getRandomDevice: " + randomNumber);
		switch (randomNumber) {
		case 0:
			return new LenovoS6000();
//		case 1:
//			return new LenovoA7600();
//		case 2:
//			return new AsusK010();
//		case 3:
//			return new MalataQ18();
//		case 4:
//			return new BaseDevice();
		default:
			return new LenovoS6000();
		}
	}
}
