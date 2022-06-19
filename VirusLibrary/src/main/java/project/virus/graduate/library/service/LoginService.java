package project.virus.graduate.library.service;

import project.virus.graduate.library.entity.reloginEntity;

/**
 * 登录接口
 */
public interface LoginService {
 

    public int loginValidator(String account, String password);
   // public void downloadLoginLog(HttpServletResponse response);
    
    //声明登录参数以及方法
    public reloginEntity relogin(String account, String password);
    
    public reloginEntity emailLogin(String email,String password);
}
