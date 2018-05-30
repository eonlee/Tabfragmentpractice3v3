package com.example.eon.tabfragmentpractice3.Mainfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.eon.tabfragmentpractice3.R;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab10Fragment;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab5Fragment;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab6Fragment;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab7Fragment;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab8Fragment;
import com.example.eon.tabfragmentpractice3.Subfragment.Tab9Fragment;

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);

        /**
         * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
         * one of the sections/tabs/pages.
         */
        class SectionsPagerAdapter extends FragmentPagerAdapter {

            public SectionsPagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        Tab5Fragment tab5 = new Tab5Fragment();
                        return tab5;
                    case 1:
                        Tab6Fragment tab6 = new Tab6Fragment();
                        return tab6;
                    case 2:
                        Tab7Fragment tab7 = new Tab7Fragment();
                        return tab7;
                    case 3:
                        Tab8Fragment tab8 = new Tab8Fragment();
                        return tab8;
                    case 4:
                        Tab9Fragment tab9 = new Tab9Fragment();
                        return tab9;
                    case 5:
                        Tab10Fragment tab10 = new Tab10Fragment();
                        return tab10;
                    default:
                        return null;

                }
            }

            @Override
            public int getCount() {
                // Show 4 total pages.
                return 6;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Tab5";

                    case 1:
                        return "Tab6";

                    case 2:
                        return "Tab7";

                    case 3:
                        return "Tab8";

                    case 4:
                        return "Tab9";

                    case 5:
                        return "Tab10";
                }
                return null;

            }
        }        return view;
    }
}