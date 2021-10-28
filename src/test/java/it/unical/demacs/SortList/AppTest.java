package it.unical.demacs.SortList;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	public static MyListUtil listObj;
	
	@BeforeClass
	public static void init() {
		listObj=new MyListUtil();
	}
	
	@Before
	public void startTime() {
		System.out.println("Start time: " + DateTime.now());
	}
	
	@After
	public void endTime() {
		System.out.println("End time: " + DateTime.now());
	}
	
	@Test
	public void myListUtilTest() {
		List<Integer> listNotOrd=new ArrayList<Integer>();
		List<Integer> listOrd=new ArrayList<Integer>();
		
		//TEST 1: ordine crescente corretto
		for (int i=0 ; i<5;i++)
			listOrd.add(i);
		for (int i=4;i>=0;i--)
			listNotOrd.add(i);
		assertEquals(listOrd,listObj.sort(listNotOrd, 0));
		
		listOrd.clear();
		listNotOrd.clear();
		//TEST 2: ordine crescente non corretto
		for (int i=0 ; i<5;i++)
			listOrd.add(i);
		for (int i=5;i>=1;i--)
			listNotOrd.add(i);
		assertEquals(listOrd,listObj.sort(listNotOrd, 0));
		
		listOrd.clear();
		listNotOrd.clear();
		//TEST 3: ordine decrescente corretto
		for (int i=4 ; i>=0;i--)
			listOrd.add(i);
		for (int i=0;i<5;i++)
			listNotOrd.add(i);
		assertEquals(listOrd,listObj.sort(listNotOrd, 1));
		
		listOrd.clear();
		listNotOrd.clear();
		//TEST 4: ordine decrescente non corretto
		for (int i=4 ; i>=0;i--)
			listOrd.add(i);
		for (int i=1;i<6;i++)
			listNotOrd.add(i);
		assertEquals(listOrd,listObj.sort(listNotOrd, 0));
	}
}
