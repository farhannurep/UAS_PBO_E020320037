package id.ac.poliban.mi.vb.e020320037.wisataappe020320037.decoration;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public interface OnClickLayoutMarginItemListener {
    void onClick(Context context, View v, int position, int spanIndex, RecyclerView.State state);
}