package project.virus.graduate.library.controller;
 

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.reloginEntity;
import project.virus.graduate.library.exception.BusinessFailureException;
import project.virus.graduate.library.requestdto.EmailForm;
import project.virus.graduate.library.requestdto.LoginForm;
import project.virus.graduate.library.service.LoginService;

/**
 * 登录相关控制层
 */
@RestController
@RequestMapping("/login/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    
    //可以反馈登录
    @PostMapping("relogin")
    public reloginEntity relogin(@RequestBody @Valid LoginForm form, Errors errors) {
        if (errors.hasErrors()) {
        	throw new BusinessFailureException(errors);
        }
        return loginService.relogin(form.getAccount(), form.getPassword());
    }
    @PostMapping("emailLogin")
    public reloginEntity emailLogin(@RequestBody @Valid EmailForm form) {

    	return loginService.emailLogin(form.getEmail(), form.getPassword());
    }
    
    //用户验证是否成功
    @PostMapping("validator")
    public int loginValidator(@RequestBody @Valid LoginForm form) {

        return loginService.loginValidator(form.getAccount(), form.getPassword());
    }
//    @GetMapping("/log")
//    public List<LoglogEntity> log() {
//    	return loginService.log();
//    }
//    @GetMapping("/downloadCsv")
//    public void downloadCsv(HttpServletResponse response) {
//        this.setResponse(response);
//        loginService.downloadLoginLog(response);
//    }
//  
//  private void setResponse(HttpServletResponse response) {
//        response.setCharacterEncoding("UTF8");
//        response.setContentType("text/csv");
//        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=log.csv");
//  }
    
}