package com.generalthink.v2ex.web.controller;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generalthink.v2ex.web.utils.CaptchaServiceUtil;

/**
 * 用于验证码处理
 * @author TKing
 *
 */
@Controller
@RequestMapping("/captcha")
public class CaptchaController {


    @RequestMapping(value = "/code")
    public void getJCaptchaImage(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        BufferedImage bi = CaptchaServiceUtil.getInstance().getImageChallengeForID(request.getSession(true)
                .getId());
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }
    
    
    
}
