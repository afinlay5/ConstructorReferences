/*
Copyright (C) 2018 Adrian D. Finlay. All rights reserved.

Licensed under the MIT License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://opensource.org/licenses/MIT

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER INCLUDING AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
==============================================================================
**/

package src.main.java;

//Step #4 - Class making use of method reference with generics
public class ConstrRefGen {

	//Here is where the magic happens
	static <Ob, X, Y, Z> Ob factory (FuncInt <Ob, X, Y, Z> obj, X p1, Y p2,  Z p3) {
		return obj.func(p1,p2,p3);
	}

	//Main()
	public static void main (String [] args) {
		System.out.println();

		//Example #1
		FuncInt<Automobile<String, String, Integer>, String, String, Integer> auto_cons = Automobile<String, String, Integer>::new;
		Automobile<String, String, Integer> honda = factory(auto_cons, "Honda", "Accord", 2006);
		honda.what();
					
		//Example #2
		FuncInt<Plane, String, String, Integer> plane_cons = Plane::new;
		Plane cessna = factory(plane_cons, "Cessna", "Skyhawk", 172);
		cessna.what();
		
		System.out.println();
	}
}