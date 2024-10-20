package com.springCalculator.demo;

public class StudentDetails
{
    private int sid;
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
