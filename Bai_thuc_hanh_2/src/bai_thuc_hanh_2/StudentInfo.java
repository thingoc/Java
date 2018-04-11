/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thuc_hanh_2;

/**
 *
 * @author USER
 */
public class StudentInfo {
    private int STT;
    private String HoTen;
    private String Gioitinh;
    private String Namsinh;
    
    //STT
    public int getSTT(){
        return this.STT;
    }
    
    public void setSTT(int STT){
        this.STT=STT;
    }
    
    //HoTen
    public String getHoTen(){
        return this.HoTen;
    }
    
    public void setHoTen(String HoTen){
        this.HoTen=this.HoTen;
    }
    
    //NamSinh
    public String getNamSinh(){
        return this.Namsinh;
    }
    
    public void setNamSinh(String NamSinh){
        this.Namsinh=Namsinh;
    }
    
    //GioiTinh
    public String getGioiTinh(){
        return this.Gioitinh;
    }
    
    public void setGioiTinh(String Gioitinh){
        this.Gioitinh=Gioitinh;
    }
    
}
