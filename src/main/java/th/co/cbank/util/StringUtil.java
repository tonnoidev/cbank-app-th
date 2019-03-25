package th.co.cbank.util;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.log4j.Logger;

public class StringUtil {
    private final Logger logger = Logger.getLogger(StringUtil.class);

    public static String getString(String inputData) {
        if (inputData == null || "".equals(inputData.trim())) {
            return "";
        } else {
            return inputData;
        }
    }

    public static String getTrimString(String inputData) {
        if (inputData == null || "".equals(inputData.trim())) {
            return "";
        } else {
            return inputData.trim();
        }
    }

    public static boolean isEmpty(Object data) {
        if (data == null || "".equals(data) || " ".equals(data) || "null".equals(data)) {
            return true;
        }
        return false;
    }

    public static String str2UTF8(String text) {
        try {
            return new String((text == null ? "" : text).getBytes("ISO8859_1"), "utf-8");
        } catch (Exception e) {
        }
        return "";
    }

    public static String unicode2ASCII(String unicode) {
        if (unicode == null) {
            unicode = "";
        }

        StringBuilder ascii = new StringBuilder(unicode);
        int code;
        for (int i = 0; i < unicode.length(); i++) {
            code = (int) unicode.charAt(i);
            if ((0xE01 <= code) && (code <= 0xE5B)) {
                ascii.setCharAt(i, (char) (code - 0xD60));
            }
        }
        return ascii.toString();
    }

    public static String ascii2Unicode(String ascii) {
        if (ascii == null) {
            ascii = "";
        }

        StringBuilder unicode = new StringBuilder(ascii);
        int code;
        for (int i = 0; i < ascii.length(); i++) {
            code = (int) ascii.charAt(i);
            if ((0xA1 <= code) && (code <= 0xFB)) {
                unicode.setCharAt(i, (char) (code + 0xD60));
            }
        }
        return unicode.toString();
    }

    public static String nulltoString(String str) {
        String result = "";
        if (!isEmpty(str)) {
            result = str;
        }
        return result;
    }

    public static String arrayForInQueryString(String[] a) {
        if (a != null) {
            StringBuilder result = new StringBuilder();
            if (a.length > 0) {
                result.append("'" + a[0]);
                for (int i = 1; i < a.length; i++) {
                    result.append("','");
                    result.append(a[i]);
                }
                result.append("'");
            }
            return result.toString();
        }
        return null;
    }

    public static boolean isNotNullString(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        return true;
    }

    public static String ifBlank(String inputData, String outputData) {
        if (inputData == null || "".equals(inputData.trim())) {
            return outputData;
        } else {
            return inputData;
        }
    }

    public static String formatNumberInterest(String num, String pattern) {
        String resultData = "";
        if (num != null && num.trim().length() > 0) {
            if (num.contains(",")) {
                num = num.replaceAll(",", "");
            }
            BigDecimal numBig = new BigDecimal(num);
            resultData = formatNumber(numBig, pattern);
        }
        return resultData;
    }

    public static String formatNumber(BigDecimal num, String pattern) {
        String resultData = "";
        try {
            if (num != null && isNotNullString(pattern)) {
                DecimalFormat dc = new DecimalFormat();
                dc.applyPattern(pattern);
                resultData = dc.format(num.doubleValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultData;
    }

    public static String toXML(Object o) throws JAXBException, UnsupportedEncodingException {
        String xmlDoc;

        JAXBContext xjbCtx = JAXBContext.newInstance(o.getClass());
        Marshaller marshaller = xjbCtx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        marshaller.marshal(o, bos);
        xmlDoc = new String(bos.toByteArray(), "UTF-8");

        return xmlDoc;
    }

    public static String trimDoubleQuoteCSV(String data) throws Exception {
        String newData = null;
        if (isNotNullString(data)) {
            newData = data.replaceAll("\"", "");
        }
        return newData;
    }

    public static String subStringUserId(String userId, int maxlength) throws Exception {
        int index = userId.indexOf("\\") + 1;
        userId = userId.substring(index);
        if (userId.length() > maxlength) {
            userId = userId.substring(0, maxlength);
        }
        return userId;
    }

    public static BigDecimal toBigDecimal(String str, BigDecimal defalutValue) {
        try {
            return new BigDecimal(str);
        } catch (Exception e) {
            return defalutValue;
        }
    }

    public static Boolean isNumber(String str) {
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getStringNoCharacter(String t, char argChar) {
        if (t != null) {
            StringBuilder buf = new StringBuilder();
            char c;
            boolean found;
            for (int i = 0; i < t.length(); i++) {
                c = t.charAt(i);
                if (c == argChar) {
                    found = true;
                } else {
                    found = false;
                }
                if (!found) {
                    buf.append(c);
                }
            }
            if ("".equals(buf.toString())) {
                t = null;
            } else {
                t = getString(buf.toString());
            }
        }

        return t;
    }

    public static String padLeftZeroIntToStr(int numberPadLeft, int arg) {
        String zero = "0";
        String format = "";
        String result = null;
        if (numberPadLeft > 1) {
            for (int i = 0; i < numberPadLeft; i++) {
                format = format.concat(zero);
            }
        } else {
            format = zero;
        }
        if (isNotNullString(format)) {
            DecimalFormat objDecimalFormat = new DecimalFormat(format);
            result = objDecimalFormat.format(new BigDecimal(arg));
        }
        return result;
    }

    public static String leftPad(String s, int width, char word) {
        if (s != null && !"".equals(s)) {
            return String.format("%" + width + "s", s).replace(' ', word);
        } else {
            return null;
        }
    }

    public static String leftPad(BigDecimal s, int width, char word) {
        if (s != null) {
            return String.format("%" + width + "s", s).replace(' ', word);
        } else {
            return null;
        }
    }

    public static String convertNumberToMillionBahtThai(BigDecimal amount) {
        String bahtTxt, n, bahtTH = "";

        try {
            amount = amount.divide(new BigDecimal("1000000"));
            DecimalFormat df = new DecimalFormat("###0");
            bahtTxt = df.format(amount);
            System.out.println(bahtTxt);
            String[] num = {"ศูนย์", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า", "สิบ"};
            String[] rank = {"", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};
            String intVal = bahtTxt;

            if (intVal.equals("0")) {
                bahtTH = "ศูนย์";
            } else if (intVal.equals("1")) {
                bahtTH = "หนึ่ง";
            } else {
                String lastOne = "เอ็ด";
                String twoPrefix = "ยี่";
                for (int i = 0; i < intVal.length(); i++) {
                    n = intVal.substring(i, i + 1);
                    if (!n.equals("0")) {
                        if ((i == (intVal.length() - 1)) && (n.equals("1"))) {
                            bahtTH += lastOne;
                        } else if ((i == (intVal.length() - 2)) && (n.equals("2"))) {
                            bahtTH += twoPrefix;
                        } else if ((i == (intVal.length() - 2)) && (n.equals("1"))) {
                            bahtTH += "";
                        } else {
                            bahtTH += num[Integer.parseInt(n)];
                        }
                        bahtTH += rank[(intVal.length() - i) - 1];
                    }
                }
            }
            bahtTH += "ล้านบาทถ้วน";

        } catch (RuntimeException r) {
            throw r;
        } catch (Exception exe) {
            System.out.print(exe.getMessage());
        }
        return bahtTH;

    }

    public static ClassLoader getCurrentLoader(Object fallbackClass) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = fallbackClass.getClass().getClassLoader();
        }
        return loader;
    }
}
