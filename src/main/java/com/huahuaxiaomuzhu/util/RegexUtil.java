package com.huahuaxiaomuzhu.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexUtil {
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
