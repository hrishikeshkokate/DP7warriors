package com.constructors;

public class Movie 
{
 private int Id;
 private String name;
 private float rating;
 

Movie(int Id,String name,float rating)
{
	this.Id=Id;
	this.name=name;
	this.rating=rating;

}

public int getId()
{
	return Id;
}
public void setId(int Id)
{
	this.Id=Id;
}
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.name=name;
}
public float getrating()
{
return rating;	
}

public void setrating(float rating)
{
	this.rating=rating;
}

public String toString()
{
	return " Id "+ Id +" name "+ name +" rating "+ rating;
}
 
}
