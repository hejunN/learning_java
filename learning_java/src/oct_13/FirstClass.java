package oct_13;

import java.util.*;


class Shape{
	protected String name;
	protected int edges;
	
	Shape(){
		name="Shape";
		edges=0;
	}
	Shape(String sname){
		name=sname;
		edges=0;
	}
	Shape(String sname,int iedge){
		name=sname;
		edges=iedge;
	}
	
	public void show() {
		System.out.print("shape name = "+name+"\nShape have "+edges+" edges\n");
	}
	
	
}


class Three extends Shape{
	Three(String s,int d){
		super(s,d);
	}
	public void show() {
		super.show();
		System.out.print("Three is showing...\n");
	}
}

class Four extends Shape{
	Four(String s,int d){
		super(s, d);
	}
	public void show() {
		super.show();
		System.out.print("Four is showing...\n");
	}
}


public class FirstClass {
	
	public static void main(String args[]) {
		Shape a=new Three("Three",3);
		Shape b=new Four("Four",4);
		a.show();
		b.show();
	}

}
