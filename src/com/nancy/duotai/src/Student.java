/**
 * 
 */
package com.nancy.duotai.src;

/**
 * @author nan
 * @date Aug 8, 2017
 * @description TODO
 */
public class Student extends Person{

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#eat()
     */
    @Override
    public void eat() {
        System.out.println("学生吃饭");        
    }

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#walk()
     */
    @Override
    public void walk() {
        System.out.println("学生走路");        
        
    }

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#sleep()
     */
    @Override
    public void sleep() {
        System.out.println("学生睡觉");        
        
    }
    
    public void study(){
        System.out.println("学生要学习");
    }

}
