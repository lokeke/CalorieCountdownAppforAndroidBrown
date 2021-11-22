package ese.com.caloriecountdownappforandroidbrown;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BBC_new_app_fragment_viewmodel extends Fragment {

    private BBCNewAppFragmentViewmodelViewModel mViewModel;

    public static BBC_new_app_fragment_viewmodel newInstance() {
        return new BBC_new_app_fragment_viewmodel();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.b_b_c_new_app_fragment_viewmodel_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BBCNewAppFragmentViewmodelViewModel.class);
        // TODO: Use the ViewModel
    }

}