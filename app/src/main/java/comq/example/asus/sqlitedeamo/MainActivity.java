package comq.example.asus.sqlitedeamo;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList<Bena> arrxx;
    private Adapter adapter;

    private SQLiteDatabase readableDatabase;
    private SQLiteDatabase writableDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        XinWen xinWen=new XinWen(this);
        arrxx = new ArrayList<>();
        readableDatabase = xinWen.getReadableDatabase();
        adapter = new Adapter(arrxx,this);
        list.setAdapter(adapter);

        quer();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("bean",arrxx.get(i));
                startActivity(intent);
            }
        });





    }



    public void add(){

              for (int x=0;x<10;x++){
                  Bena bena=new Bena();
                  bena.setId(R.mipmap.ic_launcher);
                  bena.setName("这是第"+x+"条新闻");
                  bena.setContent("这是第"+x+"条新闻的内容");
                  ContentValues values=new ContentValues();
                  values.put("id", bena.getId());
                  values.put("name",bena.getName());
                  values.put("content",bena.getContent());
                  long rrr = readableDatabase.insert("gmjj", null, values);

                  if(rrr>0){
                      Log.e("TAG","成功");
                  }else{
                      Log.e("TAG","失败");
                  }
              }





        }





    public  void quer(){

        arrxx.clear();

                Cursor test = readableDatabase.query("gmjj", null, null, null, null, null, null);

                while (test.moveToNext()){
                    String name = test.getString(test.getColumnIndex("name"));
                    String content = test.getString(test.getColumnIndex("content"));
                    int id = test.getInt(test.getColumnIndex("id"));
                    Bena bena=new Bena();
                    bena.setId(id);
                    bena.setName(name);
                    bena.setContent(content);
                    arrxx.add(bena);
                }
                adapter.notifyDataSetChanged();
            }




}
