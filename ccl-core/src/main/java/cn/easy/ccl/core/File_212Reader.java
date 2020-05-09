package cn.easy.ccl.core;

import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;

/**
 * @ClassName: File_212Reader <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/5/8 2:34 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public class File_212Reader {

    private static byte[] oneLine = new byte[]{
            0x21,
            0x53,
            0x03,
            0x00,
            0x02,
            0x36,
            0x20,
            0x20,
            0x05,
            0x07,
            0x17,
            0x38,
            0x13,
            (byte) 0xff,
            0x2e,
            0x32
    };

    public static void main(String[] args) {
        System.err.println(oneLine.length * 8);
        StringBuffer stringBuffer = new StringBuffer(128);
        for (byte oneByte : oneLine) {
            String oneByteString = Integer.toBinaryString(oneByte & 0xff);
            if (oneByteString.length() < 8) {
                stringBuffer.append(StringUtils.leftPad(oneByteString, 8, "0"));
                System.out.printf(oneByteString + "->" + StringUtils.leftPad(oneByteString, 8, "0") + "\n");
            } else {
                stringBuffer.append(oneByteString);
                System.out.printf(oneByteString + "->" + oneByteString + "\n");
            }

        }
        System.err.println("位数:" + stringBuffer.length() + "\n内容:" + stringBuffer.toString());
    }

}
