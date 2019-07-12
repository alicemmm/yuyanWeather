package learn.xiaomi.yuyanweather;

import android.media.Image;

public class UninstallApp {

    private int ImageId;
    private String name;
    private String size;

    public  UninstallApp(int imageId,String name,String size){
        this.ImageId = imageId;
        this.name = name;
        this.size = size;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

}
