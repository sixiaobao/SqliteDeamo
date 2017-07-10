package comq.example.asus.sqlitedeamo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private ViewPager pager;
    private ArrayList<View> arr;
    private ArrayList<String> arr2;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();


    }

    private void initView() {
        arr = new ArrayList<>();
        arr2 = new ArrayList<>();
        View inflate = View.inflate(this, R.layout.item1, null);
        View inflate1 = View.inflate(this, R.layout.item2, null);
        View inflate2 = View.inflate(this, R.layout.item3, null);

        arr.add(inflate);
        arr.add(inflate1);
        arr.add(inflate2);
        pager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pagerAdapter = new PagerAdapter(arr);
        pager.setAdapter(pagerAdapter);
        listview = (ListView) findViewById(R.id.listview);
        Bena bean = getIntent().getParcelableExtra("bean");

        arr2.add(bean.getContent());
        arr2.add(bean.getContent());
        arr2.add(bean.getContent());
        Adapter2 adapter2=new Adapter2(arr2,this);
        listview.setAdapter(adapter2);
        ImageView img1 = (ImageView) inflate.findViewById(R.id.img1);
        ImageView img2 = (ImageView) inflate1.findViewById(R.id.img2);
        ImageView img3 = (ImageView) inflate2.findViewById(R.id.img3);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,Main22Activity.class);

                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,Main22Activity.class);

                startActivity(intent);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,Main22Activity.class);

                startActivity(intent);
            }
        });
    }
}
