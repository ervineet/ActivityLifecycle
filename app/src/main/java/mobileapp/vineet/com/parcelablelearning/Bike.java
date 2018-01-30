package mobileapp.vineet.com.parcelablelearning;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by stpl on 30-Jan-18.
 */

public class Bike implements Parcelable {

    private String name;
    private String company;
    private String color;

    public Bike() {
        Log.i("DEMO", "Constructor");
    }

    public Bike(Parcel parcel) {
        Log.i("DEMO", "Constructor: Parcel");
        name    = parcel.readString();
        company = parcel.readString();
        color   = parcel.readString();
    }

    @Override
    public int describeContents() {
        Log.i("DEMO", "Method: describeContents");
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        Log.i("DEMO", "Method: writeToParcel");
        parcel.writeString(this.name);
        parcel.writeString(this.company);
        parcel.writeString(this.color);
    }

    public static final Creator<Bike> CREATOR = new Creator<Bike>() {
        @Override
        public Bike createFromParcel(Parcel parcel) {
            Log.i("DEMO", "Method (Creator): createFromParcel");
            return new Bike(parcel);
        }

        @Override
        public Bike[] newArray(int size) {
            Log.i("DEMO", "Method (Creator): newArray");
            return new Bike[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Log.i("DEMO", "Method: setName");
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        Log.i("DEMO", "Method: setCompany");
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Log.i("DEMO", "Method: setColor");
        this.color = color;
    }

}
