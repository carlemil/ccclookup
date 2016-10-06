package se.kjellstrand.worldbankdata;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ViewModelActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        se.kjellstrand.worldbankdata.databinding.ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(mainViewModel);
    }

    @Override
    protected ViewModel createViewModel(ViewModel.State savedViewModelState) {
        mainViewModel = new MainViewModel(savedViewModelState);
        return mainViewModel;
    }

}
