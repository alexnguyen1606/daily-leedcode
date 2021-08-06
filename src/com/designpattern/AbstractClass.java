package com.designpattern;

import com.designpattern.templatemethod.Inteface;

import java.util.List;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:14 PM ,July 21,2021
 */
public  class AbstractClass<T> implements Inteface<T> {
    
    @Override
    public void print() {
    
    }
    public void print(Set<String> strSet) { }
    
    @Override
    public void callOut(T t) {
        if (t instanceof String){
      System.out.println(t);
      
        }
    }
    
    public void priint(List<String> lis){
    
    }

  public static void main(String[] args) {
    AbstractClass<String> abc = new AbstractClass<>();
    abc.callOut("xin chào");
  }
}
