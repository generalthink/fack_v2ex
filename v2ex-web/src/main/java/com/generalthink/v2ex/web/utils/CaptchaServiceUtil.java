package com.generalthink.v2ex.web.utils;

import java.awt.Color;
import java.awt.Font;

import com.octo.captcha.component.image.backgroundgenerator.GradientBackgroundGenerator;
import com.octo.captcha.component.image.color.SingleColorGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.NonLinearTextPaster;
import com.octo.captcha.component.image.wordtoimage.ComposedWordToImage;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.engine.GenericCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;
import com.octo.captcha.service.captchastore.FastHashMapCaptchaStore;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.octo.captcha.service.image.ImageCaptchaService;

public class CaptchaServiceUtil {

   
        private static ImageCaptchaService imageCaptchaService = new DefaultManageableImageCaptchaService(
                new FastHashMapCaptchaStore(),
                new GenericCaptchaEngine(
                        new GimpyFactory[]{new GimpyFactory(
                                new RandomWordGenerator("123456789ABCDEFGHIJKLMOPQRSTUVWXYZ"),
                                new ComposedWordToImage(
                                        //设置字体大小
                                        new RandomFontGenerator(40, 40, new Font[]{new Font("Arial", 40, 40)}),
                                        //前两个参数设置图片的长度以及宽度
                                        new GradientBackgroundGenerator(320, 80, new SingleColorGenerator(new Color(192, 192, 192)), new SingleColorGenerator(new Color(200, 250, 200))),
                                        new NonLinearTextPaster(6, 8, new Color(11, 11, 11))
                                )
                        )}
                ),
                180,
                180000,
                20000
        );
    
    
    private CaptchaServiceUtil() {
    }
    
    public static ImageCaptchaService getInstance(){
        return imageCaptchaService;
    }
}
