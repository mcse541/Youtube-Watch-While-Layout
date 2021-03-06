package com.ttinc.android.apps.watchwhilelayout.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ttinc.android.apps.watchwhilelayout.R;
import com.ttinc.android.apps.watchwhilelayout.utils.Dataset;

/**
 * Created by thangn on 2/26/17.
 */
public class MetaInfoFragment extends Fragment {
    private TextView mTitleView;
    private TextView mSubTitleView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.meta_info_fragment, container, false);
        this.mTitleView = (TextView) rootView.findViewById(R.id.li_title);
        this.mSubTitleView = (TextView) rootView.findViewById(R.id.li_subtitle);
        return rootView;
    }

    public void updateItem(Dataset.DatasetItem item) {
        if (this.mTitleView != null) {
            this.mTitleView.setText(item.title);
            this.mSubTitleView.setText(item.subtitle);
        }
    }
}
