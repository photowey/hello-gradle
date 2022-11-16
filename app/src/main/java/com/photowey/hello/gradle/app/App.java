/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.photowey.hello.gradle.app;

import com.photowey.hello.gradle.list.LinkedList;
import com.photowey.hello.gradle.utilities.StringUtils;
import org.apache.commons.text.WordUtils;

public class App {

    public static void main(String[] args) {
        LinkedList tokens = StringUtils.split(MessageUtils.getMessage());
        String result = StringUtils.join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
