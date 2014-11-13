package cc.mvdan.template;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import cc.mvdan.template.R;

public class BaseActivity extends Activity {

    private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.base);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
