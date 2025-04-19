package com.package1;

import com.package2.Test;
//import com.package2.Test1;

public class Main {

	public static void main(String[] args) {
		com.package1.Test1 t = new com.package1.Test1();
		t.getData();
		
		Test t1 = new Test();
		com.package2.Test1 t2 = new com.package2.Test1();
		t2.print();
	}

}
