package id.prodigy.dailer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class UlanganFragment extends Fragment {
    TextView textView;

    public UlanganFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ulangan, container, false);
        textView = view.findViewById(R.id.textFragment2);
        textView.setText("Hore! Tidak ada ulangan");
        return view;
    }
}