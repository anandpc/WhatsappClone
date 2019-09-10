package com.example.whatsappclone;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.whatsappclone.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Toolbar mToolbar;

    int[] data = {0, 10, 20, 30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(mToolbar);

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), data);
        mViewPager.setAdapter(viewPagerAdapter);

        mTabLayout.setupWithViewPager(mViewPager);

        setUpTabLayout();

    }

    private void setUpTabLayout() {
        mTabLayout.getTabAt(0).setCustomView(R.layout.custom_tab_camera);

        mTabLayout.getTabAt(1).setCustomView(R.layout.custom_tab);
        View viewTab1 = mTabLayout.getTabAt(1).getCustomView();
        TextView textView1 = viewTab1.findViewById(R.id.tab_text);
        textView1.setText("chats");

        // default selection for chat tab
        mTabLayout.getTabAt(1).select();

        mTabLayout.getTabAt(2).setCustomView(R.layout.custom_tab);
        View viewTab2 = mTabLayout.getTabAt(2).getCustomView();
        viewTab2.findViewById(R.id.tab_status_dot).setVisibility(View.VISIBLE);
        viewTab2.findViewById(R.id.tab_status_text).setVisibility(View.GONE);
        TextView textView2 = viewTab2.findViewById(R.id.tab_text);
        textView2.setText("status");

        mTabLayout.getTabAt(3).setCustomView(R.layout.custom_tab);
        View viewTab3 = mTabLayout.getTabAt(3).getCustomView();
        TextView textView = viewTab3.findViewById(R.id.tab_text);
        textView.setText("calls");

        // sets weight to camera tab
        LinearLayout layout = ((LinearLayout) ((LinearLayout) mTabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
        layoutParams.weight = 0.4f;
        layout.setLayoutParams(layoutParams);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
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
