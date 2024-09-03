package com.gcp.dp;
public class SingletonObj implements Cloneable{
	private static SingletonObj singletonObj;
	
	private SingletonObj(){}
	
	public static SingletonObj getInstance(){
		if(singletonObj==null){
			synchronized(SingletonObj.class){
				if(singletonObj==null){
					singletonObj = new SingletonObj();
				}
			}
		}
		return singletonObj;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
    }
}
