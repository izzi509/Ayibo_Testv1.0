package com.example.delva.ayibotest1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.delva.ayibotest1.fragments.BreakingFragment;
import com.example.delva.ayibotest1.fragments.BusinessFragment;
import com.example.delva.ayibotest1.fragments.SocialFragment;
import com.example.delva.ayibotest1.fragments.SportsFragment;

/**
 * Created by Delva on 8/20/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Breaking", "Business", "Social","Sports" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return BreakingFragment.newInstance(position + 1);
            case 1:
                return BusinessFragment.newInstance(position + 1);
            case 2:
                return SocialFragment.newInstance(position + 1);
            case 3:

                return SportsFragment.newInstance(position + 1);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}