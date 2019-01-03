package com.cjj.designpattern.creator.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenjj on 2018/12/21
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename=title+".hmtl";
        try {
            writer=new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>"+str+"</p>");

    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for(int i=0;i<items.length;i++){
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");

    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();

    }
    public String getResult(){
        return filename;
    }
}
