package project.virus.graduate.library.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.UserEntity;
import project.virus.graduate.library.entity.reloginEntity;
import project.virus.graduate.library.repository.LoginRepository;
import project.virus.graduate.library.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

//    private static final Object CSV_COLUMN_SEPARATOR = ",";
//
//	private static final Object CSV_RN = "\r\n";

	@Autowired
	private LoginRepository loginRepository;

    @Override
    public int loginValidator(String account, String password) {
    	
    	return loginRepository.loginValidator(account, password);
    }
//    @Override
//    public List<LoglogEntity> log() {
//    	return loginLogRepository.log();
//    }
//    @Override
//    public void downloadLoginLog(HttpServletResponse response) {
//        
//        List<LoglogEntity> data = loginLogRepository.log();
//        StringBuilder s = new StringBuilder();
//        s.append("用户ID,用户名,权限,登录时间").append(CSV_RN);
//        if(data != null) {
//          for (LoglogEntity log : data) {
//            s.append(log.getUserId()).append(CSV_COLUMN_SEPARATOR);
//            s.append(log.getUserName()).append(CSV_COLUMN_SEPARATOR);
//            s.append(1 == log.getUserType()?"管理者":"用户").append(CSV_COLUMN_SEPARATOR);
//            s.append(log.getLoginDateTime()).append(CSV_RN);
//          }
//        }
//        
//        try {
//          response.getOutputStream().write(s.toString().getBytes("UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//        } catch (IOException e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//        }
//      }
    
    @Override
    public reloginEntity relogin(String account, String password) {
        // 注入 
       UserEntity  user = loginRepository.relogin(account);

        reloginEntity reloginentity = new reloginEntity() ;
        
        if(user == null) {
        	//这是没有用户的情况
        	reloginentity.setStatus("用户不存在");;
        	return  reloginentity;
        			
        }else {
        	//这是账户找到了
        	if( password.equals(user.getPassword() )) {
        		//密码正确
        		  BeanUtils.copyProperties(user, reloginentity);
        		  reloginentity.setStatus("该用户正常");
        		  return reloginentity;
        		  
        	}else {
        		//密码不正确
        		reloginentity.setStatus("输入的密码错误");
                return reloginentity;
        	}

        }
    }   
    @Override
    public reloginEntity emailLogin(String email,String password) {
        UserEntity  user = loginRepository.emailLogin(email);

        reloginEntity reloginentity = new reloginEntity() ;
        
        if(user == null) {
        	//这是没有用户的情况
        	reloginentity.setStatus("用户不存在");;
        	return  reloginentity;
        			
        }else {
        	//这是账户找到了
        	if( password.equals(user.getPassword() )) {
        		//密码正确
        		  BeanUtils.copyProperties(user, reloginentity);
        		  reloginentity.setStatus("该用户正常");
        		  return reloginentity;
        		  
        	}else {
        		//密码不正确
        		reloginentity.setStatus("输入的密码错误");
                return reloginentity;
        	}

        }
    }
}
