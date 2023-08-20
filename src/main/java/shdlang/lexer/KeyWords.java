package shdlang.lexer;

import java.util.HashMap;
import java.util.Map;

import static shdlang.lexer.TokenType.*;


public class KeyWords {
    private static final Map<String, TokenType> keywords = new HashMap<>();
    public static TokenType get(String key){
        return keywords.get(key);
    }
    static {
        keywords.put("and", AND);
        keywords.put("class", CLASS);
        keywords.put("else", ELSE);
        keywords.put("false", FALSE);
        keywords.put("for", FOR);
        keywords.put("fun", FUN);
        keywords.put("if", IF);
        keywords.put("nil", NIL);
        keywords.put("or", OR);
        keywords.put("print", PRINT);
        keywords.put("return", RETURN);
        keywords.put("super", SUPER);
        keywords.put("this", THIS);
        keywords.put("true", TRUE);
        keywords.put("var", VAR);
        keywords.put("while", WHILE);
    }
}
