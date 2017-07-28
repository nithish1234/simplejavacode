package com.ThisKeyword;

public class ThisKeyword {

String name ;
int roll;
int age;
ThisKeyword(String name , int roll , int age){
this.name=name;
this.roll=roll;
this.age=age;
System.out.println("the name is" +name+roll+age);
}
ThisKeyword(String namee){
this ("nithish",11,123);
	this.name=namee;
System.out.println("for testing" );
}
void display() {
	System.out.println(name + roll+age);
}	
public static void main(String[] args) {
//	ThisKeyword obj =new ThisKeyword();

//	ThisKeyword obj2=new ThisKeyword("zsdsd", 11, 13);
//	obj.display();
//	obj2.display();
}
}

