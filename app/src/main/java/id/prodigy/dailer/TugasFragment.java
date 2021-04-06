package id.prodigy.dailer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TugasFragment extends Fragment {
    RecyclerView recyclerView;
    private TugasAdapter tugasAdapter;
    private ArrayList<KegiatanTugas> tugasArrayList;

    public TugasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tugas, container, false);

        addData();
        tugasAdapter = new TugasAdapter(tugasArrayList);

        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tugasAdapter);
        return view;
    }
    public void addData() {
        tugasArrayList = new ArrayList<>();
        tugasArrayList.add(new KegiatanTugas(
                "Aljabar Linear",
                "Implementasi regresi linear",
                "01-01-2021",
                "Tugas Individu"));

        tugasArrayList.add(new KegiatanTugas(
                "Pemrograman Berorientasi Objek - TE",
                "Event-driven programming",
                "01-01-2021",
                "Tugas Individu"));

        tugasArrayList.add(new KegiatanTugas(
                "Proyek Perangkat Lunak 3",
                "Dokumen testing",
                "02-01-2021",
                "Tugas Kelompok"));

        tugasArrayList.add(new KegiatanTugas(
                "Kewirausahaan",
                "Selling product",
                "03-01-2021",
                "Tugas Individu"));

        tugasArrayList.add(new KegiatanTugas(
                "Database - TE",
                "Normalisasi",
                "04-01-2021",
                "Tugas Individu"));

        tugasArrayList.add(new KegiatanTugas(
                "Database - PR",
                "PL/SQL",
                "04-01-2021",
                "Tugas Individu"));
        tugasArrayList.add(new KegiatanTugas(
                "Pengantar Rekayasa Perangkat Lunak - PR",
                "Macam-macam SDLC",
                "04-01-2021",
                "Tugas Kelompok"));

        tugasArrayList.add(new KegiatanTugas(
                "Pengantar Rekayasa Perangkat Lunak - TE",
                "Data flow diagram",
                "05-01-2021",
                "Tugas Kelompok"));

        tugasArrayList.add(new KegiatanTugas(
                "Pemrograman Berorientasi Objek - PR",
                "Unit testing",
                "06-01-2021",
                "Tugas Individu"));

        tugasArrayList.add(new KegiatanTugas(
                "Proyek Perangkat Lunak 3",
                "Logbook",
                "07-01-2021",
                "Tugas Kelompok"));
    }
}