/**
 * 
 */
package com.nancy.adapter.users;

/**
 * @author nan
 * @date Aug 8, 2017
 * @description TODO
 */
public class UserInfo implements IUserInfo {
    String address = null;
    String phone = null;
    
    /**
     * @param string
     * @param string2
     * @param string3
     */

    public UserInfo(String name, String address, String phone){
     //this.name=name;
     this.address=address;
     this.phone=phone;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone(){
        return this.phone;
    }

}
