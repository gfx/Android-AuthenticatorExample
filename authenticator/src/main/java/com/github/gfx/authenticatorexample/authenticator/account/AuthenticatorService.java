package com.github.gfx.authenticatorexample.authenticator.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AuthenticatorService extends Service {
    public AuthenticatorService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("XXX", "AuthenticatorService#onBind()");
        MyAccountAuthenticator authenticator = new MyAccountAuthenticator(this);
        return authenticator.getIBinder();
    }
}
