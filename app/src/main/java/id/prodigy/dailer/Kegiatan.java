package id.prodigy.dailer;

import java.util.Date;

public class Kegiatan {
    private String pelajaran;
    private String topik;
    private String tanggalDeadline;

    public Kegiatan(String pelajaran, String topik, String tanggalDeadline) {
        this.pelajaran = pelajaran;
        this.topik = topik;
        this.tanggalDeadline = tanggalDeadline;
    }


    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    public String getTanggalDeadline() {
        return tanggalDeadline;
    }

    public void setTanggalDeadline(String tanggalDeadline) {
        this.tanggalDeadline = tanggalDeadline;
    }
}
