package learn.xiaomi.yuyanweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DelListActivity extends AppCompatActivity {

    private List<UninstallApp> uninstallApps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.del_list);
        String name = getIntent().getStringExtra("name");
        Student student = getIntent().getExtras().getParcelable("student");
        Teacher teacher = (Teacher) getIntent().getExtras().getSerializable("teacher");
        initUninstallApps();
        UninstallAppsAdapter adapter = new UninstallAppsAdapter(DelListActivity.this, R.layout.del_list_item, uninstallApps);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position,long id){
                UninstallApp uninstallApp = uninstallApps.get(position);
                Toast.makeText(DelListActivity.this,uninstallApp.getName(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initUninstallApps(){
        UninstallApp alipay = new UninstallApp(R.drawable.alipay,"支付宝","大小：225.72M");
        uninstallApps.add(alipay);
        UninstallApp calculator = new UninstallApp(R.drawable.calculator,"计算器","大小：20.01M");
        uninstallApps.add(calculator);
        UninstallApp ctrip = new UninstallApp(R.drawable.ctrip,"携程","大小：310.11M");
        uninstallApps.add(ctrip);
        UninstallApp douyin = new UninstallApp(R.drawable.douyin,"抖音","大小：739.93M");
        uninstallApps.add(douyin);
        UninstallApp mi = new UninstallApp(R.drawable.mi,"小米商城","大小：225.72M");
        uninstallApps.add(mi);
        UninstallApp mijia = new UninstallApp(R.drawable.mijia,"米家","大小：310.11M");
        uninstallApps.add(mijia);
        UninstallApp q = new UninstallApp(R.drawable.q,"QQ","大小：739.93M");
        uninstallApps.add(q);
        UninstallApp qiy = new UninstallApp(R.drawable.qiy,"爱奇艺","大小：225.72M");
        uninstallApps.add(qiy);
        UninstallApp sina = new UninstallApp(R.drawable.sina,"新浪","大小：225.72M");
        uninstallApps.add(sina);
        UninstallApp tieba = new UninstallApp(R.drawable.tieba,"贴吧","大小：225.72M");
        uninstallApps.add(tieba);
        UninstallApp w = new UninstallApp(R.drawable.w,"WPS","大小：225.72M");
        uninstallApps.add(w);
        UninstallApp wechat = new UninstallApp(R.drawable.wechat,"微信","大小：225.72M");
        uninstallApps.add(wechat);
        UninstallApp xiaomijinrong = new UninstallApp(R.drawable.xiaomijinrong,"小米金融","大小：225.72M");
        uninstallApps.add(xiaomijinrong);
        UninstallApp kuaishou = new UninstallApp(R.drawable.kuaishou,"快手","大小：225.72M");
        uninstallApps.add(kuaishou);
        UninstallApp eleme = new UninstallApp(R.drawable.eleme,"饿了么","大小：225.72M");
        uninstallApps.add(eleme);
        UninstallApp meituan = new UninstallApp(R.drawable.meituan,"美团","大小：225.72M");
        uninstallApps.add(meituan);
        UninstallApp xiaomiyoupin = new UninstallApp(R.drawable.xiaomiyoupin,"小米有品","大小：225.72M");
        uninstallApps.add(xiaomiyoupin);
    }
}
