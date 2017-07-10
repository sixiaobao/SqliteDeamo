package comq.example.asus.sqlitedeamo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ShuJuKu extends SQLiteOpenHelper {
    public ShuJuKu(Context context) {
        super(context, "iouioui", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table safsadg (id int ,name varchar(20),content varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
