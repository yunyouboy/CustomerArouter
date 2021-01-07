package com.xiangxue.new_modular_customarouter.base;

import com.xiangxue.common.RecordPathManager;
import com.xiangxue.common.base.BaseApplication;
import com.xiangxue.new_modular_customarouter.MainActivity;
import com.xiangxue.new_modular_customarouter.order.Order_MainActivity;
import com.xiangxue.new_modular_customarouter.personal.Personal_MainActivity;

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // 如果项目有100个Activity，这种加法会不会太那个？  是不是太麻烦了，所以废除了
        RecordPathManager.joinGroup("app", "MainActivity", MainActivity.class);
        RecordPathManager.joinGroup("order", "Order_MainActivity", Order_MainActivity.class);
        RecordPathManager.joinGroup("personal", "Personal_MainActivity", Personal_MainActivity.class);
    }
}
