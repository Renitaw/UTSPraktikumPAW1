package com.customerhotel.customerhotel;

public class CustomerHotel {
    private String NO_KTP;
    private String Nama;
    private String Alamat;
    private int Nomor_kamar;
    private String informasiPembayaran;
    private String pesananMakanan;
    private Booking booking;

    public CustomerHotel(String noKTP, String nama, String alamat, int nomorKamar,
    String informasiPembayaran, String pesananMakanan,
    String checkInDate, String checkOutDate) {
        NO_KTP = noKTP;
        Nama = nama;
        Alamat = alamat;
        Nomor_kamar = nomorKamar;
        this.informasiPembayaran = informasiPembayaran;
        this.pesananMakanan = pesananMakanan;
        booking = new Booking(checkInDate, checkOutDate);
    }

    public void Customer_Hotel() {
        System.out.println("Info Tamu:");
        System.out.println("NO_KTP: " + NO_KTP);
        System.out.println("Nama: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Nomor_kamar: " + Nomor_kamar);
        booking.displayBookingInfo();
        Informasi_pembayaran();
        Pesanan_makanan();
    }

    public void Informasi_pembayaran() {
        System.out.println("Informasi Pembayaran: " + informasiPembayaran);
    }

    public void Pesanan_makanan() {
        System.out.println("Pesanan Makanan: " + pesananMakanan);
    }
}


