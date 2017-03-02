package xyz.nobu.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by nobu on 3/1/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
