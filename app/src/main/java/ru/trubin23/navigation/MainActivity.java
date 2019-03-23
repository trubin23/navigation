package ru.trubin23.navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        OnFragment1Listener, OnFragment2Listener , OnFragment3Listener{

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
        mNavController.navigate(R.id.action_fragment2_to_fragment3);
    }

    @Override
    public void onFragment2BackClick() {
        mNavController.popBackStack();
    }

    @Override
    public void onFragment3NextClick() {

    }

    @Override
    public void onFragment3BackClick() {
        mNavController.popBackStack();
    }
}
