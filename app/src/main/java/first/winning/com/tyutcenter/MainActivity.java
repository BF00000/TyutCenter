package first.winning.com.tyutcenter;

import android.databinding.ViewDataBinding;
import android.util.Log;
import android.view.View;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;

import first.winning.com.tyutcenter.annotation.ContentView;
import first.winning.com.tyutcenter.base.BaseActivity;
import first.winning.com.tyutcenter.databinding.ActivityMainBinding;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Override
    public void initData(ViewDataBinding viewDataBinding) {
        ActivityMainBinding binding = (ActivityMainBinding) viewDataBinding;

    }
}
