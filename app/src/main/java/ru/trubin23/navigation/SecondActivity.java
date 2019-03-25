package ru.trubin23.navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity implements
        Fragment4.OnFragment4Listener,
        Fragment5.OnFragment5Listener {

    NavController mNavController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    @Override
    public void onFragment4NextClick() {
        mNavController.navigate(R.id.fragment5);
    }

    @Override
    public void onFragment4BackClick() {

    }

    @Override
    public void onFragment5NextClick() {

    }

    @Override
    public void onFragment5BackClick() {
        mNavController.popBackStack();
    }
}
