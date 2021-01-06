package com.nasus.mongodb.util;

import com.nasus.mongodb.requestinfo.Head;

/**
 * Created by Royal on 2020/5/15
 */
public class CheckKeyUtil {
    public static String  getKey(Head requestHead){
        String syscode=requestHead.getSys_code();
        String appkeymd5=requestHead.getAppkeymd5();
        String timetick=requestHead.getTime_tick();
        String servicetype=requestHead.getService_type();

        int s=0;
        if(syscode==null)syscode="";
        char[] syscodeChar=syscode.toCharArray();
        for (int i = 0; i < syscodeChar.length; i++) {
            s=s+(int)syscodeChar[i];
        }
        s=s+39;

        if(appkeymd5==null)appkeymd5="";
        char[] appkeymd5Char=appkeymd5.toCharArray();
        for (int j = 0; j < appkeymd5Char.length; j++) {
            s=s+(int)appkeymd5Char[j];
        }
        s=s+39;

        if(timetick==null)timetick="";
        char[] timetickChar=timetick.toCharArray();
        for (int j = 0; j < timetickChar.length; j++) {
            s=s+(int)timetickChar[j];
        }
        s=s+39;

        if(servicetype==null)servicetype="";
        char[] servicetypeChar=servicetype.toCharArray();
        for (int j = 0; j < servicetypeChar.length; j++) {
            s=s+(int)servicetypeChar[j];
        }
        s=s+39;

        s = ((s % 999) * (s % 2184)) % 9999;

        return String.valueOf(s);
    }


    public static void main(String[] args) {

        Head requestHead=new Head();
        requestHead.setAppkeymd5("139EBC8D9678D2DE7CDDC5FC80A578F2");
        //42a27170bf3c0bb0198b9e164e632774 ADVANCECHARGE v7core 9031
        // 32a27170bf3c0bb0198b9e164e632774
        //a275da12b71ab5a1bd4218175de316f8 BATCHBACKTAX  finarp 2880
        //139EBC8D9678D2DE7CDDC5FC80A578F2 ADVANCECHARGE v7core 6084
//        head.setKey();
        requestHead.setService_type("ADVANCECHARGE");
        requestHead.setSys_code("v7core");
//        head.setTime_tick("1533030262000");
        System.out.println(CheckKeyUtil.getKey(requestHead));
    }
}
