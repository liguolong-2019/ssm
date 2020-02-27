package com.ssm.Until;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class createPDF {
    public static Boolean createPdfFromTemplate(String templateFile, String targetFile, Map<String, String> fieldMap) {
        Boolean retValue = false;
        try {
            /* 打开已经定义好字段以后的pdf模板 */
            com.itextpdf.text.pdf.PdfReader reader = new com.itextpdf.text.pdf.PdfReader(templateFile);
            /* 将要生成的目标PDF文件名称 */
            PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(targetFile));
            PdfContentByte under = stamp.getUnderContent(1);
            /* 使用中文字体 */
            BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
            Font fontChinese = new Font(bf, 12, Font.NORMAL);

            /* 取出报表模板中的所有字段 */
            AcroFields form = stamp.getAcroFields();
            form.addSubstitutionFont(bf);

            /* 为字段赋值,注意字段名称是区分大小写的 */
            for (String key : fieldMap.keySet()) {
                form.setField(key, fieldMap.get(key));
            }
            stamp.setFormFlattening(true);
            stamp.close();
            reader.close();
            retValue = true;
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            return retValue;
        }

    }
}
