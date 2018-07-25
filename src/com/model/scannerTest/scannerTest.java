package com.model.scannerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerTest {
	public static void main(String[] args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		//回车作为分隔符
//		sc.useDelimiter("\n");
//		while(sc.hasNext()){
//			System.out.println(sc.next());
//		}
		
		File file=new File("E:\\wrokspace\\Test\\src\\com\\model\\a.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		
	}
}
