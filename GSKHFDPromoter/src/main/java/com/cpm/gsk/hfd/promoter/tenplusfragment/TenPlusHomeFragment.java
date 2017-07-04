package com.cpm.gsk.hfd.promoter.tenplusfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cpm.gsk.hfd.promoter.R;
import com.cpm.gsk.hfd.promoter.fragment_6.BoostFragment;
import com.cpm.gsk.hfd.promoter.fragment_6.CutOfChilFragment;

public class TenPlusHomeFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button mostTime_btn, Sometime_btn, never_btn;
    FragmentManager fragmentManager;

    public TenPlusHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentManager = getActivity().getSupportFragmentManager();
        View view = inflater.inflate(R.layout.fragment_ten_plus_home, container, false);
        mostTime_btn = (Button) view.findViewById(R.id.most_btn);
        Sometime_btn = (Button) view.findViewById(R.id.sometym_btn);
        never_btn = (Button) view.findViewById(R.id.never_btn);
        mostTime_btn.setOnClickListener(this);
        Sometime_btn.setOnClickListener(this);
        never_btn.setOnClickListener(this);
       /* Button button = (Button) view.findViewById(R.id.nxt_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NineOutFragment fragment = new NineOutFragment();
                fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
            }
        });*/
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.most_btn:
                AllProductFragment boostFragment = new AllProductFragment();
                fragmentManager.beginTransaction().replace(R.id.container, boostFragment).addToBackStack(String.valueOf(fragmentManager.getFragments()))
                        .commit();
                break;
            case R.id.sometym_btn:
                AllProductFragment boostFragment1 = new AllProductFragment();
                fragmentManager.beginTransaction().replace(R.id.container, boostFragment1).addToBackStack(String.valueOf(fragmentManager.getFragments()))
                        .commit();
                break;
            case R.id.never_btn:
                AllProductFragment fragment = new AllProductFragment();
                fragmentManager.beginTransaction().replace(R.id.container, fragment).addToBackStack(String.valueOf(fragmentManager.getFragments()))
                        .commit();
                break;
        }
    }
}
