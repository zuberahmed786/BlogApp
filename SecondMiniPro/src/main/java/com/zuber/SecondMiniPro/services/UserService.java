package com.zuber.SecondMiniPro.services;

import com.zuber.SecondMiniPro.binding.LoginForm;
import com.zuber.SecondMiniPro.binding.SignUpForm;
import com.zuber.SecondMiniPro.binding.UnlockForm;
import org.hibernate.bytecode.enhance.spi.UnloadedClass;

public interface UserService {

    public String login(LoginForm form);

    public boolean signUp(SignUpForm form);

    public boolean unlockAcc(UnlockForm form);

    public String forgotPsw(String email);
}
