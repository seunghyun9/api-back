package net.seunghyun.api.member.domain;/**
* packageName: net.seunghyun.api.member.domain
* fileName   : MemberDTO
* author     : seunghyun9
* date       : 2022-02-11
* desc       :
* ================================
*  DATE        AUTHOR        NOTE
* ================================
*  2022-02-11     seunghyun9    최초 생성
*/public class MemberDTO {

    private final static MemberDTO memberDTO = new MemberDTO();
    public MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}


    public String mem_Id;
    public String mem_Name;
    public int mem_Numberr;
    public String addr;
    public String phone1;
    public String phone2;
    public int height;
    public String debut_Date;

    public String getMem_Id() {
        return mem_Id;
    }

    public void setMem_Id(String mem_Id) {
        this.mem_Id = mem_Id;
    }

    public String getMem_Name() {
        return mem_Name;
    }

    public void setMem_Name(String mem_Name) {
        this.mem_Name = mem_Name;
    }

    public int getMem_Numberr() {
        return mem_Numberr;
    }

    public void setMem_Numberr(int mem_Numberr) {
        this.mem_Numberr = mem_Numberr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebut_Date() {
        return debut_Date;
    }

    public void setDebut_Date(String debut_Date) {
        this.debut_Date = debut_Date;
    }
}
