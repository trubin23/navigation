package ru.trubin23.navigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity implements
        Fragment1.OnFragment1Listener,
        Fragment2.OnFragment2Listener,
        Fragment3.OnFragment3Listener {

    NavController mNavController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    @Override
    public void onFragment1NextClick() {
        mNavController.navigate(R.id.action_fragment1_to_fragment2);
    }

    @Override
    public void onFragment1BackClick() {

    }

    @Override
    public void onFragment2NextClick() {
        Bundle bundle = new Bundle();
        bundle.putByte("arg1", Byte.valueOf("2"));
        bundle.putFloat("arg2", 123.4567f);
        bundle.putString("arg6", "replace default");
        mNavController.navigate(R.id.action_fragment2_to_fragment3, bundle);
    }

    @Override
    public void onFragment2BackClick() {
        mNavController.popBackStack();
    }

    @Override
    public void onFragment3NextClick() {
        mNavController.navigate(R.id.secondActivity);
    }

    @Override
    public void onFragment3BackClick() {
        mNavController.popBackStack();
    }
}
