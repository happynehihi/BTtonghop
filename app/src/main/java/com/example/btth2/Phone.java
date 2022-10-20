package com.example.btth2;

public class Phone {
    private String Phone;
    private int Hinh;

    public Phone(String phone, int hinh) {
        Phone = phone;
        Hinh = hinh;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
