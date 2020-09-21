package com.example.application.myapplication;

public class MyItem  {
    private int image1 ;
    private String text1 , text2 , text3 ,text4 , text5 ;
    private int image2 ;


   public MyItem (int i1 , int i2 , int i3 ,int i4 ,int i5 , String t1 ,String t2 , String t3 , String t4 ,String t5 ){
       image1 = i1;
       image2 = i2;
       text1 = t1 ;
       text2 = t2;
       text3 = t3 ;
       text4 = t4 ;
       text5 = t5;
   }



    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }


    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }
}
