package com.trkj.asms.utils;

public class Phonejiami {

    public String phoneSecrecy(String phoneNum){
        if(phoneNum != null && phoneNum.length() > 4){
            if(phoneNum.length() == 11){
                phoneNum = phoneNum.substring(0, 3) + "****" + phoneNum.substring(7, phoneNum.length());
            }else{
                phoneNum = phoneNum.substring(0,phoneNum.length()-1) + "*";
            }
        }
        return phoneNum;
    }

}
