package learn.xiaomi.yuyanweather;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private int age;
    private double[] arr;

    public Student(String name, int age, double[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public Student(Parcel in) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    //    protected Student(Parcel in) {
//        name = in.readString();
//        age = in.readInt();
//    }
//
    public final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            Student student = new Student(in);
            return student;
        }

        @Override
        public Student[] newArray(int i) {
            return new Student[0];
        }


        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name);
            parcel.writeInt(age);
        }
    };
}
