package jfh.util.demo;

import android.content.Context;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

/**
 * demos methods.
 * <p/>
 * AnimatorRes ：指出一个integer的参数，成员变量，或方法返回值是一个animator资源的引用。<br/>
 * AnimRes：指出一个integer的参数，成员变量，或方法返回值是一个anim资源的引用。<br/>
 * AnyRes：指出一个integer的参数，成员变量，或方法返回值是一个任意资源类型的引用。<br/>
 * ArrayRes：指出一个integer的参数，成员变量，或方法返回值是一个array资源类型的引用。<br/>
 * AttrRes：指出一个integer的参数，成员变量，或方法返回值是一个attr资源的引用。<br/>
 * BoolRes：指出一个integer的参数，成员变量，或方法返回值是一个boolean资源的引用。<br/>
 * ColorRes：指出一个integer的参数，成员变量，或方法返回值是一个color资源的引用。<br/>
 * DimenRes：指出一个integer的参数，成员变量，或方法返回值是一个dimen资源的引用。<br/>
 * DrawableRes：指出一个integer的参数，成员变量，或方法返回值是一个drawable资源的引用（包括@mipmap）。<br/>
 * FractionRes：指出一个integer的参数，成员变量，或方法返回值是一个fraction资源的引用。<br/>
 * IdRes：指出一个integer的参数，成员变量，或方法返回值是一个id资源的引用。<br/>
 * IntegerRes：指出一个integer的参数，成员变量，或方法返回值是一个integer资源的引用。<br/>
 * InterpolatorRes：指出一个integer的参数，成员变量，或方法返回值是一个interpolator资源的引用。<br/>
 * LayoutRes：指出一个integer的参数，成员变量，或方法返回值是一个layout资源的引用。<br/>
 * MenuRes：指出一个integer的参数，成员变量，或方法返回值是一个menu资源的引用。<br/>
 * PluralsRes：指出一个integer的参数，成员变量，或方法返回值是一个plurals资源的引用。<br/>
 * RawRes：指出一个integer的参数，成员变量，或方法返回值是一个raw资源的引用。<br/>
 * StringRes：指出一个integer的参数，成员变量，或方法返回值是一个string资源的引用。<br/>
 * StyleableRes：指出一个integer的参数，成员变量，或方法返回值是一个styleable资源的引用。<br/>
 * StyleRes：指出一个integer的参数，成员变量，或方法返回值是一个style资源的引用。<br/>
 * TransitionRes：指出一个integer的参数，成员变量，或方法返回值是一个transition资源的引用。<br/>
 * XmlRes：指出一个integer的参数，成员变量，或方法返回值是一个xml资源的引用。<br/>
 */
public class Util {

    // NonNull demo method.
    public static void printNonNull(@NonNull Context context, @NonNull String content) {

    }

    // Nullable demo method.
    public static void printNullable(@Nullable Context context, @Nullable String content) {

    }

    public static void printStringRes(int str) {

    }

    public static void printFloatRange(@FloatRange(from = 0.0, to = 1.0) double range) {

    }

    public static void printIntRange(@IntRange(from = 0, to = 10) double range) {

    }

    @UiThread
    public static void printUIThread() {

    }

    public static void setPayVia(@PayManager.PayVia int payVia) {

    }
}
