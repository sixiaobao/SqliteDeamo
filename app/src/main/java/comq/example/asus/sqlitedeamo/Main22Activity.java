package comq.example.asus.sqlitedeamo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class Main22Activity extends AppCompatActivity { 

    private ViewPager pager3;
    private ArrayList<View> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        initView();
    }

    private void initView() {
        arr=new ArrayList<>();
        View inflate = View.inflate(this, R.layout.item1, null);
            arr.add(inflate);

        pager3 = (ViewPager) findViewById(R.id.pager3);
        PagerAdapter pagerAdapter = new PagerAdapter(arr);
        pager3.setAdapter(pagerAdapter);
    }
}
