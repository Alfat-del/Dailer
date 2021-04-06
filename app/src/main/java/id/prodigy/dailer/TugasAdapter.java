package id.prodigy.dailer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TugasAdapter extends RecyclerView.Adapter<TugasAdapter.TugasViewHolder> {
    public ArrayList<KegiatanTugas> listTugas;

    public TugasAdapter(ArrayList<KegiatanTugas> listTugas) {
        this.listTugas = listTugas;
    }

    @NonNull
    @Override
    public TugasAdapter.TugasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tugas, parent, false);

        return new TugasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TugasAdapter.TugasViewHolder holder, int position) {
        // Gambar belum
        holder.tvPelajaran.setText(normalizeString(listTugas.get(position).getPelajaran(), 33));
        holder.tvTopik.setText(listTugas.get(position).getTopik());
        holder.tvKategori.setText(listTugas.get(position).getKategoriTugas());
        holder.tvTanggalDeadline.setText(listTugas.get(position).getTanggalDeadline());
    }


    @Override
    public int getItemCount() {
        return (listTugas == null) ? 0 : listTugas.size();
    }

    class TugasViewHolder extends RecyclerView.ViewHolder {
        private TextView tvPelajaran, tvTopik, tvKategori, tvTanggalDeadline;

        public TugasViewHolder(View view) {
            super(view);
            tvPelajaran = view.findViewById(R.id.tv_pelajaran);
            tvKategori = view.findViewById(R.id.tv_kategori);
            tvTopik = view.findViewById(R.id.tv_topik);
            tvTanggalDeadline = view.findViewById(R.id.tv_tanggaldeadline);
        }
    }

    private String normalizeString(String s, int maxLength) {
        return (s.length() >= maxLength) ? (s.substring(0, maxLength) + "...") : s;
    }

}

