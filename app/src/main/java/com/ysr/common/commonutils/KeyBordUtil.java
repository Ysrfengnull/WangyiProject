package com.ysr.common.commonutils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/** 输入框弹出管理
 *  Created by ysr on 2017/2/3 上午10:17.
 *  邮箱 ysr200808@163.com
 */

public class KeyBordUtil {
   /**
    * 显示和隐藏软键盘 View ： EditText、TextView isShow : true = show , false = hide
    *
    * @param context
    * @param view
    * @param isShow
    */
   public static void popSoftKeyboard(Context context, View view,
                                      boolean isShow) {
       InputMethodManager imm = (InputMethodManager) context
               .getSystemService(Context.INPUT_METHOD_SERVICE);
       if (isShow) {
           view.requestFocus();
           imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
       } else {
           imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
       }
   }

   /**
    * 显示软键盘
    *
    * @param view
    */
   public static void showSoftKeyboard(View view) {
       Context context = view.getContext();
       InputMethodManager imm = (InputMethodManager) context
               .getSystemService(Context.INPUT_METHOD_SERVICE);
       view.setFocusable(true);
       view.setFocusableInTouchMode(true);
       view.requestFocus();
       imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
   }

   /**
    * 隐藏软键盘
    *
    * @param view
    */
   public static void hideSoftKeyboard(View view) {
       Context context = view.getContext();
       InputMethodManager imm = (InputMethodManager) context
               .getSystemService(Context.INPUT_METHOD_SERVICE);
       imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
   }

}
