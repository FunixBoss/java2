package main;

import bll.MethodsBLL;
import dao.MethodsDAL;

public class Program {
	public static void main(String[] args) {
		MethodsBLL.methodsBLL();
		MethodsDAL.methodsDAL();
		MethodsPL.methodsPL();
	}
}
