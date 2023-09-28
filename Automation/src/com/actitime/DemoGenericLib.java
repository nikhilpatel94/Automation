package com.actitime;

import java.io.IOException;

import com.Lovely.Generic.FileLib;

public class DemoGenericLib {
	public static void main(String[] args) throws IOException {
		FileLib f =new FileLib();
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getExcelData("testscript", 1, 1));
		
	}

}
