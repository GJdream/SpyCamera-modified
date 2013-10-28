package com.jwork.spycamera;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenPrivacyProvider extends BroadcastReceiver {	
	
	@Override
    public void onReceive(Context context, Intent intent) {
		Intent in = new Intent(context, SpyCamActivity.class);
		//WIDGET_AUTO_MODE call
		in.setAction(SpyCamActivity.ACTION_WIDGET[1]);
		PendingIntent pi = PendingIntent.getActivity(context, 0, in, PendingIntent.FLAG_ONE_SHOT);
		try {
			pi.send();
		} catch (CanceledException e) {
			e.printStackTrace();
		}
    }
}
