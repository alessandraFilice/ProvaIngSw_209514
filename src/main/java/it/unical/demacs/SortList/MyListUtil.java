package it.unical.demacs.SortList;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	public List<Integer> sort(List<Integer> list, int order){  
		if(order==0) {
			list.sort(new Comparator<Integer>(){
				@Override
				public int compare(Integer num1,Integer num2) {
					return (num1 - num2);
				}
			});
		}

		else{
			list.sort(new Comparator<Integer>(){
				@Override
				public int compare(Integer num1,Integer num2) {
					return (num2 - num1);
				}
			});
		}
		return list;
    }
	
}
