package com.amqtech.opensource.appintroexample.ui.mainTabs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.paolorotolo.appintroexample.R;

/**
 * Created by andrew on 11/17/16.
 */

public class CustomLayoutIntro extends Fragment {

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button demo = (Button) getView().findViewById(R.id.intro3);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity().getBaseContext(), com.amqtech.opensource.appintroexample.ui.mainTabs.intro.CustomLayoutIntro.class));
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_custom_layout_intro, container, false);
    }
}
