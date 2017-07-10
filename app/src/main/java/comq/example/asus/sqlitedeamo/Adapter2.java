package comq.example.asus.sqlitedeamo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter2 extends BaseAdapter {
    ArrayList<String> arr;
    Context context;



    public Adapter2(ArrayList<String> arr, Context context) {
        this.arr = arr;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View con, ViewGroup viewGroup) {
        con = View.inflate(context, R.layout.item6, null);
        TextView conten = (TextView) con.findViewById(R.id.nr);
        conten.setText(arr.get(i));
        return con;
    }


}
