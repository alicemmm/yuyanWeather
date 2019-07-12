package learn.xiaomi.yuyanweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UninstallAppsAdapter extends ArrayAdapter <UninstallApp>{
    private int resourceId;
    public UninstallAppsAdapter(Context context, int textViewResourceId, List<UninstallApp> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }


    public View getView(int position, View convertView , ViewGroup parent){
        UninstallApp uninstallApp = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
           view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
           viewHolder = new ViewHolder();
           viewHolder.AppImage = view.findViewById(R.id.app_image);
           viewHolder.AppName = view.findViewById(R.id.app_name);
           viewHolder.AppSize = view.findViewById(R.id.app_size);
           view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.AppImage.setImageResource(uninstallApp.getImageId());
        viewHolder.AppName.setText(uninstallApp.getName());
        viewHolder.AppSize.setText(uninstallApp.getSize());
        return view;

//        ImageView appImage = view.findViewById(R.id.app_image);
//        TextView appname = view.findViewById(R.id.app_name);
//        TextView appsize = view.findViewById(R.id.app_size);
//        appImage.setImageResource(uninstallApp.getImageId());
//        appname.setText(uninstallApp.getName());
//        appsize.setText(uninstallApp.getSize());
//        return view;
    }

    class ViewHolder{
        ImageView AppImage;
        TextView AppName;
        TextView AppSize;
    }
}
