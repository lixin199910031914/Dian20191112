package com.bawei.dian20191112.loginuser.contract;

import com.bawei.dian20191112.base.mvp.IBasePresenter;
import com.bawei.dian20191112.entity.LoginEntity;
import com.bawei.dian20191112.entity.RegisterEntity;

public interface LoginContract {
    interface Iview{
        void  onRegisterCheng(RegisterEntity registerEntity);
        void onLoginCheng(LoginEntity loginEntity);
        void onShiBai(String meg);
    }
    abstract class Ipresenter extends IBasePresenter{
        public abstract void  getRegisterData(String phone, String pwd);
        public abstract void  getLoginData(String phone, String pwd);
    }
    interface Imodel{
        void  getReig(String phone ,String pwd,ICallBack iCallBack);
        interface ICallBack{
            void  onRegisterCheng(RegisterEntity registerEntity);
            void onLoginCheng(LoginEntity loginEntity);
            void onShiBai(String meg);
        }
    }
}
