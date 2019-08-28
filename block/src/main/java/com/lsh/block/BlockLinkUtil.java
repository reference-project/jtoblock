package com.lsh.block;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * @知识星球  火星架构
 * @website https://www.fireflyi.com
 * @date 2019/8/27
 * DESC TODO
 */
public class BlockLinkUtil {

    /**
     * 检验区块链每个节点是否被修改
     * @param blockLink
     * @return
     */
    public static boolean checkBlockLink(ArrayList<Block> blockLink){
        int l = blockLink.size()-1;
        for (int k=0; k< l; k++) {
            Block curBlock = blockLink.get(k+1);
            if(!curBlock.sign.equals(curBlock.createSign())){
                return false;
            }
            Block preBlock = blockLink.get(k);
            if(!preBlock.sign.equals(curBlock.preSign)){
                return false;
            }
        }
        return true;
    }


    /**
     * 利用java原生的类实现SHA256加密
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256(String str) {
        MessageDigest messageDigest;
        String encodestr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            encodestr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodestr;
    }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                // 1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

}
