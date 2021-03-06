package example.collura.mvpstudy.mvp.secondactivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.collura.mvpstudy.R;
import example.collura.mvpstudy.mvp.base.BaseActivity;

public class AppSecondActivity extends BaseActivity implements SecondActivity {

    private AppSecondActivityPresenter presenter;
    @BindView ( R.id.tv_network_data )
    TextView  tvNetworkdata;

    @BindView (R.id.tv_preferences_data)
    TextView tvPreferencesData;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        ButterKnife.bind ( this );

        presenter = new AppSecondActivityPresenter ( this );
    }


    @Override @OnClick(  R.id.bt_getdata )
    public void getData () {
        presenter.getNetworkdata ();
        presenter.getPreferencesdata ();
    }

    @Override
    public void preferencesDatacallback (String data) {
        tvPreferencesData.setText ( data );
    }

    @Override
    public void networkDataCallback (String data) {
        tvNetworkdata.setText ( data );
    }

    @Override
    protected void onDestroy () {
        super.onDestroy ();
        presenter.unregisterModel ();
    }

    @Override
    protected void showToast (String msg) {
        Toast.makeText (this, msg, Toast.LENGTH_SHORT).show ();
    }

    @Override
    protected void showSnackBar (String msg) {

    }

    @Override
    protected void showProgressBar (String msg) {

    }

    @Override
    protected void dismissProgressBar () {

    }

    @Override
    protected void dismissSnackBar () {

    }
}
