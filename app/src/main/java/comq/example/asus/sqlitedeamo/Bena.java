package comq.example.asus.sqlitedeamo;

import android.os.Parcel;
import android.os.Parcelable;



public class Bena implements Parcelable {
  String name;
  String content;
  int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.content);
        dest.writeInt(this.id);
    }

    public Bena() {
    }

    protected Bena(Parcel in) {
        this.name = in.readString();
        this.content = in.readString();
        this.id = in.readInt();
    }

    public static final Parcelable.Creator<Bena> CREATOR = new Parcelable.Creator<Bena>() {
        @Override
        public Bena createFromParcel(Parcel source) {
            return new Bena(source);
        }

        @Override
        public Bena[] newArray(int size) {
            return new Bena[size];
        }
    };
}
