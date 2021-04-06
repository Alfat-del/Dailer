package id.prodigy.dailer;

import java.sql.Time;
import java.util.Date;

public class KegiatanTugas extends Kegiatan {
    private String kategoriTugas;

    public String getKategoriTugas() {
        return kategoriTugas;
    }

    public void setKategoriTugas(String kategoriTugas) {
        this.kategoriTugas = kategoriTugas;
    }

    public KegiatanTugas(String pelajaran, String topik, String tanggalDeadline, String kategoriTugas) {
        super(pelajaran, topik, tanggalDeadline);
        this.kategoriTugas = kategoriTugas;
    }


}
