package com.example.whatsappclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.new_group:
                Toast.makeText(this, "new_group", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.new_broadcast:
                Toast.makeText(this, "new_broadcast", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.whatsapp_web:
                Toast.makeText(this, "whatsapp_web", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.payments:
                Toast.makeText(this, "payments", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.starred_messages:
                Toast.makeText(this, "starred_messages", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
