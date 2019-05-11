package com.mindorks.bootcamp.learndagger.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent;
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    @Inject
    HomeViewModel homeViewModel;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDependencies();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.textData);
        textView.setText(homeViewModel.fetchData());
    }

    public void getDependencies() {
        DaggerFragmentComponent
                .builder()
                .applicationComponent(((MyApplication)(getActivity().getApplicationContext())).applicationComponent)
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(this);

    }
}
