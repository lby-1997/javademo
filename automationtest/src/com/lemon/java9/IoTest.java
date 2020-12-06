package com.lemon.java9;

/**
 * 按照校色不同分为：
 * 抽象基类     节点流        处理流
 * 输入流      InputStream   Reader
 * 输出流      OutputStream  Writer
 *          字节输入流           字节输出流                字符输入流          字符输出流
 *抽象基类： inputStream         |OutputStream           \Reader             Writer
 *访问文件： FileInputStream     |FileOutputStream       \FileReader         FileWriter
 *访问数组：ByteArrayInputStream |ByteArrayOutputStream  \ByteArrayReader     ByteArrayWriter
 *访问管道：PipedInputStream     |PipedOutputStream      \PipedReader        PipedWriter
 *访问字符串：                   |                       \StringReadder      StringWriter
 *缓冲流：BufferedInputStream(read(byte[] buffer))     |BufferedOuputStream (write(byte[] buffer,0,len))   \BufferedReader(read(char[] cbuf))       BuggeredWriter(write(char[] cbuf,0,len))
 *转换流：                       |                       \InputStreamReader  OutputStreamWriter
 *对象流：ObjcetInputStream      |ObjectOutpuStream      \
 *字节流(或文件流) FilerInputStream(read(byte[] buffer))         |FilterOutputStream(write(byte[] buffer,0,len))       \FiterReader(read(char[] cbuf))       FilterWriter(write(char[] cbuf,0,len))
 *打印流：                       |PrintStream             \                  PrintWriter
 *推回输入流：PushbackInputStream|                        \PustbackReader
 *特殊流：DataInputStream        |DataOutputStream
 *  @author shkstart
 * @create 2020--12--03--12:32
 */

public class IoTest {

}
