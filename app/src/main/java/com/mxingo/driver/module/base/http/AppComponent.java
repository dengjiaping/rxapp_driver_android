package com.mxingo.driver.module.base.http;

import com.mxingo.driver.module.DriverCarRegistrationActivity;
import com.mxingo.driver.module.HybridSearchActivity;
import com.mxingo.driver.module.LoginActivity;
import com.mxingo.driver.module.MyBillActivity;
import com.mxingo.driver.module.NoticeActivity;
import com.mxingo.driver.module.NoticeInfoActivity;
import com.mxingo.driver.module.SettingActivity;
import com.mxingo.driver.module.base.map.route.SearchRouteActivity;
import com.mxingo.driver.module.order.MapActivity;
import com.mxingo.driver.module.order.MyOrderActivity;
import com.mxingo.driver.module.order.OrderInfoActivity;
import com.mxingo.driver.module.order.OrdersActivity;
import com.mxingo.driver.module.take.MainActivity;
import com.mxingo.driver.module.take.TakeOrderActivity;
import com.mxingo.driver.module.take.TakeOrderDialog;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhouwei on 2017/6/22.
 */

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(LoginActivity activity);

    void inject(MainActivity activity);

    void inject(OrdersActivity activity);

    void inject(HybridSearchActivity activity);

    void inject(OrderInfoActivity activity);

    void inject(TakeOrderActivity activity);

    void inject(MyOrderActivity activity);

    void inject(MapActivity activity);

    void inject(SettingActivity activity);

    void inject(TakeOrderDialog dialog);

    void inject(SearchRouteActivity activity);

    void inject(DriverCarRegistrationActivity activity);

    void inject(NoticeActivity activity);

    void inject(NoticeInfoActivity activity);

    void inject(MyBillActivity activity);
}
