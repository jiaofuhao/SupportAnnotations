package jfh.util.demo;

import android.support.annotation.IntDef;

/**
 * @author Jiao Fuhao(阿焦)
 * @date 2016/11/30 下午 4:05
 * @email jiaofuhao2012@163.com
 */
public class PayManager {

    public static final int ALIPAY = 0;
    public static final int WECHATPAY = 1;

    @IntDef({ALIPAY, WECHATPAY})
    public @interface PayVia {
    }
}
