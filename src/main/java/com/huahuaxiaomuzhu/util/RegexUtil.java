package com.huahuaxiaomuzhu.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 正则匹配.
 * @see com.huahuaxiaomuzhu.ui.listener.RegexListener
 */
public class RegexUtil {
    /**
     * 通过给定的文本和匹配的字符串进行正则匹配.
     * @param rawText 被匹配的文本.
     * @param regex 正则表达式.
     * @return 匹配结果.
     */
    public static String getRegexResult(String rawText,String regex){
        if (regex.equals("")){
            return "";
        }
        try {
            Pattern p= Pattern.compile(regex);
            Matcher matcher=p.matcher(rawText);
            String result=new String();
            int count=0;
            while (matcher.find()){
                result+=matcher.group()+"\n";
                count+=1;
            }
            result="共找到"+count+"处匹配:\n"+result;
            return result;
        }catch (PatternSyntaxException e){
            return "语法有问题，请检查语法";
        }

    }
}
