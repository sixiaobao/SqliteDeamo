package comq.example.asus.sqlitedeamo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class Adapter extends BaseAdapter {
    ArrayList<Bena> arr;
    Context context;



    public Adapter(ArrayList<Bena> arr, Context context) {
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
        con = View.inflate(context, R.layout.item, null);
        TextView name = (TextView) con.findViewById(R.id.name);
        ImageView img= (ImageView) con.findViewById(R.id.img);
        TextView conten = (TextView) con.findViewById(R.id.conten);
        name.setText(arr.get(i).getName());
        conten.setText(arr.get(i).getContent()+"");
        img.setImageResource(arr.get(i).getId());
        return con;
    }


}
