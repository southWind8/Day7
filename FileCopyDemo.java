package Day7;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.channels.FileLockInterruptionException;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/26
 **/

public class FileCopyDemo {
    public static void main(String []args) throws IOException{
        //创建一个文件File对象，注意需要显示抛出异常（IOException是编译异常）
        //可以用try catch 捕获，也可以在方法签名处使用throws抛出
        File inputFile =new File("/86139/IdeaProjects/untitled-1/fang fa/src/Day7");
        //创建一个字节输入流，此处有向上转型对象
        InputStream is =new FileInputStream(inputFile);
        //准备和文件一样大小的字节数组
        byte[] b=new byte[(int) inputFile.length()];
        //通过字节输入流将文件读入数组
        is.read(b);
        //准备文件输入对象
        File outputFile =new File("/86139/IdeaProjects/untitled-1/fang fa/src/Day7");
        //准备输入流
        OutputStream os =new FileOutputStream(outputFile);
        //通过字节输出流将数组b的内容写到目标文件中
        os.write(b);
        //关闭流
        is.close();
        os.close();
    }
}
