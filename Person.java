  class Person {

 private int age;
 
 private int reg ;
 
 private String name;
 
 


public int  getAge() {
return this.age;
}

public void setAge (int  newAge) {

if(age <18){
	System.out.println("your are not 18");
} else {
this.age = newAge;
}
}


public int  getReg() {
return this.reg;
}
public void setReg (int  newReg) {

this.reg = newReg;

}


public String getName() {
return this.name;
}

public void  setName (String newName) {

this.name = newName ;

}

}

