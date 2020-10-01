package com.example.interaksipengguna;

import android.os.Parcel;

public class Parcelable implements android.os.Parcelable {
    String nama;

    public Parcelable(String nama, String nomerInduk, String jenisKelamin, String tanggalLahir, String jurusan) {
        this.nama = nama;
        this.nomerInduk = nomerInduk;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.jurusan = jurusan;
    }

    String nomerInduk;
    String jenisKelamin;
    String tanggalLahir;
    String jurusan;

    public String getNama() {
        return nama;
    }

    public String getNomerInduk() {
        return nomerInduk;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getJurusan() {
        return jurusan;
    }

    protected Parcelable(Parcel in) {
        nama = in.readString();
        nomerInduk = in.readString();
        jenisKelamin = in.readString();
        tanggalLahir = in.readString();
        jurusan = in.readString();
    }

    public static final Creator<Parcelable> CREATOR = new Creator<Parcelable>() {
        @Override
        public Parcelable createFromParcel(Parcel in) {
            return new Parcelable(in);
        }

        @Override
        public Parcelable[] newArray(int size) {
            return new Parcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(nomerInduk);
        dest.writeString(jenisKelamin);
        dest.writeString(tanggalLahir);
        dest.writeString(jurusan);
    }
}
