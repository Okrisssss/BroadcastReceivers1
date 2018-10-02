package com.example.piachimov.broadcastreceiver;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AbstractRuntimePermission {
    private static final int REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    requestAppPermissions(new String[]{
                    Manifest.permission.READ_CONTACTS,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_CONTACTS},
                    R.string.msg, REQUEST_CODE);// Here can be an error
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        //DO anything when permission granted
        Toast.makeText(this, "Permission granted!", Toast.LENGTH_LONG).show();
    }
}
