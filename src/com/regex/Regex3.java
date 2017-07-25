package com.regex;

import java.util.regex.Pattern;

public class Regex3 {
public static void main(String[] args) {
	System.out.println(Pattern.matches("[657][0-9]\\d{11}", "609245806222"));
}
}
