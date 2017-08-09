/**
 * 
 */
package com.nancy.duotai.src;

/**
 * @author nan
 * @date Aug 8, 2017
 * @description TODO
 */
public class Person implements IPerson{

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#eat()
     */
    @Override
    public void eat() {
        System.out.println("人吃饭");        
        
    }

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#walk()
     */
    @Override
    public void walk() {
        System.out.println("人走路");        
        
    }

    /* (non-Javadoc)
     * @see com.nancy.duotai.src.IPerson#sleep()
     */
    @Override
    public void sleep() {
        System.out.println("人睡觉");        
        
    }

}
