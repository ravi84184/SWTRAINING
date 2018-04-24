package com.nikpatel.digitalgrow.Validation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;


import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Arati on 2/6/2016.
 */

public class CommonUtil {


    public final static Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9-]+[_A-Za-z0-9-]*(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public final static Pattern INVALID_EMAIL_PATTERN = Pattern.compile("^[0-9-]+[_0-9-]*(\\.[_0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public final static Pattern PASSWORD_VALIDATION = Pattern.compile("[A-Za-z0-9\\#\\'\\*\\+\\-\\:\\=\\@\\^\\_\\`]+$");
    public final static Pattern FIRST_LAST_NAME_PATTERN = Pattern.compile("^[A-Za-z]+[A-Za-z0-9-\\.\\-\\_\\']*$");

//INVALID_EMAIL_PATTERN.matcher(email).matches() &&

    public static boolean checkEmail(String email) {
        if (!INVALID_EMAIL_PATTERN.matcher(email).matches() && EMAIL_PATTERN.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkFirstLastName(String name) {
        return FIRST_LAST_NAME_PATTERN.matcher(name).matches();
    }

    public static boolean checkPassword(String password) {
        return PASSWORD_VALIDATION.matcher(password).matches();
    }




    public static boolean isNullString(String string) {
        try {
            if (string.trim().equalsIgnoreCase("null") || string.trim() == null || string.trim().length() < 0 || string.trim().equals("")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return true;
        }
    }




/*
    public final static Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$");

    public final static Pattern EMAIL_ADDRESS_PATTERN_1 = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public final static Pattern PASSWORD_VALIDATION_1 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z*\\d]).{6,20})");
    public final static Pattern WEB_URL_PATTERN = Patterns.WEB_URL;
    public final static Pattern NUMERIC_PATTERN = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
*/


}
