package comq.example.asus.sqlitedeamo;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class PagerAdapter extends android.support.v4.view.PagerAdapter {
   ArrayList<View> arr;

    public PagerAdapter(ArrayList<View> arr) {
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(arr.get(position));
        return arr.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView(arr.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
