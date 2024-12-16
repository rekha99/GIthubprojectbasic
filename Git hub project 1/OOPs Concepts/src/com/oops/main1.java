package com.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class main1()

{
Public Static void main(String[] args)
{
    System.out.println("New class");
    ArrayList <String> arrayList =new ArrayList<>();
    arrayList.add("Kishu");
    arrayList.add("rekha");
    Iterator itr =arrayList.iterator();
    while(itr.hasNext())

    {
        System.out.println(itr.hasNext());
    }}
}
